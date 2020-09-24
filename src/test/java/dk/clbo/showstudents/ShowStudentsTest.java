package dk.clbo.showstudents;

import dk.clbo.model.Student;
import dk.clbo.repository.IStudentRepository;
import dk.clbo.repository.StudentConsoleRepository;
import dk.clbo.repository.StudentsMockRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ShowStudentsTest {

    ShowStudents showStudents;
    @Mock
    IStudentRepository studentRepository;

    @BeforeEach
    void setUp() {
        //studentRepository = new StudentsMockRepository();
        MockitoAnnotations.initMocks(this);
        showStudents = new ShowStudents(studentRepository);
    }

    @Test
    void showAll() {
        when(studentRepository.readAll()).thenReturn(new ArrayList<>(Arrays.asList(new Student())));
        assertEquals(1, showStudents.showAll().size());
        verify(studentRepository, times(1)).readAll();
    }

    @Test
    void createStudent() {
        Student stud = new Student(1,"e", "f", "12");
        Student empty = new Student();

        when(studentRepository.create(stud)).thenReturn(true);
        assertEquals(true, showStudents.createStudent(stud));
        assertEquals(false, showStudents.createStudent(empty));

        verify(studentRepository, times(1)).create(stud);
    }
}