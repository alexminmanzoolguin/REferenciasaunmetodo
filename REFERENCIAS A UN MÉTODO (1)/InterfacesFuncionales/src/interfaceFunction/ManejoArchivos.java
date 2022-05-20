package interfaceFunction;

import java.io.BufferedReader;// para leer el texto de una secuencia de entrada (como un archivo)
import java.io.IOException;//capturar las excepciones que se hayan podido producir en el bloque de código delimitado por try y catch.

@FunctionalInterface //solo dispone de un método abstracto y pueden disponer de métodos por defecto
public interface ManejoArchivos {//interfaz publica de manejo de archivos
    
    public String leerArchivo(BufferedReader br)throws IOException;//e considera que una linea terminada cuando hay un salto de línea ('\ n'), un retorno de carro ('\ r'), o un retorno de carro seguido inmediatamente por un salto de línea.
    
    
}
