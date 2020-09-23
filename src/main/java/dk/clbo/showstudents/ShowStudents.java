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

    /*
    public boolean createStudent(Student st){
        boolean isCreated  = studentRepository.create(st);
        if(isCreated){
            return true;
        }
        return false;
    }
    
     */
}
