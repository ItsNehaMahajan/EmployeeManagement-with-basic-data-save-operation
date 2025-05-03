package com.HibernateExample.EmployeeManagement;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public class EmpDao implements EmployeeDAo{


    EntityManager entityManager;


    @Autowired
    public EmpDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Employee Employee) {
        entityManager.persist(Employee);

    }
}
