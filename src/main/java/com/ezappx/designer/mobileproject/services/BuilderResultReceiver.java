package com.ezappx.designer.mobileproject.services;


import com.ezappx.designer.mobileproject.config.MQConfig;
import com.ezappx.common.MobileBuilderResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BuilderResultReceiver {
    @RabbitListener(queues = MQConfig.BUILDER_RESULT_MQ)
    public void receiveDefault(MobileBuilderResult result) {
        log.debug("receive: {}", result);
    }
}
