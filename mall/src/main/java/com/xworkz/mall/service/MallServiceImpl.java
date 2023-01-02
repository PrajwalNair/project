package com.xworkz.mall.service;

import java.util.List;
import java.util.Properties;
import java.util.Random;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.mall.dto.AdminDTO;
import com.xworkz.mall.repository.MallRepository;

@Service
public class MallServiceImpl implements MallService {
	@Autowired
	private MallRepository repository;
	int count = 0;
	int countFirstLogin = 0;

	@Override
	public AdminDTO findByNameAndPassword(String name, String password, AdminDTO dto) {
		System.out.println("find by name and password method is running in service");
		AdminDTO findByName = repository.findByName(name);
		if (findByName != null) {
			count = 0;
			
			repository.updateLoginStatus(name, countFirstLogin);
			repository.updateNoOfWrongAttempts(name, count);
			if (countFirstLogin <= 1) {
				AdminDTO findByNameAndPassword = repository.findByNameAndPassword(name, password);
				String mallEmail = findByNameAndPassword.getMallEmail();
				sendMail(mallEmail);
				countFirstLogin++;
			}
			return findByName;
		} else {
			count++;
		}
		if (count <= 3) {
			repository.findByNameAndPassword(name, password);
		}
		if (count > 3) {
			dto.setAccountLocked("locked");
			repository.updateAccountLocked(name, dto.getAccountLocked());
		}
		return findByName;
	}

	@Override
	public void updateNoOfWrongAttempts(String name, int noOfAttempts) {
		repository.updateNoOfWrongAttempts(name, noOfAttempts);
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
			message.setSubject("Login Password");
			message.setText(
					"Hi this is the temperory password for first time login please change the password after one time login"
							+ "\n" + generatedPassword(8));

			Transport.send(message);

			System.out.println("Done");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}

		return true;
	}

	public static char[] generatedPassword(int length) {

		String[] ref = { "ABCDEFGHIJKLMNOPRSTUVWXYZ", "abcdefghijklmnopqrstuvwxyz", "!@#$", "1234567890" };
		String combinedChars = ref[0] + ref[1] + ref[2] + ref[3];

		Random random = new Random();

		char[] password = new char[length];

		password[0] = ref[0].charAt(random.nextInt(ref[0].length()));
		password[1] = ref[1].charAt(random.nextInt(ref[1].length()));
		password[2] = ref[2].charAt(random.nextInt(ref[2].length()));
		password[3] = ref[3].charAt(random.nextInt(ref[3].length()));

		for (int i = 4; i < password.length; i++) {
			password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));

		}
		System.out.println(password);
		return password;
	}

	@Override
	public AdminDTO findByName(String name) {

		return repository.findByName(name);
	}

//	@Override
//	public boolean validateAndSave(AdminDTO dto) {
//		System.out.println("validate and save method is running in service");
//		return repository.save(dto);
//	}

}
