package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;

@Controller
public class ContactContoller {
	@RequestMapping("/ContactForm")
	public String showForm() {
		return "ContactForm";
	}
	
	
	/*
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleform(
			@RequestParam(name="email",required=true)String userEmail,
			@RequestParam("userName")String userName,
			@RequestParam("password")String userPassword,Model model)
	{
		
		
		System.out.println("userEmail"+userEmail);
		System.out.println("userEmail"+userName);
		System.out.println("userEmail"+userPassword);
		
		User user=new User();
		user.setEmail(userEmail);
		user.setUserName(userName);
		user.setPassword(userPassword);
		
		System.out.println(user);
		
		//process
		
//		
//		model.addAttribute("name", userName);
//		model.addAttribute("email", userEmail);
//		model.addAttribute("password", userPassword);
		
		model.addAttribute("user",user);
		return "success";
	}*/
	
	//alternate way to use the above code in more simple manner using @ModelAttribute
	
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleform(@ModelAttribute User user,Model model)
	{
			
		System.out.println(user);
		
		return "success";
	}
	
	
}
