package com.parcial.elMarciano.controller;

import com.parcial.elMarciano.dao.ActorPictureDao;
import com.parcial.elMarciano.service.ActorPictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.UriComponentsBuilder;

import javax.websocket.server.PathParam;

@RestController
//@RequestMapping(value = "/picture/", headers=("content-type=multipart/form-data"))
public class ActorPictureController {

    @Autowired
    private ActorPictureService actorPictureService;

    @RequestMapping(
            value = "/picture/",
            method = RequestMethod.POST,
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<?> uploadPic(@RequestParam("file") MultipartFile picture){
        try{
            actorPictureService.uploadPic(picture);
            return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body("File uploaded");
        }catch (Exception e){
            e.getStackTrace();
            return ResponseEntity.badRequest().build();
        }
    }
}
