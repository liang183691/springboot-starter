package com.liang.framework.springmqstarter.config;

import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(RabbitMqProperties.class)
public class RabbitMqAutoConfig {

    @Autowired
    private RabbitMqProperties rabbitMqProperties;

    @Bean
    @ConditionalOnMissingBean
    public ConnectionFactory connectionFactory() {
        CachingConnectionFactory cachingConnectionFactory = new CachingConnectionFactory();
        cachingConnectionFactory.setHost(rabbitMqProperties.getHost());
        cachingConnectionFactory.setUsername(rabbitMqProperties.getUsername());
        cachingConnectionFactory.setPassword(rabbitMqProperties.getPassword());
        cachingConnectionFactory.setPort(rabbitMqProperties.getPort());
        //cachingConnectionFactory.setPublisherConfirms(rabbitMqProperties.isConfirms());
        return cachingConnectionFactory;
    }


}