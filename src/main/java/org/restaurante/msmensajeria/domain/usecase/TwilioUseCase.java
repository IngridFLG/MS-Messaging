package org.restaurante.msmensajeria.domain.usecase;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import org.restaurante.msmensajeria.domain.api.ITwilioServicePort;
import org.restaurante.msmensajeria.domain.model.TwilioModel;

import static org.restaurante.msmensajeria.infrastructure.configuration.Constants.FROM_NUMBER_PHONE;

public class TwilioUseCase implements ITwilioServicePort {

    private final String accountSid;
    private final String authToken;

    public TwilioUseCase(String accountSid, String authToken) {
        this.accountSid = accountSid;
        this.authToken = authToken;
        Twilio.init(accountSid, authToken);
    }

    @Override
    public void sendMessage(TwilioModel twilioModel) {
        try {
            Message.creator(
                            new com.twilio.type.PhoneNumber(twilioModel.getPhoneNumber()),
                            new com.twilio.type.PhoneNumber(FROM_NUMBER_PHONE),
                            "Su pedido ya está listo, lo puede reclamar con este pin: " + twilioModel.getMessage())
                    .create();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

}
