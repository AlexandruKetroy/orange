package com.orange.schimbvalutar.repo;

import com.orange.schimbvalutar.model.Angajati;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AngajatiRepository extends CrudRepository<Angajati, Integer> {
}
