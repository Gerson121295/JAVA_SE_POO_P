package ui;

import model.Doctor;

import java.util.*;

public class UIPatientMenu {
    public static void showPatientMenu(){
        int response = 0;

        do{
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("Welcome: " + UIMenu.patientLogged); //ya deberia estar logeado el paciente
            System.out.println("1. Book an appointment");
            System.out.println("2. My Appointment");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    showBookAppointmentMenu();
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }
        }while (response !=0 );
    }


    private static void showBookAppointmentMenu(){
        int response = 0;

        do{
            System.out.println("::Book an appointment"); //Reservar una cita
            System.out.println(":: Select date: ");

            //Numeracion de la lista de fechas -- El 1er. parametro de Map(integer)
            //Indice de la fecha seleccionada
            //[doctors]  ->
            // 1. - doctor1  --un doctor tiene un array de fechas disponibles
            //          //-1 fecha1
            //          //-2 fecha2
            //          //-3 fecha3
            // 2. - doctor1  --un doctor tiene un array de fechas disponibles
            //          //-1 fecha1
            //          //-2 fecha2
            //          //-3 fecha3

            //El primer Integer lleva el indice de doctor:  1. - doctor1
            //El 2do. Integer lleva el indice de fechas disponibles de doctor:  //-1 fecha1
            //Doctor es el row completo del doctor(doctor1 y sus fechas disponibles)

            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
            int k = 0;
            for(int i = 0; i < UIDoctorMenu.doctorsAvailableAppointments.size(); i++){ // recorre el doctorsAvailableAppointments para extraer sus citas, .size() = para que se recorra segun el tamaño que tenga.
                ArrayList<Doctor.AvailableAppointment>availableAppointments
                        = UIDoctorMenu.doctorsAvailableAppointments.get(i).getAvailableAppointments();
                //Fechas
                Map<Integer, Doctor> doctorAppointments = new TreeMap<>();  // TreeMap nos da una estructura de arbol.
                for(int j = 0; j < availableAppointments.size(); j++ ){
                    k++; //desplegando la lista de fechas de doctores
                    System.out.println(k + ". " + availableAppointments.get(j).getDate()); //getDate = dame las fechas
                    doctorAppointments.put(Integer.valueOf(j), UIDoctorMenu.doctorsAvailableAppointments.get(i)); // put metodo para inserta en Map

                    doctors.put(Integer.valueOf(k), doctorAppointments); //Lista de fechas disponibles
                }
            }

            Scanner sc = new Scanner(System.in);
            int responseDateSelected = Integer.valueOf(sc.nextLine());

            Map<Integer, Doctor> doctorAvailableSelected = doctors.get(responseDateSelected);
            Integer indexDate = 0;
            Doctor doctorSelected = new Doctor("","");
                    //Recorrer el arbol interno primero que el externo.

            //Recorrido para obtener los datos confirmados
            for(Map.Entry<Integer, Doctor> doc : doctorAvailableSelected.entrySet()){
                indexDate = doc.getKey(); //Integer - obtengo el indice  -- me encuentro en el 2do Integer. -> //-1 fecha1
                doctorSelected = doc.getValue(); //Doctor - obtengo el doctor
            }

            System.out.println(doctorSelected.getName() + //obtengo el nombre
                    ". Date: " +
                    doctorSelected.getAvailableAppointments().get(indexDate).getDate()+
                    ". Time: " +
                    doctorSelected.getAvailableAppointments().get(indexDate).getTime());

            System.out.println("Confirm your appointment: \n1. Yes \n2. Change Data");
            response = Integer.valueOf(sc.nextLine());

            if(response == 1){
                UIMenu.patientLogged.addAppointmentDoctors(
                        doctorSelected,
                        doctorSelected.getAvailableAppointments().get(indexDate).getDate(null), //envia la fecha
                        doctorSelected.getAvailableAppointments().get(indexDate).getTime()); //tiempo hora

                showPatientMenu();
            }



        }while (response != 0);
    }

    private static void showPatientMyAppointments(){
        int response = 0;
        do{
            System.out.println("::My Appointments");
            if(UIMenu.patientLogged.getAppointmentDoctors().size() == 0 ){
                System.out.println("Don´t have appointments");
                break; // para salir del ciclo
            }

            // Si tiene muestra las citas que tiene ya agendadas
            for (int i = 0; i < UIMenu.patientLogged.getAppointmentDoctors().size(); i++) {
                int j = i + 1 ;
                System.out.println(j + ". "+
                        "Date: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDate() +
                        "Time: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getTime() +
                        "\n Doctor: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDoctor().getName()
                        );
            }

            System.out.println("0. Return");

            
        }while(response != 0);
    }
}
