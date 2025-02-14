package com.abstractionhealthcaremanagement.impl;

import com.abstractionhealthcaremanagement.model.Person;
import com.abstractionhealthcaremanagement.service.PersonService;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UserService implements PersonService {

   private static final Scanner scanner = new Scanner(System.in);

   Set<String> users = new HashSet<>();

    @Override
    public void createPerson() {


        System.out.println("please enter id");
        int personId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter type");
        String type = scanner.nextLine();

        System.out.println("please enter first Name");
        String firstName = scanner.nextLine();

        System.out.println("please enter last name");
        String lastName = scanner.nextLine();

        System.out.println("please enter age ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter gender");
        String gender = scanner.nextLine();

        System.out.println("please enter contactNo");
        String contactNo = scanner.nextLine();

        System.out.println("please enter alternateMobile");
        String alternateMobile = scanner.nextLine();

        System.out.println("please enter address");
        String address = scanner.nextLine();

        Person person = new Person();
        person.setPersonId(personId);
        person.setType(type);
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setAge(age);
        person.setGender(gender);
        person.setContactNo(Long.valueOf(contactNo));
        person.setAlternateMobile(Long.valueOf(alternateMobile));
        person.setAddress(address);
        users.add(String.valueOf(person));

    }

    @Override
    public void displayPerson() {
        System.out.println("users "+users);
    }
}
