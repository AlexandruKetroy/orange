package com.orange.schimbvalutar.repo;

import com.orange.schimbvalutar.model.SchimbValutar;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchimbValutarRepository extends CrudRepository<SchimbValutar, Integer> {

}
