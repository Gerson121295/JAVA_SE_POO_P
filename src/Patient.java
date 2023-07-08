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

    }

    // Metodos Getters (Obtener dato) y Setters(asignar o modificar dato):
    // Leer/Escribir especificamente los valores de las variables miembro.
    // Como ya las variables estan encapsuladas(private) no se pueden editar, por lo que
    //para ingresar o modificar será utilizando los metodos getters y setters.
    // Los getter y setter no ayudan a validar y mantener la consistencia en la logica del negocio en nuestros modelos o clases.


    //54.5
    public void setWeight(double weight){
        this.weight = weight;
    }

    //54.5 Kg. String
    //Las reglas de negocio no se deben establecer en la clase main, sino en la clase donde le corresponde(van aqui).
    // segun las reglas del negocio para este caso el peso debe ser devuelto en formato de Kilogramos(Kg.).
    public String getWeight(){
        return this.weight + " Kg."; //Se establece formato de las reglas del negocio. retorno Kg.
    }

// Según las reglas del negocio para este caso la altura debe ser devuelta en formato de metros(mts.).
    public String getHeight() { //Height esta definida como double pero lo cambio a retornó un String.
        return height + "mts.";
    }

    public void setHeight(double height) {
        this.height = height;
    }



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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }


}











