package com.example.springboot_Postgres_GithubAction.Controller;

import com.example.springboot_Postgres_GithubAction.Entity.Student;
import com.example.springboot_Postgres_GithubAction.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController
{
    @Autowired
    StudentRepository studentRepository;
    @RequestMapping("/test")
    public String test()
    {
        return " test for postgres with github action";
    }
    @RequestMapping("/save")
    public String save(@RequestBody Student std)
    {
        studentRepository.save(std);
        return "data saved";
    }
    @RequestMapping("/all")
    public List<Student> allData()
    {
    return  studentRepository.findAll();
    }
}
