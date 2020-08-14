package com.orange.schimbvalutar.model;

import com.orange.schimbvalutar.model.enums.CodValuta;
import lombok.*;

import javax.persistence.*;
import java.util.List;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor
@AllArgsConstructor(access = PRIVATE)
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
@Entity(name = "dictionar_valute")
public class DictionarValute {

    @Id
    @Enumerated(EnumType.STRING)
    private CodValuta codValuta;

    private String denumireValuta;

    private String flag;

    @OneToMany(mappedBy = "codValuta")
    private List<CursValutar> cursValutar;

    @OneToMany(mappedBy = "codValuta")
    private List<SchimbValutar> schimbValutar;

    @OneToMany(mappedBy = "codValuta")
    private List<Numerar> numerar;
}
