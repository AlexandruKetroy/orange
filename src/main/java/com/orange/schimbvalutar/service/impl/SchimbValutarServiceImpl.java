package com.orange.schimbvalutar.service.impl;

import com.orange.schimbvalutar.model.SchimbValutar;
import com.orange.schimbvalutar.model.dto.SchimbValutarDto;
import com.orange.schimbvalutar.repo.SchimbValutarRepository;
import com.orange.schimbvalutar.service.SchimbValutarService;
import com.orange.schimbvalutar.util.Converter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
@Transactional
@RequiredArgsConstructor
public class SchimbValutarServiceImpl implements SchimbValutarService {

    private final Converter mapper;
    private final SchimbValutarRepository schimbValutarRepository;

    @Override
    public SchimbValutarDto cumparareValutaStraina(SchimbValutarDto schimbValutarDto) {
        SchimbValutar schimbValutar = mapper.convertToSchimbValutar(schimbValutarDto);
        SchimbValutar entitateSalvata = schimbValutarRepository.save(schimbValutar);
        return mapper.convertToSchimbValutarDto(entitateSalvata);
    }
}
