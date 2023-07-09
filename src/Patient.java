public class Patient extends User {
    //Atributos
   /* //No se necesita estos atributos ya que heredan(extends) de la clase padre User
    int id;
    private String name; // encapsular o esconder se hace agregando modificador de acceso como: private para que solo dentro de la clase pueda tener acceso.
    private String email;
    private String address;
    private String phoneNumber;
    */

    //Atributos unicos de la clase patient
    private String birthday;
    private double weight; // agregandole privato ya no tendra acceso desde el main para asigarle valores asi:  patient.weight = 60.5;    System.out.println(patient.weight); marcara error.
    private double height;
    private String blood;

    public Patient(String name, String email) {
        super(name, email); //Super representa al objeto padre. //se envia los parametros que tiene el constructor de la clase padre.
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

    @Override //Sobreescribir el metodo toString de la clase padre que ya estaba escrito. //El resultado sera: resultado del padre mas el del hijo.
    public String toString() {
        return super.toString() + "\nAge: "+birthday+"\nWeight: "+getWeight()+
                "\nHeight "+getHeight()+ "\nBlood "+blood;
    }
}











