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
		System.out.println("This is home controller....");
		model.addAttribute("Name", "Nikhil");
		model.addAttribute("Id", 241);

		List<String> friends = new ArrayList<String>();
		friends.add("Kedar");
		friends.add("Rushikesh");
		friends.add("Ramesh");
		friends.add("Sanjana");

		model.addAttribute("Friends", friends);
		return "home";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("This is about controller...");
		return "about";
	}

	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is help controller...");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "Nikhil");
		modelAndView.addObject("id", 241);
		modelAndView.setViewName("help");

		int marks[] = { 98, 72, 56, 47 };
		modelAndView.addObject("marks",marks);

		return modelAndView;
	}
}
