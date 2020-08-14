package com.orange.schimbvalutar.model.dto;

import com.orange.schimbvalutar.model.enums.CodValuta;
import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor
@AllArgsConstructor(access = PRIVATE)
@Getter
@Setter
@Builder
public class SchimbValutarDto {

    @NotNull
    private CodValuta codValuta;

    @Positive
    private Double cursSchimb;

    @Positive
    private Double sumaPrimita;

    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}")
    private Double sumaEliberata;
}
