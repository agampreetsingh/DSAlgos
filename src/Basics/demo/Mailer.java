package Basics.demo;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;

import org.apache.log4j.Logger;
import org.springframework.mail.javamail.MimeMessagePreparator;
class Mailer{
	private static Logger logger = Logger.getLogger(EmailServiceImpl.class);
    public static void send(final String from,final String password,String to,String sub,String msg,String filename, MimeMessagePreparator preparator){
          //Get properties object
          Properties props = new Properties();
          props.put("mail.smtp.host", "smtp.gmail.com");
          props.put("mail.smtp.socketFactory.port", "587");
          props.put("mail.smtp.socketFactory.class",
                    "javax.net.ssl.SSLSocketFactory");
          props.put("mail.smtp.auth", "true");
          props.put("mail.smtp.port", "465");
          //get Session
          Session session = Session.getDefaultInstance(props,
           new javax.mail.Authenticator() {
           protected PasswordAuthentication getPasswordAuthentication() {
           return new PasswordAuthentication(from,password);
           }
          });
          //compose message
          try {
           MimeMessage message = new MimeMessage(session);
           message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
           message.setSubject(sub);
           message.setText(msg);
           //3) create MimeBodyPart object and set your message text
           BodyPart messageBodyPart1 = new MimeBodyPart();
           messageBodyPart1.setText(msg);

           //4) create new MimeBodyPart object and set DataHandler object to this object
           MimeBodyPart messageBodyPart2 = new MimeBodyPart();

           String bundlePdf = filename;
           DataSource source = new FileDataSource(filename);
           messageBodyPart2.setDataHandler(new DataHandler(source));
           messageBodyPart2.setFileName(filename);


           //5) create Multipart object and add MimeBodyPart objects to this object
           Multipart multipart = new MimeMultipart();
           multipart.addBodyPart(messageBodyPart1);
           multipart.addBodyPart(messageBodyPart2);

           //6) set the multiplart object to the message object
           message.setContent(multipart );

           //send message
           Transport.send(message);
           logger.debug("Successfully sent email to: " + to + ", from address: " + from + ", subject "
   				+ sub +  ", attachment File Name " + filename);
          } catch (MessagingException e) {
        	  logger.error("Failed to send email to: " + to + ", from address: " + from + ", subject "
         				+ sub +  ", attachment File Name " + filename);
        	  	throw new RuntimeException(e);
        	  }

    }
}