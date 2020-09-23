package dk.clbo.showstudents;


import dk.clbo.repository.IStudentRepository;
import dk.clbo.repository.StudentConsoleRepository;

public class Main {

    public static void main(String[] args) {
        IStudentRepository studentsRepository = new StudentConsoleRepository();
        ShowStudents showStudents = new ShowStudents(studentsRepository); // dependency inject studentsRepository
        System.out.println(showStudents.showAll());
    }

}
