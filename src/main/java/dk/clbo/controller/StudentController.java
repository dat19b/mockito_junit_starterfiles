package dk.clbo.controller;

import dk.clbo.model.Student;
import dk.clbo.repository.IStudentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController  {

    IStudentRepository studentRepository;

    public StudentController(IStudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("std", studentRepository.readAll());
        return "index";
    }





/*
    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("student", new Student());
        return "create";

    }

    @PostMapping("/create")
    public String create(@ModelAttribute Student stu) {

        studentRepository.create(stu);
        return "redirect:/";
    }



    @GetMapping("/delete")
    public String delete(@RequestParam("id") int id, Model model) {
        model.addAttribute("stu", studentRepository.read(id));

        return "delete";
    }

    @GetMapping("/edit")
    public String update(@RequestParam("id") int id, Model model){
        model.addAttribute("student", studentRepository.read(id));
        return "edit";
    }

    @PostMapping("/edit")
    public String update(@ModelAttribute Student student) {
        studentRepository.update(student);
        return "redirect:/";
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute Student stu, Model model){
        studentRepository.delete(stu.getStudentId());
        return "redirect:/";
    }

    @GetMapping("/enroll")
    public String enroll(@RequestParam("id") String id, Model model) {
        // TODO: Get list of Courses
        // model.addAttribute("courses", courserepository.readAll());
        model.addAttribute("stu", studentRepository.read(Integer.parseInt(id)));
        return "enroll"; // enroll.html is similar to create student
    }
*/
}
