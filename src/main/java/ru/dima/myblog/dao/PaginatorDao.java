package ru.dima.myblog.dao;

import ru.dima.myblog.mappers.PostRowMapper;
import ru.dima.myblog.model.Post;

import java.util.List;

public interface PaginatorDao {

    public List<Post> findPostsPage(int offset, int limit);

    public long countPosts();

}
