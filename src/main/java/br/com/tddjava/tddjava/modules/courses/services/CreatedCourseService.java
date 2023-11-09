package br.com.tddjava.tddjava.modules.courses.services;

import br.com.tddjava.tddjava.modules.courses.entities.Course;
import br.com.tddjava.tddjava.modules.courses.repositories.CourseJpaRepository;
import br.com.tddjava.tddjava.modules.courses.repositories.ICoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreatedCourseService {

    private ICoursesRepository repository;

    public CreatedCourseService(ICoursesRepository repository){
        this.repository = repository;
    }


    public Course execute(Course course){

        // Validar se o curso existe pelo nome
        Course existCourse = this.repository.findByName(course.getName());

        // Se sim retorna erro
        if (existCourse != null){
            throw new Error("Curso já existe");
        }

        // Se não retorna novo curso
        return this.repository.save(course);
    }
}
