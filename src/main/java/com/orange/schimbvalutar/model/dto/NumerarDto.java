package com.orange.schimbvalutar.model.dto;

import com.orange.schimbvalutar.model.enums.CodValuta;
import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;
import java.time.LocalDate;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor
@AllArgsConstructor(access = PRIVATE)
@Getter
@Setter
@Builder
public class NumerarDto {

    @NotNull
    private String utilizator;

    @NotNull
    private CodValuta codValuta;

    @Positive
    private Double suma;

    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}")
    private LocalDate data;
}
