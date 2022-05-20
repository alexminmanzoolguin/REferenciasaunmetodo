package interfaceFunction;//paqueteria

import java.io.BufferedReader;// para leer el texto de una secuencia de entrada (como un archivo)
import java.io.FileReader;//el cual nos permite leer la siguiente linea de caracteres de un archivo.
import java.io.IOException;//capturar las excepciones que se hayan podido producir en el bloque de código delimitado por try y catch.

public class Prueba {//clase publica prueba
    
    public static String procesarArchivo(ManejoArchivos ma)throws IOException{
        try(BufferedReader br=new BufferedReader(new FileReader("texto.txt"))){//Abra el flujo de entrada texto.txt para fines de lectura.
            return ma.leerArchivo(br);
        }
    }
    
    
    public static void main(String arg[]){//clase principal
        
        try{//e utiliza cuando se desean prever excepciones en el transcurso de la ejecución de un programa.
        //String linea1 = procesarArchivo((BufferedReader br)-> br.readLine());el mismo número de variables a ambos lados de la expresión, y además, en el mismo orden.
        //System.out.println(linea1);
        //lo que cambio aqui fue al reducir la linea en lago mas sencillo en referenciar el metodo en la primera linea
        String cadena1 = procesarArchivo(BufferedReader::readLine);//la variable cadena va ser igual al objetolocal procesarArchivo en parentecis NombreClase=BufferedReader::nombreMetodo=readLine
            System.out.println("cadena1 contiene: "+cadena1);//imprime el contenido de la cadena 1
            
            String cadena2 = procesarArchivo((BufferedReader br)-> br.readLine()+" "+br.readLine());//en la linea dos se va a imprimir el numero de variables  seria dobles.
            System.out.println("cadena2 contiene: "+cadena2);//se imprime el texto uno y dos
            
            String cadena3 = procesarArchivo((BufferedReader br)-> br.readLine()+" "+br.readLine()+" "+br.readLine());//en la linea tres se va a imprimir el numero de variables  seria las tres lineas que aparecenen el documento.
            System.out.println("cadena3 contiene: "+cadena3);//se imprimen las tres lineas
        }catch(IOException ex){//donde se especifica la excepción que se sabe puede ocurrir.
            ex.printStackTrace();//e utiliza para imprimir el registro del stack donde se ha iniciado la excepción
        }
        
    
    }
    
}
