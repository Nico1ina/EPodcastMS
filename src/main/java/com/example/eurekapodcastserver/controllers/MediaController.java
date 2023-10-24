package com.example.eurekapodcastserver.controllers;

import com.example.eurekapodcastserver.services.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/podcast/api/v1")
public class MediaController {

    @Autowired
    private MediaService mediaService;

        //get all media
   /* @GetMapping("/media/getallmedia")
    public List<MediaInterface> getAllAllMedia(){
        return mediaServices.getAllMedia();
    }
    */
/*
    @GetMapping("/media/getallbymediatype/{mediaType}")
    public List<MediaInterface> allMediaByMediaType(@PathVariable("mediaType")String mediaType){
        return mediaServices.allMediaByMediaType(mediaType);
    }
    */

        public MediaController(MediaService mediaService) {
            this.mediaService = mediaService;
        }

        public MediaService getMediaService() {
            return mediaService;
        }

        public void setMediaService(MediaService mediaService) {
            this.mediaService = mediaService;
        }
}
