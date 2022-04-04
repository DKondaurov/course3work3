package ru.hogwarts.course3work3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.hogwarts.course3work3.model.Faculty;

import java.util.Collection;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {
    Collection<Faculty> findFacultyByColor(String color);
}
