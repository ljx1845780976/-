package com.videoSite.service;

import com.videoSite.entity.Video;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 关注公众号：MarkerHub
 * @since 2021-03-10
 */
public interface VideoService extends IService<Video> {
    List<Video> queryByTitleOrIntroductionOrOwner(String keyword);
}
