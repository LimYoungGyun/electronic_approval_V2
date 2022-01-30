package com.electronicapproval.post.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electronicapproval.post.dao.PostDAO;
import com.electronicapproval.post.model.Post;

@Service
public class PostBO {
	
	@Autowired
	private PostDAO postDAO;

	public List<Post> selectList() {
		return postDAO.selectList();
	}
}
