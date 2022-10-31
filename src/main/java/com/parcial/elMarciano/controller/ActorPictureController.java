package com.parcial.elMarciano.controller;

import com.parcial.elMarciano.dao.ActorPictureDao;
import com.parcial.elMarciano.service.ActorPictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.UriComponentsBuilder;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping(value = "/picture/", headers=("content-type=multipart/form-data"))
public class ActorPictureController {

    @Autowired
    private ActorPictureService actorPictureService;

    @PostMapping("upload")
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
