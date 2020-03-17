package com.mySelf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mySelf.bean.Teacher;
import com.mySelf.dao.TeacherDao;

@Service
public class TeacherService {

	@Autowired
	private TeacherDao teacherDao;

	public Teacher getTeacher(Integer id) {
		// TODO Auto-generated method stub
		return teacherDao.getTeacherById(id);
	}

	public List<Teacher> getAll() {
		// TODO Auto-generated method stub
		return teacherDao.getTeachers();
	}
}
