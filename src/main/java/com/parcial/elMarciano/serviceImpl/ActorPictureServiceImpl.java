package com.parcial.elMarciano.serviceImpl;

import com.parcial.elMarciano.dao.ActorPictureDao;
import com.parcial.elMarciano.model.ActorPicture;
import com.parcial.elMarciano.service.ActorPictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ActorPictureServiceImpl implements ActorPictureService {

    @Autowired
    private ActorPictureDao actorPictureDao;

    @Override
    public void uploadPic(MultipartFile picture) throws NoSuchFieldException{
            UriComponentsBuilder componentsBuilder;
            ActorPicture actorPicture = new ActorPicture();
            final String uploadeFolder = "pictureActor/";

            if(picture.isEmpty())
                throw new NoSuchFieldException("The file cant be null");

            try{
                Date date = new Date();
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

                String dateName = dateFormat.format(date);
                String fileName = "actorPicture" + dateName + "." + picture.getContentType().split("/")[1];

                actorPicture.setFileName(fileName);

                byte[] bytesImg = picture.getBytes();
                Path path = Paths.get(uploadeFolder + fileName);
                Files.write(path, bytesImg);

                actorPicture.setPicture(uploadeFolder+fileName);
                actorPictureDao.save(actorPicture);
            }catch(Exception e){
                e.printStackTrace();
            }
    }
}
