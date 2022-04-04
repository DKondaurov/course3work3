package ru.hogwarts.course3work3.service.impl;

import org.springframework.stereotype.Service;
import ru.hogwarts.course3work3.model.Student;
import ru.hogwarts.course3work3.repository.StudentRepository;
import ru.hogwarts.course3work3.service.StudentService;

import java.util.*;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student findStudent(long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public void removeStudent(long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student editStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Collection<Student> filterStudentByAge(int age) {
        return studentRepository.findStudentByAge(age);
    }

}
