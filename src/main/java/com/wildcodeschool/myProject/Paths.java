package com.wildcodeschool.myProject;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Paths {

	@RequestMapping("/doctor/1")
	@ResponseBody
	public String actorOne() {
    return "William Hartnell";
	}

	@RequestMapping("/doctor/2")
	@ResponseBody
	public String actorTwo() {
    return "Patrick Troughton";
	}

	@RequestMapping("/doctor/3")
	@ResponseBody
	public String actorThree() {
    return "Jon Pertwee";
	}

	@RequestMapping("/doctor/4")
	@ResponseBody
	public String actorFour() {
    return "Tom Baker";
	}

	@RequestMapping("/")
	@ResponseBody
	public String index() {
    return "<ul><li><a href = 'http://localhost:8080/doctor/1'>Doctor 1</li><li><a href = 'http://localhost:8080/doctor/2'>Doctor 2</li><li><a href = 'http://localhost:8080/doctor/3'>Doctor 3</li><li><a href = 'http://localhost:8080/doctor/4'>Doctor 4</li></ul>";
	}

}
