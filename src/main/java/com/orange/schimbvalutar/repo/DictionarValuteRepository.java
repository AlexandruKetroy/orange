package com.orange.schimbvalutar.repo;

import com.orange.schimbvalutar.model.DictionarValute;
import com.orange.schimbvalutar.model.enums.CodValuta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DictionarValuteRepository extends CrudRepository<DictionarValute, CodValuta> {

    DictionarValute findByCodValuta(CodValuta codValuta);
}
