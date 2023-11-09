package br.com.tddjava.tddjava.modules.courses.repositories;

import br.com.tddjava.tddjava.modules.courses.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseRepository implements ICoursesRepository{

    @Autowired
    CourseJpaRepository courseJpaRepository;

    @Override
    public Course findByName(String name) {
        return this.courseJpaRepository.findByName(name);
    }

    @Override
    public Course save(Course course) {
        return this.courseJpaRepository.save(course);
    }
}
