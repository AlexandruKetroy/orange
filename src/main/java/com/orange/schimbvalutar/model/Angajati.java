package com.orange.schimbvalutar.model;

import lombok.*;

import javax.persistence.*;

import static lombok.AccessLevel.PRIVATE;

@Entity
@NoArgsConstructor
@AllArgsConstructor(access = PRIVATE)
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
public class Angajati {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_angajat")
    private Integer id;

    private String nume;

    private String prenume;

    private Integer varsta;
}
