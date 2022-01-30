package com.electronicapproval.post.dao;

import java.util.List;

import com.electronicapproval.post.model.Post;

public interface PostDAO {

	public List<Post> selectList();
}
