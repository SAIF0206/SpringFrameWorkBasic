package com.springtutorial.spring.controllers;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;

import com.springtutorial.spring.mail.SmtpMailSender;

@Configuration
public class MailConfig {
	
	
	@Bean
	@ConditionalOnProperty("spring.mail.host")
	public MailSender smtpMailSender(JavaMailSender javaMailSender) {
		
		return new SmtpMailSender(javaMailSender);
	}
}