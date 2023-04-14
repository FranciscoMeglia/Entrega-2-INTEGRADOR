package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Pronostico {

   /* static int ganadorPronostico;

    public static int[] leerPronostico (int cantPartidos , String ruta) {
        int[] resultadosPronosticados = new int[cantPartidos];
        try {
            BufferedReader reader = new BufferedReader(new FileReader(ruta));
            String linea = reader.readLine();
            int contadorLineas = 1;
            while (linea != null && contadorLineas <= cantPartidos) {

                String[] lineaToArr = linea.split(";");
                new Equipo(lineaToArr[0]);
                new Equipo(lineaToArr[4]);
                if (lineaToArr[1].equals("X")) {
                    ganadorPronostico = 1;
                } else if (lineaToArr[3].equals("X")) {
                    ganadorPronostico = 2;
                } else if (lineaToArr[2].equals("X")) {
                    ganadorPronostico = 0;
                }
                resultadosPronosticados[contadorLineas-1] = ganadorPronostico;
                contadorLineas ++;
                linea = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultadosPronosticados;
    } */


}
