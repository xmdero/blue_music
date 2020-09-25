package com.example.demo.service.impl;

import com.example.demo.dao.SongMapper;
import com.example.demo.domain.Song;
import com.example.demo.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImpl implements SongService {

    @Autowired
    private SongMapper songMapper;

    /**
     * 返回所有歌曲列表
     * */
    @Override
    public List<Song> allSong()
    {
        return null;
    }

    @Override
    public boolean addSong(Song song)
    {

        return false;
    }

    @Override
    public boolean updateSongMsg(Song song) {
        return false;
    }

    @Override
    public boolean updateSongUrl(Song song) {

        return false;
    }

    @Override
    public boolean updateSongPic(Song song) {

        return false;
    }

    @Override
    public boolean deleteSong(Integer id) {
        return false;
    }

    @Override
    public List<Song> songOfSingerId(Integer singerId)

    {
        return null;
    }

    @Override
    public List<Song> songOfId(Integer id)

    {
        return null;
    }

    @Override
    public List<Song> songOfSingerName(String name)

    {
        return null;
    }

    @Override
    public List<Song> songOfName(String name)

    {
        return null;
    }
}
