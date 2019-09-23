package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import entity.Student;

@Controller
public class StudentController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String student(){
		//return new ModelAndView("student", "command", new Student());
		System.out.println("gfjgfcjh");
		return "redirect:student";
	}
	
	@RequestMapping(value = "/viewstudent", method = RequestMethod.POST)
	public String viewStudent(@ModelAttribute("SpringWeb")Student student, ModelMap model) {
		
		model.addAttribute("name", student.getName());
		return "result";
	}
	
}
