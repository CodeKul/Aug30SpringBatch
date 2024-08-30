package com.codekul.Aug24Batch.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NotificationManager {

    @Autowired
    private NotificationService notificationService;

//    NotificationManager(NotificationService notificationService){
//        this.notificationService = notificationService;
//    }

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notify(String message){
        notificationService.sendNotification(message);
    }

}
