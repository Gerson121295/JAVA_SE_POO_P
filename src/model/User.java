package model;

public abstract class User { //se agrego abstract para definir User como clase abstracta, por lo que ahora no se podra crear un objeto User
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;


    //Constructor
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    //Generacion de Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        //Validar que el numero telefonico tenga los 8 digitos.
        if(phoneNumber.length() > 8){
            System.out.println("El número telefono debe ser de 8 digitos maximo.");
        }else if (phoneNumber.length() == 8){ // si es igual a 8 digito permite la asignacion del valor.
            this.phoneNumber = phoneNumber; //se asigna el número de telefono.
        }
    }

    @Override // indica que este metodo no es propio de la clase model.User es un metodo de la clase Object(por default lo trae java) es un metodo que esta siendo extraido de la superClase(clase padre).
    public String toString() {
        return "model.User: "+ name +", Email: "+email+
                "\nAddress: "+address+". Phone: "+phoneNumber;
    }

    //Definicion de un metodo Abstracto, para dar informacion de los usuarios.
    //Los metodos definidos con abstractas son obligatorios implementarlos en las clases hijas.
    public abstract void showDataUser(); // Solo se define la firma del metodo mas no la implementacion la implementacion se hará en la clase hija.


}



