package tiposlamdatomr;

import java.util.function.*;

public class TiposLamdaToMR {

    public static void main(String[] args) {
        //Expression lambda a un método de instancia de un objeto existente
        Alumno alumno = new Alumno();//la costruccion de la clase alumno 
        // IntConsumer intConsumer2 = (int edad) -> alumno.setEdad(edad)
        IntConsumer intConsumer2 = alumno::setEdad;//Representa una operación que acepta un intargumento de valor único y no devuelve ningún resultado y elalumno hace referencia a la edad
        intConsumer2.accept(20);//llamar a un método estático cuyo argumento es el parámetro de la expresión lambda
        System.out.println("La edad recuperada es de: " + alumno.getEdad());//imprime la refencia der alumno de la clase y devuelve la edad

    }
}
