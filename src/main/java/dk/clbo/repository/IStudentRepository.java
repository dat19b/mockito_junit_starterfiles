package dk.clbo.repository;

import dk.clbo.model.Student;

import java.util.List;

public interface IStudentRepository {

    // Crud methods

    //boolean create(Student t);
    //Student read(int id);
    List<Student> readAll();
    //boolean update(Student t);
    //boolean delete(int id);
}

