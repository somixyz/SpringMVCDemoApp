package com.springmvcdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	// Need a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	// need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

	// new a controller method to read form data and
	// add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String processFormVerTwo(HttpServletRequest request, Model model) {

		// read the request parameter from HTML form
		String theName = request.getParameter("studentName");
		// convert the data to all caps
		theName = theName.toUpperCase();
		// create message
		String result = "POZDRAV! " + theName;
		// add message to the model
		model.addAttribute("message", result);
		return "helloworld";
	}

	@RequestMapping("/processFormVerThree")
	public String processFormVerThree(@RequestParam("studentName") String theName, Model model) {

		// use passed param data to variable and convert the data to all caps
		theName = theName.toUpperCase();
		// create message
		String result = "Hello dear friend from v3!" + theName;
		// add message to the model
		model.addAttribute("message", result);
		return "helloworld";
	}

}
