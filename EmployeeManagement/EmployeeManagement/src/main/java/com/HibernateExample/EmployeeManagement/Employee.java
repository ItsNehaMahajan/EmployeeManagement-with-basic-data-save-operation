package com.HibernateExample.EmployeeManagement;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="empinfo")
public class Employee {

    @Id
    @Column(name="id")
    int id;

    @Column(name="e_Name")
    String eName;

    @Column(name="dept_No")
    int deptNo;

    Employee(){

    }

    public Employee(int id, String eName, int deptNo) {
        this.id = id;
        this.eName = eName;
        this.deptNo = deptNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", eName='" + eName + '\'' +
                ", deptNo=" + deptNo +
                '}';
    }
}
