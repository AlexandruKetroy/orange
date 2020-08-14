package com.orange.schimbvalutar.controller;

import com.orange.schimbvalutar.model.dto.SchimbValutarDto;
import com.orange.schimbvalutar.service.impl.SchimbValutarServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/schimb-valutar")
@RequiredArgsConstructor
public class SchimbValutarController {

    private final SchimbValutarServiceImpl schimbValutarService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SchimbValutarDto> cumparareValutaStraina(@Validated @RequestBody SchimbValutarDto schimbValutarDto) {
        SchimbValutarDto schimbValutarDtoDinDb = schimbValutarService.cumparareValutaStraina(schimbValutarDto);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(schimbValutarDtoDinDb);
    }
}
