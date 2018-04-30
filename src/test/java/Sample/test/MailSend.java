package Sample.test;



import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 * @author pkanchi
 *
 */
public final class MailSend {
	
	/**
	 * This method is for sendEmailReport.
	 * 
	 * @throws Exception
	 */
	public void sendEmailReport(String mailContent) throws Exception {
		sendEmailReport(mailContent, "emailable-report.html");
	}

	/**
	 * This method is to sendEmailReport
	 * @param mailContent
	 * @param reportFile
	 * @throws Exception
	 */
	public void sendEmailReport(String mailContent, String reportFile) throws Exception {
		// Read Config properties
		
		Properties prop = readMailPropertiesFile();
		
		String reportHtml = getEmailReportFile(reportFile);
		File reportHtmlFile = new File(reportHtml);
		//synchronized(this) {
			for (int index = 0; index < 10; index ++) {
				if (!reportHtmlFile.exists()) {
					try {
						Thread.sleep(3000);
						System.out.println("EMAILABLE REPORT HTML NOT YET GENERATED");
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				} else {
					break;
				}
			}
		//} //synchronized

		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(prop.getProperty(
				"dateformat", "MM.dd.yyyy kk:mm"));

		Properties mailProp = System.getProperties();
		mailProp.setProperty("mail.smtp.host", prop.getProperty("smtphost"));
		Session session = Session.getDefaultInstance(mailProp);

		MimeMessage message = new MimeMessage(session);
		
		 // Create the message part 
        BodyPart messageBodyPart = new MimeBodyPart();

        // Fill the message - ("Email Report is attached")
        messageBodyPart.setText(mailContent);
        
        // Create a multipar message
        Multipart multipart = new MimeMultipart();

        // Set text message part
        multipart.addBodyPart(messageBodyPart);

        // Part two is attachment
        messageBodyPart = new MimeBodyPart();
        DataSource source = new FileDataSource(reportHtmlFile);
        messageBodyPart.setDataHandler(new DataHandler(source));
        messageBodyPart.setFileName(source.getName());
        multipart.addBodyPart(messageBodyPart);

        // Send the complete message parts
        message.setContent(multipart );
		
		
		
		String strSub = prop.getProperty("mailsubject") + " "
				+ sdf.format(c.getTime());
		System.out.println(strSub);
		message.setSubject(strSub);
		message.setFrom(new InternetAddress(prop.getProperty("from")));

		String[] to = getToAddress(prop);
		for (String toMail : to) {
			//debug(toMail);
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(
					toMail));
		}

		// Now set the actual message
		//message.setText("This is actual message");
		//message.setContent(mailContent, "text/html; charset=utf-8");
		// Send message
		Transport.send(message);
		System.out.println("Mail has been sent");
	}
	
	/**
	 * This method is to getEmailReportFile
	 * @param reportFile
	 * @return
	 */
	private String getEmailReportFile(String reportFile) {
		StringBuilder sb = new StringBuilder();
		sb.append(System.getProperty("user.dir"));
		sb.append(File.separator);
		sb.append("test-output");
		sb.append(File.separator);
		sb.append(reportFile);
		return sb.toString();

	}

	private Properties readMailPropertiesFile() {
		Properties prop = new Properties();
		prop.setProperty("mailsubject", "Email Report");
		prop.setProperty("from", "chaitra.hassanananda@capella.edu");
		prop.setProperty("smtphost", "smtphost");
		return prop;
	}

	/**
	 * This method is for main.
	 * 
	 * @param aArguments
	 * @throws IOException
	 */
	public static void main(String... aArguments) {
		MailSend emailer = new MailSend();
		// Calendar instance
		try {
			emailer.sendEmailReport("Email Report is attached");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @author pkanchi
	 * @Date Jan 22, 2016
	 * This method is for getToAddress.
	 * @param prop
	 * @return
	 */
	private String[] getToAddress(Properties prop) {
		String[] to = {"chaitra.athreya@gmail.com"};
		return to;
	}
	
}
