package com.klu.JFSDS25_SBRestAPI;
import java.util.List;
public interface StudentService {
	      
		public String insertStudent(StudentModel student);
		public List<StudentModel> getAll();
		public boolean updateStudent(Long id, StudentModel updatedStudent);
	}

