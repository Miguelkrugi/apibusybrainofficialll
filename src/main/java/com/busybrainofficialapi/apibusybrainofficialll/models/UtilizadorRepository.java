package com.busybrainofficialapi.apibusybrainofficialll.models;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UtilizadorRepository extends CrudRepository<Utilizador, Integer>{
    
    @Query(value = "SELECT * FROM utilizador", nativeQuery = true)
    Iterable<Utilizador> findAllUsers();

}
