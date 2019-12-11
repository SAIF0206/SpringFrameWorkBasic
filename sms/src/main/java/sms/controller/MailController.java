package sms.controller;

import javax.mail.MessagingException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sms.mail.MailSender;



@Controller
public class MailController {
	
	private MailSender mailSender;

	public MailController(MailSender smtp) {
		this.mailSender = smtp;
	}

	@RequestMapping("/mail")
	public String mail() throws MessagingException {
		
		//mailSender.send("zhaomin19961031@gmail.com", "Enrolment Request:<enrollmentid> submitted by <studentid>", "<DD/MM/YYYY, HH:MM> Enrolment Request:<enrollmentid> Submitted by:<studentid> Course applied:<coursecode>");
		
		mailSender.send("zhaomin19961031@gmail.com", "Enrolment Request submitted", "Please check system to approve/reject enrollment request.");
		
		return "MailConfirmation";
	}
}
