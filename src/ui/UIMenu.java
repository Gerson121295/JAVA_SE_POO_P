package ui;

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
    public static String[] MONTHS= {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                                     "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

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
                    break;
                case 2:
                    response = 0;
                    showPatientMenu();
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");

            }
        }while (response !=0);

    }

     static void showPatientMenu() {
        int response = 0;
        do{
            System.out.println("\n\n");
            System.out.println("Patient");
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
