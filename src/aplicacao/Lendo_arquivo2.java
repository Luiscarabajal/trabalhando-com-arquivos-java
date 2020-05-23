/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Lendo_arquivo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String path = "C:\\Users\\Dell\\Documents\\NetBeansProjects\\trabalhando com arquivo\\lendo arquivo.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();

            while (line != null) {

                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        } 
    }

}
