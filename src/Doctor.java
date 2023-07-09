import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{
    /** Atributos
     *
     */

    /* // No se necesita estos atributos ya que heredan(extends) de la clase padre User
   static int id = 0; // Autoincrement la variable debe ser estatica para poder llevar el control de autoincremento.
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    */

    private String speciality; //Atributo unico del doctor


/*// Ya no se utiliza constuctor vacio
    Doctor(){ //opcional: al llamar el metodo Doctor() se ejecuta lo sig.
        System.out.println("COnstruyendo el objeto Doctor");
    }
    */

    Doctor(String name, String email){ //Opcional agregarle un parametro
        super(name, email); //Super hace referencia a la clase padre,

        System.out.println("El nombre del doctor asignado es: "+name);
       // id++; // aumenta el id del doctor al crear un constructor. // ya no se necesita se realizará por medio de una BD el aumento del id.

        //this hace referencia a los elementos de la clase
        //this.name = name; //este es igual al nombre de la variable del constructor Doctor. // ya esta name definido en esta clase por lo que no se usa.
        this.speciality = speciality;
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
        System.out.println("ID Doctor: "+ id);
    }
*/




    //Array de citas.
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){ //metodo para añadir muchas citas.
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }

    //Devolver las citas disponibles:
    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }


    // Clase estatica: Un doctor puede tener muchas citas disponibles
    public static class AvailableAppointment{ //Available Appointment -- Cita disponible
        private int id;
        private Date date;
        private String time;
        private String address;
        private String phoneNumber;

        // Constructor
        public AvailableAppointment(Date date, String time) {
            this.date = date;
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

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

    }


}



