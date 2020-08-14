package com.orange.schimbvalutar.model.dto;

import com.orange.schimbvalutar.model.enums.CodValuta;
import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor
@AllArgsConstructor(access = PRIVATE)
@Getter
@Setter
@Builder
public class CursValutarDto {

    @NotNull
    private CodValuta codValuta;

    @Positive
    private Integer rata;

    @PositiveOrZero
    private Double curs;

    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}")
    private String data;
}
