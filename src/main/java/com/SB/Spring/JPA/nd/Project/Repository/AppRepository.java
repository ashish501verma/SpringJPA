package com.SB.Spring.JPA.nd.Project.Repository;


import com.SB.Spring.JPA.nd.Project.Dao.StudentDao;
import com.SB.Spring.JPA.nd.Project.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface AppRepository extends CrudRepository<Student,Integer> {

    public List<Student> findBystandard(String Standard);

   // public void save(StudentDao student);

}
