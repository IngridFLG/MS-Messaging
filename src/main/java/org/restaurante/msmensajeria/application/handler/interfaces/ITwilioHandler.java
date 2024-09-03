package org.restaurante.msmensajeria.application.handler.interfaces;

import org.restaurante.msmensajeria.application.dto.request.TwilioRequestDto;

public interface ITwilioHandler {

    void sendMessage(TwilioRequestDto twilioRequestDto);
}
