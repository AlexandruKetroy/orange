package com.orange.schimbvalutar.controller;

import com.orange.schimbvalutar.exceptions.ResourceNotFoundException;
import com.orange.schimbvalutar.model.dto.CursValutarDto;
import com.orange.schimbvalutar.model.enums.CodValuta;
import com.orange.schimbvalutar.service.impl.CursValutarServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/curs-valutar")
@RequiredArgsConstructor
public class CursValutarController {
    private final CursValutarServiceImpl cursValutarService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CursValutarDto> insereazaRata(@Validated @RequestBody CursValutarDto cursValutarDto) {
        CursValutarDto cursValutarDtoDinDb = cursValutarService.insereazaRata(cursValutarDto);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(cursValutarDtoDinDb);
    }

    @GetMapping(params = "codValuta")
    public ResponseEntity<CursValutarDto> intoarceDupaAnumitaValuta(@RequestParam("codValuta") CodValuta codValuta) throws ResourceNotFoundException {
        CursValutarDto cursValutarDto = cursValutarService.intoarceDupaAnumitaValuta(codValuta);
        return ResponseEntity.ok(cursValutarDto);
    }
}
