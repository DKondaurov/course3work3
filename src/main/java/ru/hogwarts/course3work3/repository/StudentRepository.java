package ru.hogwarts.course3work3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.hogwarts.course3work3.model.Student;

import java.util.Collection;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Collection<Student> findStudentByAge(int age);
}
