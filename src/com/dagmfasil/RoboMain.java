package com.dagmfasil;

public class RoboMain {

    private static String name;
    private static String phoneNum;
    private static String email;
    private static Education education;
    private static Experience experience;
    private static Skills skills;


    public RoboMain(String name, String phoneNum, String email, Education education, Experience experience, Skills skills) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.email = email;
        this.education = education;
        this.experience = experience;
        this.skills = skills;
    }


    public static String getName() {
        return name;
    }

    public static String getPhoneNum() {
        return phoneNum;
    }

    public static String getEmail() {
        return email;
    }

    public static Education getEducation() {
        return education;
    }

    public static Experience getExperience() {
        return experience;
    }

    public static Skills getSkills() {
        return skills;
    }


}
