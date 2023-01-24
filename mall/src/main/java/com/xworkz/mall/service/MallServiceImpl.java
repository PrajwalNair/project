package com.xworkz.mall.service;

import static com.xworkz.mall.logger.Loggers.getLogger;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Properties;
import java.util.Random;
import java.util.logging.Logger;

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
	private Logger logger = getLogger();

	

	@Override
	public AdminDTO findByNameAndPassword(String name, String password) {
		logger.info("find by name and password method is running in service");
		AdminDTO findByNameAndPassword = repository.findByNameAndPassword(name, encryption(password, 8));

		if (findByNameAndPassword != null) {
			int loginCount = findByNameAndPassword.getLoginCount();
			loginCount++;
			findByNameAndPassword.setLoginCount(loginCount);
			repository.updateLoginCountByName(name, findByNameAndPassword.getLoginCount());
			if (findByNameAndPassword.getFirstLogin() < 1) {
				int countFirstLogin = findByNameAndPassword.getFirstLogin();
				countFirstLogin++;
				System.out.println(countFirstLogin);
				findByNameAndPassword.setFirstLogin(countFirstLogin);
				repository.updateFirstLoginByName(name, findByNameAndPassword.getFirstLogin());
				logger.info(findByNameAndPassword + " ---------------");
				logger.info("entering first login");
				findByNameAndPassword.setGeneratedPassword(generatedPassword(8));
				logger.info("====================" + generatedPassword(8));
				repository.updateGeneratedPasswordByName(name, findByNameAndPassword.getGeneratedPassword());
				String mallEmail = findByNameAndPassword.getMallEmail();
				String generatedPassword = findByNameAndPassword.getGeneratedPassword();
				sendMail(mallEmail, generatedPassword);
				logger.info("mail is sent for first time password");
				return findByNameAndPassword;
			}
			System.out.println("login is successfull");
			return findByNameAndPassword;
		} else {
			int count1 = 0;
			AdminDTO findByName = repository.findByName(name);
			if (findByName != null) {
				count1 = findByName.getNoOfWrongAttempts();
				logger.info("checking the count before ++ " + count1);
			}
			if (count1 < 3) {
				count1++;
				logger.info("checking the count after ++" + count1);
				logger.info("update the wrong attempts");
				repository.updateNoOfWrongAttemptsByName(name, count1);
			}
			if (count1 >= 3) {
				logger.info("if count is greater than 3 than locking the account ");
				findByName.setAccountLocked("locked");
				repository.updateAccountLockedByName(name, findByName.getAccountLocked());
			}
		}
		return null;
	}

	@Override
	public boolean sendMail(String email, String passwordGenerated) {

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
			message.setSubject("Change Password");
			message.setText(
					"Hi this is the generated password for first time login please change the password after one time login"
							+ "\n" + passwordGenerated);

			Transport.send(message);

			logger.info("Done");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}

		return true;
	}

	public String generatedPassword(int length) {

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
		logger.info("................." + password);
		String string = password.toString();

		return string;
	}

	@Override
	public AdminDTO findByName(String name) {

		return repository.findByName(name);
	}

	@Override
	public AdminDTO updatePasswordByGeneratedPassword(String generatedPassword, String password) {
		AdminDTO findByGeneratedPassword = repository.findByGeneratedPassword(generatedPassword);
		if (findByGeneratedPassword.getActive() == 1) {
			LocalTime time = findByGeneratedPassword.getTime();
			LocalTime now = LocalTime.now();
			findByGeneratedPassword.setGeneratedPasswordTime(now);
			repository.updateGeneratedPasswordTimeByGeneratedPassword(generatedPassword,
					findByGeneratedPassword.getGeneratedPasswordTime());
			System.out.println(now);
			Duration between = Duration.between(findByGeneratedPassword.getTime(),
					findByGeneratedPassword.getGeneratedPasswordTime());
			long minutes = between.toMinutes();

			if (minutes <= 1) {

				if (findByGeneratedPassword.getAccountLocked().equals("locked")
						& findByGeneratedPassword.getNoOfWrongAttempts() < 4) {
					findByGeneratedPassword.setAccountLocked("unlocked");
					findByGeneratedPassword.setNoOfWrongAttempts(0);
					repository.updateNoOfWrongAttemptsByMallName(findByGeneratedPassword.getMallName(),
							findByGeneratedPassword.getNoOfWrongAttempts());
					repository.updateAcountUnlockByName(findByGeneratedPassword.getMallName(),
							findByGeneratedPassword.getAccountLocked());
					return repository.updatePasswordByGeneratedPassword(generatedPassword, encryption(password, 8));
				}

			}

		} else {
			if (findByGeneratedPassword.getActive()==0) {
				findByGeneratedPassword.setAccountLocked("unlocked");
				findByGeneratedPassword.setNoOfWrongAttempts(0);
				findByGeneratedPassword.setActive(1);
				repository.updateNoOfWrongAttemptsByMallName(findByGeneratedPassword.getMallName(),
						findByGeneratedPassword.getNoOfWrongAttempts());
				repository.updateAcountUnlockByName(findByGeneratedPassword.getMallName(),
						findByGeneratedPassword.getAccountLocked());
				repository.updateActiveByGeneratedPassword(findByGeneratedPassword.getGeneratedPassword(),
						findByGeneratedPassword.getActive());
				return repository.updatePasswordByGeneratedPassword(generatedPassword, encryption(password, 8));
			}
		}
		return null;
	}

	@Override
	public AdminDTO findByMallName(String mallName) {
		AdminDTO findByMallName = repository.findByMallName(mallName);
		if (findByMallName != null) {
			findByMallName.setGeneratedPassword(generatedPassword(8));
			LocalTime now2 = LocalTime.now();
			findByMallName.setTime(now2);
			System.out.println(now2);
			repository.updateTimeByMallName(mallName, findByMallName.getTime());
			repository.updateGeneratedPasswordByMallName(mallName, findByMallName.getGeneratedPassword());
			sendMail(findByMallName.getMallEmail(), findByMallName.getGeneratedPassword());// mail
		}
		return null;
	}

	public static String encryption(String value, int secretKey) {
		String encrypt = "";
		for (int i = 0; i < value.length(); i++) {
			char ch = value.charAt(i);
			ch += secretKey;
			encrypt = encrypt + ch;
		}
		return encrypt;

	}

	public static String decryption(String encrypt, int secretKey) {
		String decrypt = "";
		for (int i = 0; i < encrypt.length(); i++) {
			char ch = encrypt.charAt(i);
			ch -= secretKey;
			decrypt = decrypt + ch;
		}
		return decrypt;
	}

	@Override
	public AdminDTO updateAcountUnlockByName(String name, String status) {
		// TODO Auto-generated method stub
		return repository.updateAccountLockedByName(name, status);
	}

	@Override
	public AdminDTO updateActiveByGeneratedPassword(String generatedPassword, int active) {
		System.out.println("update active method is running in the service method");

		return repository.updateActiveByGeneratedPassword(generatedPassword, active);

	}

	@Override
	public AdminDTO findByGeneratedPassword(String password) {
		System.out.println("Find by generated password method is running in service method");
		return repository.findByGeneratedPassword(password);
	}

	@Override
	public AdminDTO findByPassword(String password) {
		System.out.println("find by password method is running in service");
		return repository.findByPassword(password);
	}

//	public static String encrypt(String password) {
//		byte[] encodes = Base64.getEncoder().encode(password.getBytes());
//		System.out.println("encrypted password " + encodes.toString());
//		return encodes.toString();
//	}
//
//	public static String decrypt(String password) {
//		byte[] decode = Base64.getDecoder().decode(password.getBytes());
//
//		System.out.println("encrypted password " + decode.toString());
//		return decode.toString();
//	}

//	@Override
//	public boolean validateAndSave(AdminDTO dto) {
//		System.out.println("validate and save method is running in service");
//		return repository.save(dto);
//	}

}
