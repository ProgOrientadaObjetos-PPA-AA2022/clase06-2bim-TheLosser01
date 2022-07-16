/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.sql.SQLException;
import java.util.Scanner;
import paquete01.Enlace;
import paquete02.Auto;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        Enlace c = new Enlace();
        Auto a = new Auto();
        boolean bandera = true;
        int salir = 0;
        //a.establecerPlaca("LBNS0001");
        //a.establecerValorMatricula(200.2);
        while (bandera) {
            System.out.print("Ingrese la Matricula: ");
            String placa = sc.nextLine();
            System.out.print("Ingrese el valor de la Matricula: ");
            double vM = sc.nextDouble();
            a.establecerPlaca(placa);
            a.establecerValorMatricula(vM);
            c.insertarAuto(a);

            System.out.print("Ingrese 2 para salir ");
            salir = sc.nextInt();

            if (salir == 2) {
                bandera = false;
            }
            sc.nextLine();
        }


        /*        for (int i = 0; i < c.obtenerDataAuto().size(); i++) {
            System.out.printf("%s\n", c.obtenerDataAuto().get(i));
        }*/
    }
}
