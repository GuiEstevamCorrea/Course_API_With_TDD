package br.com.tddjava.tddjava.services;

import br.com.tddjava.tddjava.modules.courses.entities.Course;
import br.com.tddjava.tddjava.modules.courses.repositories.CourseInMemoryRepository;
import br.com.tddjava.tddjava.modules.courses.services.CreatedCourseService;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class CreateCourseServiceTest {

    @Test
    public void createNewCourse(){
        // Criar um novo curso
        // Criar table course (Entidade)
        // ID, description, name, workload
        Course course = new Course();
        course.setDescription("Curso descrição Teste");
        course.setName("Nome do curso");
        course.setWorkload(100);

        // Criar Repositorio de curso
        CourseInMemoryRepository repository = new CourseInMemoryRepository();

        // Criar um novo service
        CreatedCourseService createCourseService = new CreatedCourseService(repository);
        Course createdCourse = createCourseService.execute(course);


        assertNotNull(createdCourse.getId());

    }

    @Test(expected = Error.class)
    public void notCreateNewCourse(){
        Course course = new Course();
        course.setDescription("Not create Course");
        course.setName("Not create Course");
        course.setWorkload(100);

        CourseInMemoryRepository repository = new CourseInMemoryRepository();

        CreatedCourseService createCourseService = new CreatedCourseService(repository);
        createCourseService.execute(course);
        createCourseService.execute(course);


    }
}
