package dk.clbo.repository;

import dk.clbo.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentsMockRepository implements IStudentRepository {
    @Override
    public List<Student> readAll() {
        List<Student> students = new ArrayList<>();
        students.add(new Student());
        return students;
    }
}
