package com.SB.Spring.JPA.nd.Project.Controller;


import com.SB.Spring.JPA.nd.Project.Dao.StudentDao;
import com.SB.Spring.JPA.nd.Project.Entity.Student;
import com.SB.Spring.JPA.nd.Project.Service.AppServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/data")
public class AppController {
    @Autowired
    AppServiceImpl service;

    @GetMapping("/get/{standard}")
    public List<Student> getDataBystandard(@PathVariable String standard){
        List<Student> getalldata = service.getalldata(standard);
        return getalldata;
    }
    @PostMapping("/save")
    public Student saveData(@RequestBody StudentDao studentDao){
     return service.saveAllData(studentDao);
    }

    @PostMapping("/me")
    public  String Me (@RequestBody StudentDao studentDao){
        System.out.println("Student" + studentDao.getStandard() + " " + studentDao.getName());
        return studentDao.getName();
    }

}
