package com.magazin.app;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinieCosRepository extends JpaRepository<LinieCos, Long>{

}
