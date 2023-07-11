package ui;

import model.Doctor;
import model.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {

    //Si quiero llamar a un metodo que este declarado dentro de la clase
    //que contiene el metodo Main ese metodo debe ser estatico por defecto.
    //Esto para no crear una instancia en la clase(main), para llamar a un menu,
    // Si no podemos importar la clase ui.UIMenu en la clase a usar los metodos
    // o no importar la clase y llamar lo metodos de la sig. forma: ui.UIMenu.showMenu();

    //Si se decide import se debe agregar dentro de una carpeta y el metodo debe ser public

    //Estos meses podran ser accedidos desde cualquier lugar o clase xq esta definida como static.
    //Para declar una variable constante(su variable nunca va a cambiar) en Java se usa la palabra reservada: Final (para variables que no cambien por ejemplo los meses) public static final String[] MONTHS
    //Static le da un nivel superior de acceso al metodo.
    public static final String[] MONTHS= {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                                     "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    public static Doctor doctorLogged;
    public static Patient patientLogged;

    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opcion deseada");

        int response = 0;

        do{
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf((sc.nextLine()));

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    response = 0;
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    //showPatientMenu();
                    authUser(2);
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");

            }
        }while (response != 0);

    }

    private static void authUser(int userType){ //autentica usuario
        //userType = 1 -> Doctor  && userType = 2 -> Patient




        //ArrayList de doctores registrados para usos de ejemplo - Datos como si estarán en un BD.
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Alejandro Martinez", "alej@gmail.com"));
        doctors.add(new Doctor("Karen Sosa", "karen@gmail.com"));
        doctors.add(new Doctor("Rocio Gómez", "rocio@gmail.com"));

        //ArrayList de pacientes registrados para usos de ejemplo - Datos como si estarán en un BD.
        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Anahi Salgado", "anahi@gmail.com"));
        patients.add(new Patient("Roberto Rodriguez", "roberto@gmail.com"));
        patients.add(new Patient("Carlos Sánchez", "carlos@gmail.com"));

        boolean emailCorrect = false;
        do{
            System.out.println("Insert your email: [a@a.com]");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            if (userType == 1){
                for (Doctor d: doctors){
                    if(d.getEmail().equals(email)){
                        emailCorrect = true;
                        //Obtener el usuario logeado
                        doctorLogged = d;
                        UIDoctorMenu.showDoctorMenu();

                    }
                }

            }

            if (userType == 2){
                for (Patient p: patients){
                    if(p.getEmail().equals(email)){
                        emailCorrect = true;
                        patientLogged = p;
                        UIPatientMenu.showPatientMenu();
                    }
                }
            }


        }while (!emailCorrect);// mientras email no es falso

    }



     static void showPatientMenu() {
        int response = 0;
        do{
            System.out.println("\n\n");
            System.out.println("model.Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    //Metodo para que imprima unicamente los primeros 3 meses
                    for (int i = 1; i < 4; i++){
                        System.out.println(i + ". "+MONTHS[i]);
                    }
                    
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response !=0);
    }

}
