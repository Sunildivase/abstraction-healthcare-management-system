package com.abstractionhealthcaremanagement.service;

import com.abstractionhealthcaremanagement.model.Hospital;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HospitalService {

    private static final Scanner sc = new Scanner(System.in);

    HashMap<String , Hospital> hospitalHashMap = new HashMap<>();

    void printHospital(Hospital hospital){
        System.out.println(hospital);
    }

    public Hospital createHospital(){
        System.out.println("please enter id");
        int hospitalId=Integer.parseInt(sc.nextLine());

        System.out.println("please enter hospital Name");
        String hospitalName = sc.nextLine();

        System.out.println("please enter address");
        String address = sc.nextLine();

        System.out.println("please enter contact number");
        String contactNo = sc.nextLine();

        System.out.println("please enter emailId");
        String emailId = sc.nextLine();

        Hospital hospital = new Hospital();
        hospital.setHospitalId(hospitalId);
        hospital.setHospitalName(hospitalName);
        hospital.setAddress(address);
        hospital.setContactNo(contactNo);
        hospital.setEmailId(emailId);

        hospitalHashMap.put(String.valueOf(1),hospital);
        return hospital;
    }

    public void displayHospital(){
        Set<Map.Entry<String ,Hospital>> entrySet = hospitalHashMap.entrySet();
        for(Map.Entry<String , Hospital> hospitalEntry : entrySet){
            System.out.println("key: "+hospitalEntry.getKey()+"value: "+hospitalEntry.getValue());
        }
    }

}
