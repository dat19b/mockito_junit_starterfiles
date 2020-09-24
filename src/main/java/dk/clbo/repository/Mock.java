package dk.clbo.repository;

import dk.clbo.model.Student;

import java.util.List;

public class Mock implements IStudentRepository {
    @Override
    public boolean create(Student t) {
        return false;
    }

    @Override
    public List<Student> readAll() {
        return null;
    }
}
