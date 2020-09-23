package dk.clbo.showstudents;

import dk.clbo.model.Student;
import dk.clbo.repository.IStudentRepository;

import java.util.List;

public class ShowStudents {

    IStudentRepository studentRepository;

    public ShowStudents( IStudentRepository studentRepository){
            this.studentRepository = studentRepository;
    } 

    public List<Student> showAll(){
        return studentRepository.readAll();
    }
}
