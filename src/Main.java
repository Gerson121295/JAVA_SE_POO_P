import model.*;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        //Creacion del objeto
         //model.Doctor= nombre de la clase
        // myDoctor = Nombre del obejto
        //New model.Doctor(); = la instanciacion - creando el objeto
        //Cuando queremos llamar a los metodos siempre se usa parentesis
        //new model.Doctor(); //El metodo constructor siempre va despues de la palabra reservada new,
        //y va a usar el nombre de la clase seguido de parentesis
/*
        model.Doctor myDoctor = new model.Doctor();
        //model.Doctor myDoctor = new model.Doctor("Gerson Ep"); // otra forma se envia un argumento name
        myDoctor.name = "Alejandro Rodriguez"; //asignando el nombre al doctor
        myDoctor.showName();
        myDoctor.showId(); // obtener id forma 1
        System.out.println(model.Doctor.id); // obtener id forma 2

        model.Doctor.id++; //Aumtamos en 1 para eso la variable debe ser estatica.

        model.Doctor myDoctorAnn = new model.Doctor();
        myDoctorAnn.name = "Ann";
        myDoctorAnn.showName();
        myDoctorAnn.showId(); // obtener id forma 1
        System.out.println(model.Doctor.id); // obtener id forma 2
*/

        /*// Ejemplo utilizando el constructor model.Doctor que requiere envio de argumentos
        model.Doctor myDoctor = new model.Doctor("Anahi Salgado", "Pediatria");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);
         */


    // LLamado del metodo showMenu de la clase ui.UIMenu otra forma es importar la
        // clase y solo escribir el metodo showMenu();
         //UIMenu.showMenu(); //Sin Importar la clase, La clase no estaba dentro de la carpeta ui.

        //showMenu();

        Doctor myDoctor = new Doctor("Anahi Salgado", "Anahi@gmail.com");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        System.out.println(myDoctor.getAvailableAppointments()); //lista de objetos.

        System.out.println(myDoctor);

        System.out.println("\n---------------------\n");
        //El objeto user esta = a doctor(esta adquiriendo el comportamiento del doctor). Ya que no se puede instanciar un User, porque esta definida como una clase abstract
        User user = new Doctor("Karol", "kar@gmail.com");
        user.showDataUser();

        User userPa = new Patient("Sara", "sar@gmail.com");
        userPa.showDataUser();

        //------------------------Ejemplos de caso de uso de Clases Anonimas -------------------------------------------------

        //Instanciar la clase abstracta User por medio de una clase anonima. Ya que una clase definica como abstrac no se puede instanciar.
        System.out.println("----Instanciando una clase anonima");
        User user1 = new User("Anahi", "ana@gmail.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor\nHospital: Cruz verde\n" +
                        "Departamento: Geriatria");
            }
        };
        user1.showDataUser(); //Llamada del objeto user1



        // Utilizando interfaz metodo anonimo
        /*
        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };
        ISchedulable iSchedulable1 = new AppointmentDoctor();
        iSchedulable1.schedule();
        */
//-------------------------------------------------------------------------


        /*// Se comento debido a que ahora traera las citas por medio del toString ya que se modifico en la clase.
        //Llamar una clase statica: contiene las citas del doctor
        for (model.Doctor.AvailableAppointment availableAppointment:
                myDoctor.getAvailableAppointments()) {
            System.out.println(availableAppointment.getDate() + " "
            + availableAppointment.getTime()
            );
        }
        */


/*
        System.out.println("----------------------------\n\n");
        Patient patient = new Patient("Alejandra", "ale@gmail.com");
        System.out.println(patient);// al imprimir el patient trae el toString que se definio en la clase model.User.
*/






        /*//Ejemplos
        model.Patient patient = new model.Patient("Alejandra", "ale@gmail.com");
        model.Patient patient2 = new model.Patient("Alejandro", "alo@gmail.com");

        System.out.println(patient.getName());
        System.out.println(patient2.getName());
        patient2 = patient;

        System.out.println("---------");
        System.out.println(patient.getName());
        System.out.println(patient2.getName());
        System.out.println("---------");
        patient2.setName("Manuel");
        System.out.println(patient.getName());
        System.out.println(patient2.getName());


        System.out.println("---------");
        patient.setWeight(54.6);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("45667896");
        System.out.println(patient.getPhoneNumber());

        System.out.println();
        */




    }


}