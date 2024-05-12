package com.SB.Spring.JPA.nd.Project.Util;

import com.SB.Spring.JPA.nd.Project.Dao.StudentDao;
import com.SB.Spring.JPA.nd.Project.Entity.Student;



public class Utility {
    public static Student Mapper(StudentDao studentDao) {
        System.out.println(studentDao.getId()+studentDao.getName()+studentDao.getStandard());
        Student student = new Student();
        student.setName(studentDao.getName());
        student.setStandard(studentDao.getStandard());
        System.out.println("Mapper " + student.getName());
        return student; // Return the mapped Student object
    }
}

