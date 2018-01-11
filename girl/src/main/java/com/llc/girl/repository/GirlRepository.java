package com.llc.girl.repository;

import com.llc.girl.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GirlRepository extends JpaRepository<Girl,Integer> {
}
