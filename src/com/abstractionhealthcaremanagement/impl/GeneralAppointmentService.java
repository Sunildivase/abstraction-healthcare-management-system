package com.abstractionhealthcaremanagement.impl;

import com.abstractionhealthcaremanagement.model.Appointment;
import com.abstractionhealthcaremanagement.service.AppointmentService;

import java.util.HashMap;
import java.util.Scanner;

public class GeneralAppointmentService implements AppointmentService {

    private static final Scanner scanner = new Scanner(System.in);

    HashMap<String ,String > appointmentHashMap = new HashMap<>();

    @Override
    public Appointment createAppointment() {


        System.out.println("please enter appointmentId ");
        int appointmentId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter reason of appointment");
        String reasonOfAppointment = scanner.nextLine();

        System.out.println("please enter person Id");
        int personId = Integer.parseInt(scanner.nextLine());

        Appointment appointment = new Appointment();
        appointment.setAppointmentId(appointmentId);
        appointment.setReasonOfAppointment(reasonOfAppointment);
        appointment.setPersonId(personId);

        appointmentHashMap.put(String.valueOf(1), String.valueOf(appointment));
        return appointment;

    }

}
