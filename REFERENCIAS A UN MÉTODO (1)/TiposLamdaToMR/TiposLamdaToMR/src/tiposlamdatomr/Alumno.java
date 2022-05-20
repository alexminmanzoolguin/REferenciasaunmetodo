package tiposlamdatomr;//paqueteria


public class Alumno {//Agreguemos la clase dentro del fichero
   // Para representar los datos unalumno puede interesarnos
    private String nombre;//representa una cadena de caracteres no modificable de la variable nombre esta en forma privada
    private int edad;//representa el dato de dorma privada de tipo entero la edad
    public Alumno(){};//es un fichero de nombre Alumno es una clase hecha por la clase principal
    public Alumno(String nombre, int edad){
        this.nombre = nombre;//es una variable que hace referencia al objeto nombre
        this.edad = edad;//es una variable que hace referencia al objeto edad
    }
    public static void duplicarEdad(int edad){//esta clase o fichero se para hacerla operacion
        System.out.println("La edad duplicada es: "+ (2*edad));//imprime la edad multiplicada por 2
    }
    /**
     * Get the value of edad
     *
     * @return the value of edad
     */
    public int getEdad() {//Devuelve la edad 
        return edad;//regresa a la variable edad
    }

    /**
     * Set the value of edad
     *
     * @param edad new value of edad
     */
    public void setEdad(int edad) {//modifica la edad
        this.edad = edad;//elparametro edad evalua la edad
    }

    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {//Devuelve el nombre
        return nombre;//regresa a nombre
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {//modifica el nombre
        this.nombre = nombre;//evalua el nombre
    }
    
}
