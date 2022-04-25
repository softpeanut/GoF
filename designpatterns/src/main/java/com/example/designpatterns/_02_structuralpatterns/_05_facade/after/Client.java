package com.example.designpatterns._02_structuralpatterns._05_facade.after;

public class Client {

    public static void main(String[] args) {
        EmailSettings emailSettings = new EmailSettings();
        emailSettings.setHost("127.0.0.1");

        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setFrom("beomjin");
        emailMessage.setTo("softpeanut");
        emailMessage.setSubject("Test Mail from Java Program");
        emailMessage.setText("message");

        EmailSender emailSender = new EmailSender(emailSettings);
        emailSender.sendEmail(emailMessage);
    }
}
