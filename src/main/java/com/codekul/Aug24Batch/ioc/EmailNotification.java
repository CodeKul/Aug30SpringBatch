package com.codekul.Aug24Batch.ioc;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class EmailNotification implements NotificationService{

    EmailNotification(){
        System.out.println("Email const");
    }
    @Override
    public void sendNotification(String message) {
        System.out.println("Email notification "+message);
    }
}
