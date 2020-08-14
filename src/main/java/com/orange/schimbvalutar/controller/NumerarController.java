package com.orange.schimbvalutar.controller;

import com.orange.schimbvalutar.exceptions.ResourceNotFoundException;
import com.orange.schimbvalutar.model.dto.NumerarDto;
import com.orange.schimbvalutar.service.impl.NumerarServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/numerar")
@RequiredArgsConstructor
public class NumerarController {

    private final NumerarServiceImpl numerarService;

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<NumerarDto> cumparareValutaStraina(@Validated @RequestBody NumerarDto numerarDto) throws ResourceNotFoundException {
        NumerarDto numerarDtoDinDB = numerarService.corecteazaSumaPeValuta(numerarDto);
        return ResponseEntity.status(HttpStatus.OK).body(numerarDtoDinDB);
    }
}
