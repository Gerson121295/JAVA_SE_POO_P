public class Patient {
    //Atributos
    int id;
    private String name; // encapsular o esconder se hace agregando modificador de acceso como: private para que solo dentro de la clase pueda tener acceso.
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private double weight; // agregandole privato ya no tendra acceso desde el main para asigarle valores asi:  patient.weight = 60.5;    System.out.println(patient.weight); marcara error.
    private double height;
    private String blood;

    public Patient(String name, String email) {
        this.name = name;
        this.email = email;
        this.weight = 54.5;
        System.out.println(weight + "kg.");
    }

}
