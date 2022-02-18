package codeploy.academy.courses.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import codeploy.academy.courses.model.Cours;
import codeploy.academy.courses.repository.CoursesRepository;

@Service
public class CoursesImpl implements CoursesInterface {
	
	@Autowired
	CoursesRepository courseRepo;
	

	@Override
	public List<Cours> findAllCourses() {
		return courseRepo.findAll();
	}

}
