package com.parcial.elMarciano.dao;

import com.parcial.elMarciano.model.Us;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsDao extends JpaRepository<Us, Long> {
}
