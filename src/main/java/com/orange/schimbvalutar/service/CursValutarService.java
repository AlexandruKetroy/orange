package com.orange.schimbvalutar.service;

import com.orange.schimbvalutar.exceptions.ResourceNotFoundException;
import com.orange.schimbvalutar.model.dto.CursValutarDto;
import com.orange.schimbvalutar.model.enums.CodValuta;


public interface CursValutarService {

    CursValutarDto insereazaRata(CursValutarDto cursValutarDto);

    CursValutarDto intoarceDupaAnumitaValuta(CodValuta codValuta) throws ResourceNotFoundException;
}
