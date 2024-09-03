package org.restaurante.msmensajeria.application.handler;

import lombok.RequiredArgsConstructor;
import org.restaurante.msmensajeria.application.dto.request.TwilioRequestDto;
import org.restaurante.msmensajeria.application.handler.interfaces.ITwilioHandler;
import org.restaurante.msmensajeria.application.mapper.request.TwilioRequestMapper;
import org.restaurante.msmensajeria.domain.api.ITwilioServicePort;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TwilioHandler implements ITwilioHandler {

    private final TwilioRequestMapper twilioRequestMapper;
    private final ITwilioServicePort twilioServicePort;

    @Override
    public void sendMessage(TwilioRequestDto twilioRequestDto) {
        twilioServicePort.sendMessage(
                twilioRequestMapper.toTwilioModel(twilioRequestDto)
        );
    }
}
