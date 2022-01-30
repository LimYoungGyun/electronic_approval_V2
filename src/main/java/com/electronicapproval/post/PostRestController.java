package com.electronicapproval.post;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.electronicapproval.post.bo.PostBO;
import com.electronicapproval.post.model.Post;

@RestController
public class PostRestController {
	
	@Autowired
	private PostBO postBO;

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping("/test11")
	public List<Post> test() { 
		logger.debug("로그를 출력한다.");
		List<Post> result = postBO.selectList();
		return result;
	}
}
