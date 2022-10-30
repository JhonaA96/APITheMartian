package com.parcial.elMarciano.dao;

import com.parcial.elMarciano.model.AboutUs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AboutUsDao extends JpaRepository<AboutUs, Long> {
}
