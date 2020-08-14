package com.orange.schimbvalutar.model;

import lombok.*;

import javax.persistence.*;

import static lombok.AccessLevel.PRIVATE;

@Entity(name = "schimb_valutar")
@NoArgsConstructor
@AllArgsConstructor(access = PRIVATE)
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
public class SchimbValutar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_schimbvalutar")
    private Integer id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cod_valuta")
    private DictionarValute codValuta;

    private Double cursSchimb;

    private Double sumaPrimita;

    private Double sumaEliberata;
}
