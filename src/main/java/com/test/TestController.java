package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@RequestMapping("/test")
	@ResponseBody
	public String test()
	{
		int x=50,y=20,z=50;
		return "This is Test\t Sum is : "+(x+y+z);
	}
}
