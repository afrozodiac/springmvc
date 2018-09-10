package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.entities.Trainee;
import com.cg.service.TraineeMgmtService;

@Controller
public class TraineeContoller 
{
	
	@Autowired
	TraineeMgmtService tser;
	@RequestMapping(name="start")
	public String setup(Model model)
	{
		return "list";
	}
	
	@RequestMapping(name="add")
	public String addTrainee(Model model)
	{
		return "add";
	}
	
	@RequestMapping(name="delete")
	public String deleteTrainee(Model model)
	{
		return "delete";
	}
	
	@RequestMapping(name="list")
	public String list(Model model)
	{
		List<Trainee> tlist=tser.FetchAllTrainee();
		model.addAttribute("tlist",tlist);
		return "list";
	}
	
	@RequestMapping(name="search")
	public String search(Model model)
	{
		return "search";
	}
	
	@RequestMapping(name="upd")
	public String update(Model model)
	{
		return "update";
	}
}
