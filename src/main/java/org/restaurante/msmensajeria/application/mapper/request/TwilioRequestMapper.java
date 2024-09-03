package org.restaurante.msmensajeria.application.mapper.request;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.restaurante.msmensajeria.application.dto.request.TwilioRequestDto;
import org.restaurante.msmensajeria.domain.model.TwilioModel;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TwilioRequestMapper {

    TwilioModel toTwilioModel(TwilioRequestDto twilioRequestDto);
}
