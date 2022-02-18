package codeploy.academy.courses.service;

import java.util.List;

import codeploy.academy.courses.model.Cours;

/**
 * interface courses method
 * @author andrea.ciaccia
 *
 */
public interface CoursesInterface {
	
	/**
	 * get all courses from database
	 * @return
	 */
	List<Cours> findAllCourses();

}
