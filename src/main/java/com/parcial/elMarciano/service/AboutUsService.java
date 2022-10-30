package com.parcial.elMarciano.service;

import com.parcial.elMarciano.model.AboutUs;
import org.springframework.stereotype.Service;

@Service
public interface AboutUsService {
    Iterable<AboutUs> getAll();
}
