package com.dagmfasil;


public class Skills {

    private static String skill;
    private static String Proficiency_rating;


    public Skills(String skill, String proficiency_rating) {
        this.skill = skill;
        this.Proficiency_rating = proficiency_rating;
    }

    public static String getSkill() {
        return skill;
    }

    public static String getProficiency_rating() {
        return Proficiency_rating;
    }
}
