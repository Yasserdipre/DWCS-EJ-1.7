/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1.pkg7;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
/**
 *
 * @author yasse
 */
public class EJ17 {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un texto:");
        String texto = scanner.nextLine();

        // Usamos un TreeMap para almacenar las letras en orden alfabético automáticamente
        Map<Character, Integer> contadorLetras = new TreeMap<>();

        for (char c : texto.toLowerCase().toCharArray()) { // Recorremos el texto una sola vez
            if (Character.isLetter(c)) { // Solo procesamos letras
                contadorLetras.put(c, contadorLetras.getOrDefault(c, 0) + 1);
            }
        }

        // Mostramos el resultado
        System.out.println("Frecuencia de letras (ordenadas alfabéticamente):");
        for (Map.Entry<Character, Integer> entry : contadorLetras.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }
    
}
