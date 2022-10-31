package com.parcial.elMarciano.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public interface ActorPictureService {

    void uploadPic(MultipartFile picture) throws NoSuchFieldException;
}
