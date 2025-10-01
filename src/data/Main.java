package data;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String ruta = "C:\\Users\\alber\\Documents\\IntelIJ Projects\\Actividad3AAD\\res\\ejemplo.txt";

    //con esto aunque borres el archivo o no lo hagas antes, se hace siempre si no está
        try (PrintWriter writer = new PrintWriter(new FileWriter(ruta))) {
            System.out.println("ESCRIBIENDO POR PANTALLA...");
            writer.write("Hola buenas noches \n");
            writer.write("Voy a ir a jugar al badminton");
            /*Se puede hacer con un try catch normal, si lo haces con el normal tienes que cerrar el writer porque si no
            * no guarda lo escrito en el archivo y no se verá nada
            * en el caso de que uses un try with resources, lo que he hecho aquí, esto del close no hace falta*/
            //writer.close();
            Thread.sleep(1500);
            System.out.println("Escritura correcta");
        } catch (IOException | InterruptedException e) {
            //no sabía que se podía juntar las excepciones asi, gracias intellij
            throw new RuntimeException(e);
        }


    }
}