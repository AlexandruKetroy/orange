package com.orange.schimbvalutar.service;


import com.orange.schimbvalutar.exceptions.ResourceNotFoundException;
import com.orange.schimbvalutar.model.dto.NumerarDto;

public interface NumerarService {

    NumerarDto corecteazaSumaPeValuta(NumerarDto numerarDto) throws ResourceNotFoundException;
}
