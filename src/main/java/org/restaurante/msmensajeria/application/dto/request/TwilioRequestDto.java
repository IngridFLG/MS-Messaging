package org.restaurante.msmensajeria.application.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TwilioRequestDto {

    @NotBlank(message = "The phone is required")
    @Pattern(regexp = "^\\+?57\\s?(3[0-2]|7[0-1])\\d{8}$", message = "The number phone is not valid")
    private String phoneNumber;

    @NotNull(message = "The message is required")
    private Integer message;
}
