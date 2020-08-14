package com.orange.schimbvalutar.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

import static lombok.AccessLevel.PRIVATE;

@Entity
@NoArgsConstructor
@AllArgsConstructor(access = PRIVATE)
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
public class Numerar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_numerar")
    private Integer id;

    @Column(name = "utilizator", unique = true)
    private String utilizator;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cod_valuta")
    private DictionarValute codValuta;

    private Double suma;

    private LocalDate data;
}
