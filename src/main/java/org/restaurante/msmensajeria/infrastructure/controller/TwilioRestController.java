package org.restaurante.msmensajeria.infrastructure.controller;

import lombok.RequiredArgsConstructor;
import org.restaurante.msmensajeria.application.dto.request.TwilioRequestDto;
import org.restaurante.msmensajeria.application.handler.interfaces.ITwilioHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/twilio")
@RequiredArgsConstructor
public class TwilioRestController {

    private final ITwilioHandler twilioHandler;

    @PostMapping
    public ResponseEntity<Void> sendMessage(@RequestBody TwilioRequestDto twilioRequestDto) {
        twilioHandler.sendMessage(twilioRequestDto);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
