package dk.clbo.controller;

import dk.clbo.model.Student;
import dk.clbo.repository.IStudentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class StudentControllerTest {

    StudentController studentController;

    @Mock
    IStudentRepository studentRepository;
    @Mock
    Model model;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        studentController = new StudentController(studentRepository);
    }

    @Test
    void index() {
        assertEquals("index", studentController.index(model));
        verify(studentRepository, times(1)).readAll();
        //when(studentRepository.readAll()).thenReturn(new ArrayList<>(Arrays.asList(new Student())));
        verify(model, times(1)).addAttribute("std",studentRepository.readAll());
    }
}