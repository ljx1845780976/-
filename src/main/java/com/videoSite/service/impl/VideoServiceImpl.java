package com.videoSite.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.videoSite.entity.Video;
import com.videoSite.mapper.VideoMapper;
import com.videoSite.service.VideoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 关注公众号：MarkerHub
 * @since 2021-03-10
 */
@Service
public class VideoServiceImpl extends ServiceImpl<VideoMapper, Video> implements VideoService {

    @Autowired
    VideoMapper videoMapper;

    @Override
    public List<Video> queryByTitleOrIntroductionOrOwner(String keyword) {
        return videoMapper.selectList(new QueryWrapper<Video>().like("title",keyword).
                or().like("introduction",keyword).or().like("username",keyword));
    }
}
