package com.ain_2_20_adis_kerimov.doctors;

public class DoctorModel {

    private String name;
    private String gender;
    private String age;
    private String nationality;
    private String position;
    private String yearsOfExperience;
    private String mainLocation;
    private String tel_number;
    private int docResource;

    public DoctorModel(String name, String gender, String age, String nationality, String position, String yearsOfExperience, String mainLocation, String tel_number, int doc) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.nationality = nationality;
        this.position = position;
        this.yearsOfExperience = yearsOfExperience;
        this.mainLocation = mainLocation;
        this.docResource = doc;
        this.tel_number = tel_number;
    }

    public String getTel_number() {
        return tel_number;
    }

    public void setTel_number(String tel_number) {
        this.tel_number = tel_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(String yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getMainLocation() {
        return mainLocation;
    }

    public void setMainLocation(String mainLocation) {
        this.mainLocation = mainLocation;
    }

    public int getDocResource() {
        return docResource;
    }

    public void setDocResource(int docResource) {
        this.docResource = docResource;
    }
}
