package com.abstractionhealthcaremanagement.service;

import com.abstractionhealthcaremanagement.model.Doctor;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DoctorService {

    private static final Scanner scanner = new Scanner(System.in);

    HashMap<String , Doctor> doctorHashMap = new HashMap<>();

    void printDoctor(Doctor doctor){
        System.out.println(doctor);
    }

    public Doctor createDoctor(){

        System.out.println("please enter id");
        int doctorId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter first name");
        String firstName = scanner.nextLine();

        System.out.println("please enter lastName");
        String lastName = scanner.nextLine();

        System.out.println("please enter age");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter gender");
        String gender = scanner.nextLine();

        System.out.println("please enter contact number");
        String contactNo = scanner.nextLine();

        System.out.println("please enter speciality");
        String speciality = scanner.nextLine();

        System.out.println("please enter experience");
        int experience = Integer.parseInt(scanner.nextLine());

        Doctor doctor = new Doctor();
        doctor.setDoctorId(doctorId);
        doctor.setFirstName(firstName);
        doctor.setLastName(lastName);
        doctor.setAge(age);
        doctor.setGender(gender);
        doctor.setContactNo(Long.parseLong(contactNo));
        doctor.setSpeciality(speciality);
        doctor.setExperience(experience);

        doctorHashMap.put(String.valueOf(1),doctor);
        return doctor;


    }

    public void displayDoctor(){

        Set<Map.Entry<String , Doctor>> entrySet = doctorHashMap.entrySet();
        for(Map.Entry<String ,Doctor> doctorEntry : entrySet){
            System.out.println("key: "+doctorEntry.getKey()+"value: "+doctorEntry.getValue());
        }

    }
}
