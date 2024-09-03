package org.restaurante.msmensajeria.domain.api;

import org.restaurante.msmensajeria.domain.model.TwilioModel;

public interface ITwilioServicePort {

    void sendMessage(TwilioModel twilioModel);

}
