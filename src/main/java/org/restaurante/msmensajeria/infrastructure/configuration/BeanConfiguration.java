package org.restaurante.msmensajeria.infrastructure.configuration;

import org.restaurante.msmensajeria.domain.api.ITwilioServicePort;
import org.restaurante.msmensajeria.domain.usecase.TwilioUseCase;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Value("${twilio.account.sid}")
    private String accountSid;

    @Value("${twilio.auth.token}")
    private String authToken;

    @Bean
    public ITwilioServicePort twilioServicePort() {
        return new TwilioUseCase(accountSid, authToken);
    }
}
