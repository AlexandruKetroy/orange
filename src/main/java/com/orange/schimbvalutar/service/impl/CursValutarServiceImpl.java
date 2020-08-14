package com.orange.schimbvalutar.service.impl;

import com.orange.schimbvalutar.exceptions.ResourceNotFoundException;
import com.orange.schimbvalutar.model.CursValutar;
import com.orange.schimbvalutar.model.dto.CursValutarDto;
import com.orange.schimbvalutar.model.enums.CodValuta;
import com.orange.schimbvalutar.repo.CursValutarRepository;
import com.orange.schimbvalutar.service.CursValutarService;
import com.orange.schimbvalutar.util.Converter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;

@RequiredArgsConstructor
@Transactional
@Service
public class CursValutarServiceImpl implements CursValutarService {
    private final Converter converter;
    private final CursValutarRepository cursValutarRepository;

    @Override
    public CursValutarDto insereazaRata(CursValutarDto cursValutarDto) {
        CursValutar cursValutar = converter.convertToCursValutar(cursValutarDto);
        cursValutar.setData(LocalDate.now());
        CursValutar entitateSalvata = cursValutarRepository.save(cursValutar);
        return converter.convertToCursValutarDto(entitateSalvata);
    }

    @Override
    public CursValutarDto intoarceDupaAnumitaValuta(CodValuta codValuta) throws ResourceNotFoundException {
        return cursValutarRepository.findByCodValuta_CodValuta(codValuta)
                .stream()
                .filter(cursValutar -> cursValutar.getData().isEqual(LocalDate.now()))
                .map(converter::convertToCursValutarDto)
                .findFirst().orElseThrow(()-> new ResourceNotFoundException("Valuta gresita"));
    }
}
