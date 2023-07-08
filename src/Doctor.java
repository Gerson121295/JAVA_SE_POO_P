public class Doctor {
    /** Atributos
     *
     */
   static int id = 0; // Autoincrement la variable debe ser estatica para poder llevar el control de autoincremento.
    String name;
    String speciality;

    Doctor(){ //opcional: al llamar el metodo Doctor() se ejecuta lo sig.
        System.out.println("COnstruyendo el objeto Doctor");

    }

    Doctor(String name, String speciality){ //Opcional agregarle un parametro
        System.out.println("El nombre del doctor asignado es: "+name);
        id++; // aumenta el id del doctor al crear un constructor.
        //this hace referencia a los elementos de la clase
        this.name = name; //este es igual al nombre de la variable del constructor Doctor.
        this.speciality = speciality;
    }

    /**
     * Comportamientos
     */
    public void showName(){ //Nombre del doctor
        System.out.println(name);
    }
    public void showId(){
        System.out.println("ID Doctor: "+ id);
    }

}



