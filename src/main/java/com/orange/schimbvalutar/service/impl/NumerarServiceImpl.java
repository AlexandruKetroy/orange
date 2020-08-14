package com.orange.schimbvalutar.service.impl;

import com.orange.schimbvalutar.exceptions.ResourceNotFoundException;
import com.orange.schimbvalutar.model.Numerar;
import com.orange.schimbvalutar.model.dto.NumerarDto;
import com.orange.schimbvalutar.repo.NumerarRepository;
import com.orange.schimbvalutar.service.NumerarService;
import com.orange.schimbvalutar.util.Converter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class NumerarServiceImpl implements NumerarService {

    private final Converter mapper;
    private final NumerarRepository numerarRepository;

    @Override
    public NumerarDto corecteazaSumaPeValuta(NumerarDto numerarDto) throws ResourceNotFoundException {
        Numerar numerar = numerarRepository.findByCodValuta_CodValuta(numerarDto.getCodValuta())
                .orElseThrow(() -> new ResourceNotFoundException("Valuta gresita"));
        numerar.setSuma(numerarDto.getSuma());
        return mapper.convertToNumerarDto(numerar);
    }
}
