package com.videoSite.controller;

import com.videoSite.common.constant.MyVideoPath;
import com.videoSite.entity.Comment;
import com.videoSite.entity.Notification;
import com.videoSite.service.VideoService;
import com.videoSite.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/admin")
public class AdminController {



    @Autowired
    VideoService videoService;
    @Autowired
    MyVideoPath myVideoPath;

    @PostMapping("/getVideo")
    public void getVideo(@RequestBody Comment comment){
    }

}
