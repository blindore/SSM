package com.mySelf.dao;

import java.util.List;

import com.mySelf.bean.Teacher;

public interface TeacherDao {
	public Teacher getTeacherById(Integer id);
	public List<Teacher> getTeachers();
}
