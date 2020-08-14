package com.orange.schimbvalutar.model;

import lombok.*;

import javax.persistence.*;

import java.time.LocalDate;

import static lombok.AccessLevel.PRIVATE;

@Entity(name = "curs_valutar")
@NoArgsConstructor
@AllArgsConstructor(access = PRIVATE)
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
public class CursValutar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cursvalutar")
    private Integer id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cod_valuta")
    private DictionarValute codValuta;

    @Column(nullable = false)
    private Integer rata;

    private Double curs;

    private LocalDate data;
}
