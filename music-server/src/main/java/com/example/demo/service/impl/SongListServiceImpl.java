package com.example.demo.service.impl;

import com.example.demo.dao.SongListMapper;
import com.example.demo.domain.SongList;
import com.example.demo.service.SongListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongListServiceImpl implements SongListService {

    @Autowired
    private SongListMapper songListMapper;

    @Override
    public boolean updateSongListMsg(SongList songList) {
        return false;
    }

    @Override
    public boolean deleteSongList(Integer id) {
        return false;
    }

    /**
     * 返回所有歌单
     * */
    @Override
    public List<SongList> allSongList()
    {
        return null;
    }

    @Override
    public List<SongList> likeTitle(String title)
    {
        return null;
    }

    @Override
    public List<SongList> likeStyle(String style)
    {
        return null;
    }

    @Override
    public List<SongList> songListOfTitle(String title)
    {
        return null;
    }

    @Override
    public boolean addSongList(SongList songList)
    {
        return false;
    }

    @Override
    public boolean updateSongListImg(SongList songList) {

        return false;
    }
}
