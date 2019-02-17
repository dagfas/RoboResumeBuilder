package com.dagmfasil;

public class Experience {
    private static String company;
    private static String title;
    private static String datesOfEmployment;
    private static String jobDescription;

    public Experience(String company, String title, String date, String jobDescription) {
        this.company = company;
        this.title = title;
        this.datesOfEmployment = date;
        this.jobDescription = jobDescription;
    }

    public static String getCompany() {
        return company;
    }

    public static String getTitle() {
        return title;
    }

    public static String getDatesOfEmployment() {
        return datesOfEmployment;
    }

    public static String getJobDescription() {
        return jobDescription;
    }
}
