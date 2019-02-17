package com.dagmfasil;

public class Education {

    private static String school;
    private static String major;
    private static String year;
    private static String degree;

    public Education(String school, String year, String major, String degree) {
        this.school = school;
        this.year = year;
        this.major = major;
        this.degree = degree;
    }

    public static String getSchool() {
        return school;
    }

    public static String getYear() {
        return year;
    }

    public static String getMajor() {
        return major;
    }

    public static String getDegree() {
        return degree;
    }
}
