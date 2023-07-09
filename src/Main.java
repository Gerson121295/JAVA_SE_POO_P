import java.util.Date;
import java.util.Scanner;

import static ui.UIMenu.*;

public class Main {

    public static void main(String[] args) {
        //Creacion del objeto
         //Doctor= nombre de la clase
        // myDoctor = Nombre del obejto
        //New Doctor(); = la instanciacion - creando el objeto
        //Cuando queremos llamar a los metodos siempre se usa parentesis
        //new Doctor(); //El metodo constructor siempre va despues de la palabra reservada new,
        //y va a usar el nombre de la clase seguido de parentesis
/*
        Doctor myDoctor = new Doctor();
        //Doctor myDoctor = new Doctor("Gerson Ep"); // otra forma se envia un argumento name
        myDoctor.name = "Alejandro Rodriguez"; //asignando el nombre al doctor
        myDoctor.showName();
        myDoctor.showId(); // obtener id forma 1
        System.out.println(Doctor.id); // obtener id forma 2

        Doctor.id++; //Aumtamos en 1 para eso la variable debe ser estatica.

        Doctor myDoctorAnn = new Doctor();
        myDoctorAnn.name = "Ann";
        myDoctorAnn.showName();
        myDoctorAnn.showId(); // obtener id forma 1
        System.out.println(Doctor.id); // obtener id forma 2
*/

        /*// Ejemplo utilizando el constructor Doctor que requiere envio de argumentos
        Doctor myDoctor = new Doctor("Anahi Salgado", "Pediatria");
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

        /*// Se comento debido a que ahora traera las citas por medio del toString ya que se modifico en la clase.
        //Llamar una clase statica: contiene las citas del doctor
        for (Doctor.AvailableAppointment availableAppointment:
                myDoctor.getAvailableAppointments()) {
            System.out.println(availableAppointment.getDate() + " "
            + availableAppointment.getTime()
            );
        }
        */

        System.out.println("----------------------------\n\n");

        Patient patient = new Patient("Alejandra", "ale@gmail.com");
        System.out.println(patient);// al imprimir el patient trae el toString que se definio en la clase User.








        /*//Ejemplos
        Patient patient = new Patient("Alejandra", "ale@gmail.com");
        Patient patient2 = new Patient("Alejandro", "alo@gmail.com");

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