package in.ac.charusat.studentmgmtsystem.controller;

import in.ac.charusat.studentmgmtsystem.model.Course;
import in.ac.charusat.studentmgmtsystem.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseRepository courseRepository;
//  List<Course> courses = new ArrayList<>(
//            Arrays.asList(
//                    new Course(1, "FSWD", "Full Stack Web Development"),
//                    new Course(2, "DAA", "Data Analytics and Algorithm"),
//                    new Course(3, "OS", "Operating System")
//            )
//  )
    @GetMapping("/listcourse")
    public List<Course> getCourseList() {
        return courseRepository.findAll();
    }

    @GetMapping("/getcoursefrm/{id}")
    public Course getcoursefrm(@PathVariable Integer id) {
        return courseRepository.findById(id).get();
    }

    @PostMapping("/addcourse")
    public List<Course> addStudent(@RequestBody Course courses) {
        courseRepository.save(courses);
        return courseRepository.findAll();
    }
    @PutMapping("/updatecourse/{id}")
    public List<Course> updateStudent(@RequestBody Course courses, @PathVariable Integer id) {
        Course courseObj = courseRepository.findById(id).get();
        courseObj.setTitle(courses.getTitle());
        courseObj.setDiscription(courses.getDiscription());
        courseRepository.save(courseObj);
        return courseRepository.findAll();
    }

    @DeleteMapping("/deletecourse/{id}")
    public List<Course> deletecourse(@PathVariable Integer id) {
        courseRepository.delete(courseRepository.findById(id).get());
        return courseRepository.findAll();
    }

}
