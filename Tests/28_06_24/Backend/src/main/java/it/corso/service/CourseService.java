package it.corso.service;

import java.util.List;

import it.corso.dto.CourseDto;
import it.corso.dto.CourseUpdateDto;
import it.corso.model.Course;

public interface CourseService {
	  
	  Course createCorso(CourseDto courseDto);
	  
	  void updateCorso(CourseUpdateDto courseUpdateDto);
	  
	  void deleteCorso(int id);
	
	  CourseDto getCorsoById(int id);
	  
	  List<CourseDto> getCorsi();

}