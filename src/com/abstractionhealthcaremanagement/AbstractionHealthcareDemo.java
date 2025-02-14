package com.abstractionhealthcaremanagement;

import com.abstractionhealthcaremanagement.impl.GeneralAppointmentService;
import com.abstractionhealthcaremanagement.impl.MedicalTestAppointmentService;
import com.abstractionhealthcaremanagement.impl.UserService;
import com.abstractionhealthcaremanagement.service.*;


import java.util.Scanner;

public class AbstractionHealthcareDemo {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int option=0;
        do {
            System.out.println("----healthcare-management-system------");
            System.out.println("1.create person");
            System.out.println("2.create doctor");
            System.out.println("3.create hospital");
            System.out.println("4.create Department");
            System.out.println("5.create general Appointment");
            System.out.println("6.create medical test appointment");
            System.out.println("7.create prescription");
            System.out.println("8.create billing");

            System.out.println("please select the option");
            option = Integer.parseInt(scanner.nextLine());

            switch (option){
                case 1:
                    PersonService personService = new UserService();
                    //data hiding
                    personService.createPerson();
                    personService.displayPerson();
                    break;

                case 2:
                    DoctorService doctorService = new DoctorService();
                    doctorService.createDoctor();
                    doctorService.displayDoctor();
                    break;

                case 3:
                    HospitalService hospitalService = new HospitalService();
                    hospitalService.createHospital();
                    hospitalService.displayHospital();
                    break;

                case 4:
                    DepartmentService departmentService = new DepartmentService();
                    departmentService.createDepartment();
                    departmentService.displayDepartment();
                    break;

                case 5:
                    AppointmentService appointmentService = new GeneralAppointmentService();
                    appointmentService.createAppointment();
                    break;

                case 6:
                    MedicalTestAppointmentService medicalTestAppointmentService = new MedicalTestAppointmentService();
                    medicalTestAppointmentService.createAppointment();
                    break;

                case 7:
                    PrescriptionService prescriptionService = new PrescriptionService();
                    prescriptionService.createPrescription();
                    prescriptionService.displayPrescription();
                    break;

                case 8:
                    BillingService billingService = new BillingService();
                    billingService.createBilling();
                    billingService.displayBilling();
                    break;

                default:
                    System.out.println("please enter valid option");
                    break;
                    
            }

        }while (option!=0);{
            System.out.println("thank you !!!");
        }

    }
}
