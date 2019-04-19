package com.ezappx.designer.mobileproject.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.converter.MappingJackson2MessageConverter;
import org.springframework.messaging.converter.MessageConverter;

@Configuration
@Slf4j
public class MQConfig {
    public static final String ROUTE_DEFAULT = "default";
    public static final String BUILDER_RESULT_MQ = "mobile.builder.result.mq";
    public static final String BUILDER_RESULT_EXCHANGE = "mobile.builder.result.ex";

    @Bean
    public MessageConverter jsonMessageConverter() {
        return new MappingJackson2MessageConverter();
    }
}
