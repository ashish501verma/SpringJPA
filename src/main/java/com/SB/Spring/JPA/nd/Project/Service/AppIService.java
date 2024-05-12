package com.SB.Spring.JPA.nd.Project.Service;


import com.SB.Spring.JPA.nd.Project.Dao.StudentDao;
import com.SB.Spring.JPA.nd.Project.Entity.Student;

import java.util.List;

public interface AppIService {

    public List<Student> getalldata(String standard);
    Student saveAllData(StudentDao studentDao);
}
