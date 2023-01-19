package com.xworkz.mall.service;

import java.util.List;
import java.util.Properties;
import java.util.Set;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.mall.dto.CustomerFeedBackDetailsDTO;
import com.xworkz.mall.dto.CustomerPersonalDetailsDTO;
import com.xworkz.mall.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepository repository;

	@Override
	public boolean validateAndSave(CustomerPersonalDetailsDTO dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<CustomerPersonalDetailsDTO>> validate = validator.validate(dto);
		if (validate.size() > 0) {
			System.out.println("please fix the errors");
		} else {
			System.out.println("data is valid and saved");
			repository.save(dto);
			sendMail(dto.getEmail());
			System.out.println("The mail is sent to the customer");
		}
		return true;
	}

	@Override
	public List<CustomerPersonalDetailsDTO> findByName(String name) {
		
		return repository.findByName(name);
	}
	
	@Override
	public boolean findByEmail(String email) {
		List<CustomerPersonalDetailsDTO> findByEmail = repository.findByEmail(email);
		if(findByEmail!=null) {
			return false;
		}else {
			return true;
		}
		
	}

	@Override
	public boolean findByMobileNo(long mobileNo) {
		List<CustomerPersonalDetailsDTO> findByMobileNo = repository.findByMobileNo(mobileNo);
		if(findByMobileNo!=null) {
			return false;
		}else {
			return true;
		}
	}
	
	@Override
	public boolean sendMail(String email) {

		final String username = "prajwalnair143@outlook.com"; // like yourname@outlook.com
		final String password = "prajwal@143"; // password here

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp-mail.outlook.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});
		session.setDebug(true);

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(username));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email)); // like
																							// inzi769@gmail.com
			message.setSubject("Feedback Confirmation");
			message.setText(
					"Thankyou for giving your feedback. have a nice day");

			Transport.send(message);

			System.out.println("Done");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}

		return true;
	}
	

//	@Override
//	public boolean validateAndSave(CustomerFeedBackDetailsDTO dto) {
//		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
//		Validator validator = factory.getValidator();
//		Set<ConstraintViolation<CustomerFeedBackDetailsDTO>> validate = validator.validate(dto);
//		if (validate.size() > 0) {
//			System.out.println("please fix the errors");
//		} else {
//			System.out.println("data is valid and saved");
//			repository.save(dto);
//		}
//		return true;
//	}

}
