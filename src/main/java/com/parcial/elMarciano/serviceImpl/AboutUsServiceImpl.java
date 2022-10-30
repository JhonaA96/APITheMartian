package com.parcial.elMarciano.serviceImpl;

import com.parcial.elMarciano.dao.AboutUsDao;
import com.parcial.elMarciano.model.AboutUs;
import com.parcial.elMarciano.service.AboutUsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AboutUsServiceImpl implements AboutUsService {

    @Autowired
    private AboutUsDao aboutUs;

    @Override
    public Iterable<AboutUs> getAll() {
        return aboutUs.findAll();
    }
}
