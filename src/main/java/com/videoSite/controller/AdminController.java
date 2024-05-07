package com.videoSite.controller;

import com.videoSite.common.constant.MyVideoPath;
import com.videoSite.entity.Comment;
import com.videoSite.entity.Notification;
import com.videoSite.service.VideoService;
import com.videoSite.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/admin")
public class AdminController {



    @Autowired
    VideoService videoService;
    @Autowired
    MyVideoPath myVideoPath;


    @GetMapping("/toAdmin")
    public String toAdmin(){
        return "admin/admin";
    }

    @PostMapping("/getVideo")
    public void getVideo(@RequestBody Comment comment){
    }

}
