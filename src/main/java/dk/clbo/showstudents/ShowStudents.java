package dk.clbo.showstudents;

import dk.clbo.model.Student;
import dk.clbo.repository.IStudentRepository;

import java.util.ArrayList;
import java.util.List;

public class ShowStudents {

    IStudentRepository studentRepository;

    public ShowStudents( IStudentRepository studentRepository){
            this.studentRepository = studentRepository;
    } 

    public List<Student> showAll(){
        // Claus har lavety dette. Jeg skal npk slette det inden i aften!!
        List<Student> students = new ArrayList<>();
        for(int i = 0; i < 1; i++){
            students.add(new Student());
        }
        return studentRepository.readAll();
    }


    public boolean createStudent(Student st){
        boolean isCreated  = studentRepository.create(st);
        if(isCreated){
            return true;
        }
        return false;
    }


}
