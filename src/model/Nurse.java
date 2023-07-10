package model;

public class Nurse extends User {

    private String speciality;
    public Nurse(String name, String email) {
        super(name, email);
    }

    //Getters and Setters
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }


}
