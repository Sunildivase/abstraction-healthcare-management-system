package com.abstractionhealthcaremanagement.service;

import com.abstractionhealthcaremanagement.model.Department;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.util.Set;

public class DepartmentService {

    private static final Scanner scanner = new Scanner(System.in);

    HashMap<String , Department> departmentHashMap = new HashMap<>();

    void printDepartment(Department department){
        System.out.println(department);
    }

    public Department createDepartment(){

        System.out.println("please enter id");
        int deptId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter department name");
        String deptName = scanner.nextLine();

        System.out.println("please enter doctor Id ");
        int doctorId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter hospital Id");
        int hospitalId = Integer.parseInt(scanner.nextLine());

        Department department = new Department();
        department.setDeptId(deptId);
        department.setDeptName(deptName);
        department.setDoctorId(doctorId);
        department.setHospitalId(hospitalId);
        departmentHashMap.put(String.valueOf(1),department);
        return department;
    }

    public void displayDepartment(){
        Set<Map.Entry<String , Department>> entrySet = departmentHashMap.entrySet();
        for(Map.Entry<String,Department> departmentEntry: entrySet){
            System.out.println("key: "+departmentEntry.getKey()+"value: "+departmentEntry.getValue());
        }
    }

}
