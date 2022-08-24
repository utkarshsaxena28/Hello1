package com.ram.hello;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AbcController 
{
	
	@RequestMapping("/")
	@ResponseBody
	public String welcome() 
	{
		return "<h1>Welocome to spring boot starter project Utkarsh</h1>";
	}

	@RequestMapping("/first")
	public String hello() 
	{
		return "h";
	}
	
	@RequestMapping("/form")
	public String form() 
	{
		return "f1";
	}
	
	@RequestMapping("/f1control")
	public String fetching(HttpServletRequest req) 
	{
		System.out.println( "Your name is " + req.getParameter("name"));
		return "r";
	}
}
