package com.klu.JFSDS25_SBRestAPI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

	
	

	
	
		@Autowired
		private StudentRepository sr;

		@Override
		public String insertStudent(StudentModel student) {
			sr.save(student);
			return "Student inseted succesfully";
			
		}

		@Override
		public List<StudentModel> getAll() {
			
			return  sr.findAll();
		}

		@Override
		public boolean updateStudent(Long id, StudentModel updatedStudent) {
			// TODO Auto-generated method stub
			return false;
		}


	}
