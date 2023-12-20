package com.berrymail.services;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.berrymail.entities.Mail;
import com.berrymail.entities.MailBuilder;

import com.berrymail.entities.MailBuilderIF;
import com.berrymail.entities.MailDirector;

import java.util.Date;

public class MailService {
    MailBuilderIF mailBuilder = new MailBuilder();
    MailDirector mailDir = new MailDirector(mailBuilder);
    public Mail createMail(String id, String from, String to, String subject, String body, Date dateNtime, String priority, String attachment){
        mailDir.constructMail(id, from, to,subject, body, dateNtime, priority, attachment);
        return mailDir.getMail();
    }
    public void saveMailToJSONFile(){

    }

}
