package com.codekul.Aug24Batch.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PushNotification  {


    @Bean
    public NotificationManager notificationManager(){
        return new NotificationManager();
    }


}
