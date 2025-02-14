package com.abstractionhealthcaremanagement.service;

import com.abstractionhealthcaremanagement.model.Billing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class BillingService {
    private static final Scanner sc = new Scanner(System.in);

    HashMap<String , Billing> billingHashMap = new HashMap<>();

    void printBilling(Billing billing){
        System.out.println(billing);
    }
    public Billing createBilling(){
        System.out.println("please enter bill Id");
        int billId = Integer.parseInt(sc.nextLine());

        System.out.println("please enter bill");
        int bill = Integer.parseInt(sc.nextLine());

        System.out.println("please enter total bill");
        int totalBill = Integer.parseInt(sc.nextLine());

        System.out.println("please enter personId");
        int personId = Integer.parseInt(sc.nextLine());

        Billing billing = new Billing();
        billing.setBillId(billId);
        billing.setBill(bill);
        billing.setTotalBill(totalBill);
        billing.setPersonId(personId);
        billingHashMap.put(String.valueOf(1),billing);
        return billing;
    }
    public void displayBilling(){
        Set<Map.Entry<String ,Billing>> entrySet = billingHashMap.entrySet();
        for(Map.Entry<String ,Billing> billingEntry: entrySet){
            System.out.println("key: "+billingEntry.getKey()+"value: "+billingEntry.getValue());
        }
    }
}
