package ru.hogwarts.course3work3.service.impl;

import org.springframework.stereotype.Service;
import ru.hogwarts.course3work3.model.Faculty;
import ru.hogwarts.course3work3.repository.FacultyRepository;
import ru.hogwarts.course3work3.service.FacultyService;

import java.util.*;

@Service
public class FacultyServiceImpl implements FacultyService {

    private final FacultyRepository facultyRepository;

    public FacultyServiceImpl(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    @Override
    public Faculty addFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    @Override
    public Faculty findFaculty(long id) {
        return facultyRepository.findById(id).get();
    }

    @Override
    public void removeFaculty(long id) {
        facultyRepository.deleteById(id);
    }

    @Override
    public Faculty editFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    @Override
    public Collection<Faculty> filterFacultyByColor(String color) {
        return facultyRepository.findFacultyByColor(color);
    }

}
