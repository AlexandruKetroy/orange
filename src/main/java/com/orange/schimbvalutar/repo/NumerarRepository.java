package com.orange.schimbvalutar.repo;

import com.orange.schimbvalutar.model.Numerar;
import com.orange.schimbvalutar.model.enums.CodValuta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface NumerarRepository extends CrudRepository<Numerar, Integer> {

    Optional<Numerar> findByCodValuta_CodValuta(CodValuta codValuta);
}
