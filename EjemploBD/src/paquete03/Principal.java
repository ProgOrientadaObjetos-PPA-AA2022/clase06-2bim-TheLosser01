/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.sql.SQLException;
import paquete01.Enlace;
import paquete02.Ciudad;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) throws SQLException {
        Enlace c = new Enlace();
        Scanner sc = new Scanner(System.in);
        boolean bandera = true;
        int salir = 0;

        while (bandera) {
            System.out.print("Ingrese el Nombre de la Cuidad: ");
            String nom = sc.nextLine();
            System.out.print("Ingrese la Poblacion de la Ciudad: ");
            int pob = sc.nextInt();
            Ciudad ciudad = new Ciudad(nom, pob);
            c.insertarCiudad(ciudad);
            
            //System.out.print("Ingrese 2 para salir");
            //salir = sc.nextInt();
            
            //if(salir == 2){
            //    bandera = false;
            //}
            //sc.nextLine();
                    

//        for (int i = 0; i < c.obtenerDataCiudad().size(); i++) {
//            System.out.printf("%s", c.obtenerDataCiudad().get(i));
//        }
            for (int i = 0; i < c.obtenerDataCiudad().size(); i++) {
                System.out.printf("%s", c.obtenerDataCiudad().get(i));
            }
        }
    }
}
