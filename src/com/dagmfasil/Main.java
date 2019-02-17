package com.dagmfasil;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Education ed;
    static Experience ex;
    static Skills sk;
    static RoboMain roboM;
    static ArrayList<RoboMain> input1 = new ArrayList<>();
    static ArrayList<Education> input2 = new ArrayList<>();
    static ArrayList<Experience> input3 = new ArrayList<>();
    static ArrayList<Skills> input4 = new ArrayList<>();
    static ArrayList<Integer> edCounter = new ArrayList<>();
    static int c1 = 0;
    static int c2 = 0;
    static int c3 = 0;
    static ArrayList<Integer> expCounter = new ArrayList<>();
    static ArrayList<Integer> skillCounter = new ArrayList<>();
    static String skill;
    static String proficiency;


    public static void main(String[] args) {

        do {
            String choice;
            System.out.println("WELCOME! LET'S BUILD YOUR RESUME");
            System.out.println("press 'A' to Input Data");
            System.out.println("press 'B' to Display Resume");
            System.out.println("press 'Q' to Exit");

            choice = scanner.nextLine();
            switch (choice) {
                case "a":
                case "A":
                    firstInput();
                    break;
                case "b":
                case "B":
                    display();
                    break;
                case "q":
                case "Q":
                    System.exit(0);
                default:
                    System.out.println("Please enter the correct choice");
            }
        } while (true);
    }

    public static void education() {
        c1 = 0; //counter
        do {
            System.out.println("EDUCATION");
            System.out.println("School:");
            String school = scanner.nextLine();
            System.out.println("Graduation Year:");
            String year = scanner.nextLine();
            System.out.println("Major:");
            String major = scanner.nextLine();
            System.out.println("Degree:");
            String degree = scanner.nextLine();
            ed = new Education(school, year, major, degree);
            input2.add(ed);
            c1++;
            System.out.println("Do you want to add more? (Y|N)");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("yes") || (choice.equalsIgnoreCase("y"))) {

            } else {
                edCounter.add(c1);
                break;
            }
        } while (true);
    }

    public static void experience() {
        c2 = 0; //counter
        do {
            System.out.println("WORK EXPERIENCE");
            System.out.println("Company:");
            String company = scanner.nextLine();
            System.out.println("Job Title:");
            String title = scanner.nextLine();
            System.out.println("Dates worked:");
            String date = scanner.nextLine();
            System.out.println("Job Description:");
            String description = scanner.nextLine();
            ex = new Experience(company, title, date, description);
            input3.add(ex);
            c2++;
            System.out.println("Do you want to add more to your experience? (Y|N)");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("yes") || (choice.equalsIgnoreCase("y"))) {

            } else {
                expCounter.add(c2);
                break;
            }
        } while (true);
    }


    public static void skill() {
        c3 = 0; //counter
        do {
            System.out.println("Enter a skill:");
            skill = scanner.nextLine();
            System.out.println("Proficiency Rating");
            proficiency = scanner.nextLine();

            sk = new Skills(skill, proficiency);
            input4.add(sk);
            c3++;
            System.out.println("Do you want to add more to your skills? (Y|N)");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("yes") || (choice.equalsIgnoreCase("y"))) {

            } else {
                skillCounter.add(c3);
                break;
            }
        } while (true);
    }

    public static void firstInput() {
        System.out.println("please enter");
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Email Address:");
        String email = scanner.nextLine();
        System.out.println("Phone Number:");
        String phone = scanner.nextLine();
        education();
        experience();
        skill();
        roboM = new RoboMain(name, email, phone, ed, ex, sk);
        input1.add(roboM);
    }

    public static void display() {

        if (input1.size() == 0) {
            System.out.println();
            System.out.println("No resume on the system");
        } else {

            System.out.println("========================================================================================");
            System.out.println("PERSONAL INFORMATION");
            for (int i = 0; i < input1.size(); i++) {
                System.out.println("Name:" + input1.get(i).getName());
                System.out.println("Email:" + input1.get(i).getEmail());
                System.out.println("Phone Number:" + input1.get(i).getPhoneNum());

                System.out.println();
                System.out.println("EDUCATION:");

                for (int j = 0; j < edCounter.get(i); j++) {
                    System.out.println("Major:" + input2.get(j).getMajor());
                    System.out.println("School: " + input2.get(j).getSchool());
                    System.out.println("Graduation Year: " + input2.get(j).getYear());
                    System.out.println();
                }

                System.out.println("WORK EXPERIENCE:");

                for (int k = 0; k < expCounter.get(i); k++) {
                    System.out.println("Company:" + input3.get(k).getCompany());
                    System.out.println("Job Title: " + input3.get(k).getTitle());
                    System.out.println("Date: " + input3.get(k).getDatesOfEmployment());
                    System.out.println("Job Description: " + input3.get(k).getJobDescription());
                    System.out.println();
                }

                System.out.println("SKILLS:");
                //System.out.println(skillCounter.get(i));
                for (int l = 0; l < skillCounter.get(i); l++) {
                    System.out.println("Skill:" + input4.get(l).getSkill());
                    System.out.println("Proficiency Rating: " + input4.get(l).getProficiency_rating());
                    System.out.println("================================================================================");
                }
            }
        }

    }


}
