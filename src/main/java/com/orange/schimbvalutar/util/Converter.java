package com.orange.schimbvalutar.util;

import com.orange.schimbvalutar.model.CursValutar;
import com.orange.schimbvalutar.model.Numerar;
import com.orange.schimbvalutar.model.SchimbValutar;
import com.orange.schimbvalutar.model.dto.CursValutarDto;
import com.orange.schimbvalutar.model.dto.NumerarDto;
import com.orange.schimbvalutar.model.dto.SchimbValutarDto;
import com.orange.schimbvalutar.repo.DictionarValuteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.time.LocalDate;

@Component
@RequiredArgsConstructor
public class Converter {

    private final DictionarValuteRepository dictionarValuteRepo;

    public CursValutarDto convertToCursValutarDto(CursValutar cursValutar) {
        return CursValutarDto.builder()
                .codValuta(cursValutar.getCodValuta().getCodValuta())
                .rata(cursValutar.getRata())
                .curs(cursValutar.getCurs())
                .data(cursValutar.getData().toString())
                .build();
    }

    @Transactional
    public CursValutar convertToCursValutar(CursValutarDto cursValutarDto) {
        return CursValutar.builder()
                .codValuta(dictionarValuteRepo.findByCodValuta(cursValutarDto.getCodValuta()))
                .rata(cursValutarDto.getRata())
                .curs(cursValutarDto.getCurs())
                .data(LocalDate.now())
                .build();
    }

    public SchimbValutarDto convertToSchimbValutarDto(SchimbValutar schimbValutar) {
        return SchimbValutarDto.builder()
                .codValuta(schimbValutar.getCodValuta().getCodValuta())
                .cursSchimb(schimbValutar.getCursSchimb())
                .sumaPrimita(schimbValutar.getSumaPrimita())
                .sumaEliberata(schimbValutar.getSumaEliberata())
                .build();
    }

    @Transactional
    public SchimbValutar convertToSchimbValutar(SchimbValutarDto schimbValutarDto) {
        return SchimbValutar.builder()
                .codValuta(dictionarValuteRepo.findByCodValuta(schimbValutarDto.getCodValuta()))
                .cursSchimb(schimbValutarDto.getCursSchimb())
                .sumaPrimita(schimbValutarDto.getSumaPrimita())
                .sumaEliberata(schimbValutarDto.getSumaEliberata())
                .build();
    }

    public NumerarDto convertToNumerarDto(Numerar numerar) {
        return NumerarDto.builder()
                .utilizator(numerar.getUtilizator())
                .codValuta(numerar.getCodValuta().getCodValuta())
                .suma(numerar.getSuma())
                .data(numerar.getData())
                .build();
    }

    @Transactional
    public Numerar convertToNumerar(NumerarDto numerarDto) {
        return Numerar.builder()
                .utilizator(numerarDto.getUtilizator())
                .codValuta(dictionarValuteRepo.findByCodValuta(numerarDto.getCodValuta()))
                .suma(numerarDto.getSuma())
                .data(numerarDto.getData())
                .build();
    }
}
