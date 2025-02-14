package com.abstractionhealthcaremanagement.service;

import com.abstractionhealthcaremanagement.model.Prescription;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PrescriptionService {

    private static final Scanner scanner = new Scanner(System.in);

    HashMap<String , Prescription> prescriptionHashMap = new HashMap<>();

    void printPrescription(Prescription prescription){
        System.out.println(prescription);
    }
    public Prescription createPrescription(){

        System.out.println("please enter prescription Id ");
        int prescriptionId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter prescription details");
        String prescriptionDetails = scanner.nextLine();

        System.out.println("please enter person Id ");
        int personId = Integer.parseInt(scanner.nextLine());

        Prescription prescription = new Prescription();
        prescription.setPrescriptionId(prescriptionId);
        prescription.setPrescriptionDetails(prescriptionDetails);
        prescription.setPersonId(personId);
        prescriptionHashMap.put(String.valueOf(1),prescription);
        return prescription;
    }
    public void displayPrescription(){
        Set<Map.Entry<String,Prescription>> entrySet = prescriptionHashMap.entrySet();
        for(Map.Entry<String , Prescription> prescriptionEntry : entrySet){
            System.out.println("key: "+prescriptionEntry.getKey()+"value: "+prescriptionEntry.getValue());
        }
    }
}
