package Controller;

import java.util.HashSet;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
 
public class Email {
	
	
	public static void enviarEmail(String[] linha) {
		String mensagem = "";
		HashSet<String> hash = new HashSet<String>();
		String[] nLinhas;
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.autopass.com.br");
		props.put("mail.smtp.socketFactory.port", "25");
		props.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "25");
 
		Session session = Session.getDefaultInstance(props,
			new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication("ti_noc@autopass.com.br","");
				}
			});
 
		try {
 
			
			Message message = new MimeMessage(session);
			//message.setFrom(new InternetAddress("from@no-spam.com"));
			message.setFrom(new InternetAddress("ti_noc@autopass.com.br"));
			message.setRecipients(Message.RecipientType.TO,
					//InternetAddress.parse("to@no-spam.com"),
					InternetAddress.parse("ti_noc@autopass.com.br"));
			message.setSubject("Linhas Atualizadas");
			message.setText("");
			mensagem += "Senhores, \n\nSegue linhas para analise:\n\nLM_ID das Linhas: ";
			
			for (int i = 0 ; linha.length > i ; i++){
				if (linha[i] != null) {
					hash.add(linha[i]);
				}
			}
			
			nLinhas = new String[hash.size()];
			int j = 0;
			
			for (String dados : hash) {
				if (!dados.equals(null)) {
					nLinhas[j++] = dados.toString();
				}
			}
			
			
			for (int i = 0; nLinhas.length > i; i++ ) {
				if (nLinhas[i] != null){
					mensagem += nLinhas[i]+ ", ";
				}
			}
			
			mensagem += "\n\nAt.,\nNOC\n\n";
			
			message.setText(mensagem);
			//System.out.println("Message: "+mensagem);
			Transport.send(message);
 
			//System.out.println("Done");
 
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
}
