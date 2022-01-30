package com.electronicapproval.post;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PostController {

	@RequestMapping("/post/post_list_view")
	public String postList() {
		return "post/post_list";
	}
}
