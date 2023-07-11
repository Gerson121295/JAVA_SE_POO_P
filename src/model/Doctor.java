package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    /** Atributos
     *
     */

    /* // No se necesita estos atributos ya que heredan(extends) de la clase padre model.User
   static int id = 0; // Autoincrement la variable debe ser estatica para poder llevar el control de autoincremento.
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    */

    private String speciality; //Atributo unico del doctor


/*// Ya no se utiliza constuctor vacio
    model.Doctor(){ //opcional: al llamar el metodo model.Doctor() se ejecuta lo sig.
        System.out.println("COnstruyendo el objeto model.Doctor");
    }
    */

    public Doctor(String name, String email){ //Opcional agregarle un parametro
        super(name, email); //Super hace referencia a la clase padre,

     //   System.out.println("El nombre del doctor asignado es: "+name);
       // id++; // aumenta el id del doctor al crear un constructor. // ya no se necesita se realizará por medio de una BD el aumento del id.

        //this hace referencia a los elementos de la clase
        //this.name = name; //este es igual al nombre de la variable del constructor model.Doctor. // ya esta name definido en esta clase por lo que no se usa.
      //  this.speciality = speciality;
    }

    //Getters and Setters
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    /**
     * Comportamientos
     */
  /* // Ya no se usa estos metodos.  name, id no esta definido en esta clase.
    public void showName(){ //Nombre del doctor
        System.out.println(name);
    }
    public void showId(){
        System.out.println("ID model.Doctor: "+ id);
    }
*/


    //Array de citas.
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(String date, String time){ //metodo para añadir muchas citas.
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }

    //Devolver las citas disponibles:
    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }


    //Sobreescribiendo el metodo toString
    @Override
    public String toString() {
        return super.toString() +"\n Speciality: "+speciality+ "\nAvailable: "+ //dejar el super.toString() permite reutilizar la funcionalidad de la clase padre
                                availableAppointments;
    }

    //Metodo Abstracto definido en la clase abstracta User.
    //Los metodos definidos con abstractas son obligatorios implementarlos en las clases hijas.
    @Override
    public void showDataUser() {
        System.out.println("Empleado del Hospital: Cruz Roja");
        System.out.println("Departamento: Cancerologia ");
    }



    // Clase estatica: Un doctor puede tener muchas citas disponibles
    public static class AvailableAppointment{ //Available Appointment -- Cita disponible
        private int id;
        private Date date;
        private String time;
        //private String address;
        //private String phoneNumber;

        //Tenemos un string en AvailableAppointment que queremos que sea un tipo date
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy"); // Ayuda a formatear fechas, para especificar el formato de las fechas que queramos usar.ejemp: "dd/MM/yyyy", "dd-MM-yyyy", "dd/MM/yy"

        // Constructor
        public AvailableAppointment(String date, String time) {
            try {
                this.date = format.parse(date);  //this.date = date:  - Agregamos nuestro SimpleDateFormat
            } catch (ParseException e) {
                e.printStackTrace();
                //throw new RuntimeException(e);
            }
            this.time = time;
        }


        //Getters and Setters

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        //Sobrecarga de metodo
        public String getDate(String DATE) {
            return format.format(date);
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }


        //Sobreescribir el metodo toString
        @Override
        public String toString() {
            return "Available Appointments \nDate: "+date+ "\nTime: "+time;
        }
    }

}



