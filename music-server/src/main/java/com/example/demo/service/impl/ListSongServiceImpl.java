package com.example.demo.service.impl;

import com.example.demo.dao.ListSongMapper;
import com.example.demo.domain.ListSong;
import com.example.demo.service.ListSongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListSongServiceImpl implements ListSongService {

    @Autowired
    private ListSongMapper listSongMapper;

    @Override
    public List<ListSong> allListSong()
    {
        return null;
    }

    @Override
    public boolean updateListSongMsg(ListSong listSong) {
        return false;
    }

    @Override
    public boolean deleteListSong(Integer songId) {
        return false;
    }

    @Override
    public boolean addListSong(ListSong listSong)
    {
        return false;
    }

    @Override
    public List<ListSong> listSongOfSongId(Integer songListId)
    {
        return null;
    }

}