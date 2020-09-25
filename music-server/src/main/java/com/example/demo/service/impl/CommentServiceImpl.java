package com.example.demo.service.impl;

import com.example.demo.dao.CommentMapper;
import com.example.demo.domain.Comment;
import com.example.demo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService{
    @Autowired
    private CommentMapper commentMapper;

    @Override
    public boolean addComment(Comment comment) {
        return false;
    }

    @Override
    public boolean updateCommentMsg(Comment comment) {
        return false;
    }

//    删除评论
    @Override
    public boolean deleteComment(Integer id) {
        return false;
    }

    @Override
    public List<Comment> allComment()
    {
        return null;
    }

    @Override
    public List<Comment> commentOfSongId(Integer songId)

    {
        return null;
    }

    @Override
    public List<Comment> commentOfSongListId(Integer songListId)

    {
        return null;
    }
}
