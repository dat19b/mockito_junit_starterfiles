package dk.clbo.showstudents;

import dk.clbo.repository.IStudentRepository;
import dk.clbo.repository.StudentConsoleRepository;
import dk.clbo.repository.StudentsMockRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShowStudentsTest {

    ShowStudents showStudents;
    IStudentRepository studentRepository;

    @BeforeEach
    void setUp() {
        studentRepository = new StudentsMockRepository();
        showStudents = new ShowStudents(studentRepository);
    }

    @Test
    void showAll() {
        assertEquals(1, showStudents.showAll().size());
    }
}