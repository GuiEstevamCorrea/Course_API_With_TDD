package br.com.tddjava.tddjava.modules.courses.repositories;

import br.com.tddjava.tddjava.modules.courses.entities.Course;

public interface ICoursesRepository {

    public Course findByName(String name);
    public Course save(Course course);
}
