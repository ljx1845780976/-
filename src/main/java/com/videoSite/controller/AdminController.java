package com.videoSite.controller;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.videoSite.common.constant.MyVideoPath;
import com.videoSite.dto.VideoDTO;
import com.videoSite.entity.Comment;
import com.videoSite.entity.Notification;
import com.videoSite.entity.Video;
import com.videoSite.service.VideoService;
import com.videoSite.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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

    @GetMapping("/getVideo")
    @ResponseBody
    public List<Video> getVideo(@RequestParam("keyword") String  keyword){
        if (StringUtils.isEmpty(keyword)){
            return videoService.list();
        }
        return videoService.queryByTitleOrIntroductionOrOwner(keyword);
    }
    @GetMapping("/deleteVideo")
    @ResponseBody
    public Boolean deleteVideo(@RequestParam("id") String  id){
        return videoService.removeById(id);
    }

}
