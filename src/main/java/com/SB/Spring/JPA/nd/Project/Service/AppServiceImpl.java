package com.SB.Spring.JPA.nd.Project.Service;


import com.SB.Spring.JPA.nd.Project.Dao.StudentDao;
import com.SB.Spring.JPA.nd.Project.Entity.Student;
import com.SB.Spring.JPA.nd.Project.Repository.AppRepository;
import com.SB.Spring.JPA.nd.Project.Util.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AppServiceImpl implements AppIService{
    @Autowired
    AppRepository appRepository;
    @Override
    public List<Student> getalldata(String standard) {

       return appRepository.findBystandard(standard);
    }

    @Override
    public  Student saveAllData(StudentDao studentDao) {


        
       // System.out.println("student data"+ studentDao.getName()+","+studentDao.getId()+","+studentDao.getStandard());
      return   appRepository.save(Utility.Mapper(studentDao));
        //System.out.println(save.getName());
    }
}
