package Deivis;

import javax.swing.JOptionPane;

public class Juegodepalabras{
	
	
	
	public static void main(String[] args) {
		
		
		
        JOptionPane.showMessageDialog(null, "Bienvenido al Juego de Palabras");

        int numPalabras = Integer.parseInt(JOptionPane.showInputDialog("inserte el número de palabras con las que deseas jugar:"));

        String[] palabras = new String[numPalabras];
        for (int i = 0; i < numPalabras; i++) {
            palabras[i] = JOptionPane.showInputDialog("inserte la palabra" + (i+1) + ":");
        }
        JOptionPane.showMessageDialog(null, "Las palabras ingresadas son:\n" + String.join(", ", palabras));
		
        int totaldeCaracteres = 0;
        int maximoCaracteres = 0;
        int minimoCaracteres = Integer.MAX_VALUE;
        for (String palabra : palabras) {
 
        	int longitud = palabra.length();
            totaldeCaracteres += longitud;
            if (longitud > maximoCaracteres) {
            	maximoCaracteres = longitud;
            }
            if (longitud < minimoCaracteres) {
            	minimoCaracteres = longitud;
            }
        }
        double mediaCaracteres = (double) totaldeCaracteres / numPalabras;

        JOptionPane.showMessageDialog(null,
                "Total de caracteres es de: " + totaldeCaracteres + "\n" +
                "Media de caracteres es de: " + mediaCaracteres + "\n" +
                "El maximo de caracteres es de: " + maximoCaracteres + "\n" +
                "El minimo de caracteres es de: " + minimoCaracteres);
    }
		
		
		
		
		
		
		
	}