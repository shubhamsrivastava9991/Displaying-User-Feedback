package com.display;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DataController {
	
	@Autowired
	UserDataRepo repo;
	
	@RequestMapping("/save_Data")
	@ResponseBody
	public String saveData(UserData userData)
	{
		repo.save(userData);
		return "Feedback inserted Successfully";
	}
}