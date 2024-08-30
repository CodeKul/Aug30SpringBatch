package com.codekul.Aug24Batch.ioc;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Primary
public class SmsNotification implements NotificationService{
    SmsNotification(){
        System.out.println("SMS const");
    }
    @Override
    public void sendNotification(String message) {
        System.out.println("SMS notification "+message);
    }
}
