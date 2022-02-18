package codeploy.academy.courses.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import codeploy.academy.courses.model.Cours;
import codeploy.academy.courses.service.CoursesInterface;
import io.swagger.annotations.ApiOperation;

@RestController
@Service("v1/courses")
public class CoursesController {
	
	private static final Logger log = LoggerFactory.getLogger(CoursesController.class);
	
	@Autowired
	CoursesInterface serviceCourses;
	
	@ApiOperation(value = "list all courses", notes = "api to obtain list of all courses" )
    @GetMapping("/public/courses")
    public @ResponseBody
    List<Cours> findAllAlerts() {

        log.info("findAllCourses");
        return serviceCourses.findAllCourses();

    }

}
