package com.mySelf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mySelf.bean.Teacher;
import com.mySelf.service.TeacherService;

@Controller
public class TeacherController {

	@Autowired
	TeacherService TeacherService;

	@RequestMapping("/getTeacher")
	public String getaTeacher(@RequestParam(value = "id", defaultValue = "2") Integer id, Model model) {
		Teacher t = TeacherService.getTeacher(id);
		model.addAttribute("teacher", t);
		return "success";
	}

	@RequestMapping("/getall")
	public String getAll(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum, Model model) {
		// 分页
		PageHelper.startPage(pageNum, 10);
		List<Teacher> list = TeacherService.getAll();
		PageInfo<Teacher> info = new PageInfo<>(list, 10);
		model.addAttribute("info", info);
//		int[] nums = info.getNavigatepageNums();
		
		return "success";
	}

}
