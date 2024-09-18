package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("name", "Rushikesh shelar");
		System.out.println("this is home url");
		List<String> friends=new ArrayList<String>();
		friends.add("Ram");
		friends.add("Sham");
		friends.add("Radhe");
		friends.add("Krishna");
		
		model.addAttribute("f",friends);
		
		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about contoller");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("this is help controller");
		ModelAndView modelAndView =new ModelAndView();
		//setting the data
		modelAndView.addObject("name", "Uttam");
	
		
		
		//marks
		List<Integer> list=new ArrayList<Integer>();
		list.add(55);
		list.add(652);
		list.add(78);
		list.add(52);
		list.add(6);
		
		modelAndView.addObject("marks",list);
		
		//setting the view name
		modelAndView.setViewName("help");
		
		return modelAndView;
	}
}
