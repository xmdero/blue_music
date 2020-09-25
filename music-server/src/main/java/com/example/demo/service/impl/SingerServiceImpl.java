package com.example.demo.service.impl;

import com.example.demo.dao.SingerMapper;
import com.example.demo.domain.Singer;
import com.example.demo.service.SingerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SingerServiceImpl implements SingerService{

    @Autowired
    private SingerMapper singerMapper;

    @Override
    public boolean updateSingerMsg(Singer singer) {
        return false;
    }

    @Override
    public boolean updateSingerPic(Singer singer) {

        return false;
    }

    @Override
    public boolean deleteSinger(Integer id) {
        return false;
    }

    /**
     * 返回所有歌手列表
     * */
    @Override
    public List<Singer> allSinger()
    {
        return null;
    }

    @Override
    public boolean addSinger(Singer singer)  {

        return false;
    }

    @Override
    public List<Singer> singerOfName(String name)

    {
        return null;
    }

    @Override
    public List<Singer> singerOfSex(Integer sex)

    {
        return null;
    }
}
