package com.busybrainofficialapi.apibusybrainofficialll.models;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UtilizadorRepository extends CrudRepository<Utilizador, Integer>{
    
    @Query(value = "SELECT * FROM utilizador WHERE", nativeQuery = true)
    Iterable<Utilizador> findAllUsers();

}
