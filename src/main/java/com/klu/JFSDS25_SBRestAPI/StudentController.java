package com.klu.JFSDS25_SBRestAPI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	    
		@Autowired
		private StudentService studService;
		
		
		@GetMapping("/")
		public String test() {
			return "Working fine";
		}
		
		@GetMapping("/get-all")
		public List<StudentModel> getMethodName(){
			return studService.getAll();
		}
		
		@PostMapping("/insert-student")
		public ResponseEntity<String> postMethodName(@RequestBody StudentModel Student){
			try {
				studService.insertStudent(Student);
				return ResponseEntity.ok().body("Student Inserted successfully");
			} catch (Exception e) {
				return ResponseEntity.badRequest().body("Error inserting student: " + e.getLocalizedMessage());
			}
		}
		
	 
	}
