package com.xiaobai.sendEmail;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * @paogram: com.xiaobai.sendEmail
 * @description: a send E-Mail main funtion
 * @author: CodeXiaoBai
 * @createDate: 2022-08-01
 */

public class SendEmail {
    public static void main(String[] args) {
        // 收件人电子邮箱
        String to = "836056071@qq.com";

        // 发件人电子邮箱
        String from = "836056071@qq.com";

        // 指定发送邮件的主机为 smtp.qq.com
        String host = "smtp.qq.com";

        // 获取系统属性
        Properties properties = System.getProperties();

        // 设置邮箱服务器
        properties.setProperty("mail.smtp.host", host);
        properties.setProperty("mail.smtp.port", "25");
        properties.put("mail.stmp.auth", "true");

        // 获取默认session对象
        Session session = Session.getDefaultInstance(properties, new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("836056071@qq.com", "uokcxabbaamjbfcb");
            }
        });

        try {
            // 创建默认的 MimeMessage 对象
            MimeMessage message = new MimeMessage(session);

            // Set From: 头部头字段
            message.setFrom(new InternetAddress(from));

            // Set From: 头部头字段
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // Set Subject: 头部头字段
            message.setSubject("This is the Subject Line!");

            // 设置消息体
            message.setText("This is actual message");

            // 发送消息
            Transport.send(message);
            System.out.println("Send message successfully...");
        }catch (MessagingException messagingException) {
            messagingException.printStackTrace();
        }
    }
}
