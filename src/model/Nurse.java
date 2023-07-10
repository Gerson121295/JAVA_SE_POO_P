package model;

public class Nurse extends User {

    private String speciality;
    public Nurse(String name, String email) {
        super(name, email);
    }

    //Los metodos definidos en clase padre con abstractas son obligatorios implementarlos en las clases hijas.
    @Override
    public void showDataUser() {
        System.out.println("Empleado del Hospital: Cruz Verde");
        System.out.println("Departamento: Cancerologia, Nutriologia, Pediatria");
    }

    //Getters and Setters
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }


}
