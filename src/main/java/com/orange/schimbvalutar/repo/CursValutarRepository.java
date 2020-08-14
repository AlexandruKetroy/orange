package com.orange.schimbvalutar.repo;

import com.orange.schimbvalutar.model.CursValutar;
import com.orange.schimbvalutar.model.enums.CodValuta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CursValutarRepository extends CrudRepository<CursValutar, Integer> {

    List<CursValutar> findByCodValuta_CodValuta(CodValuta codValuta);
}
