package Front;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Loteria {
	
	

	public static void main(String[] args) {
		
		
		
		
		Scanner ent = new Scanner(System.in);
        System.out.println("Introduzca con cuantos numeros va jugar");
        int intentos = ent.nextInt();
        System.out.println("Introduce el límite inferior del intervalo de los números."+"\ncomo maximo entre 0 y 49");
        int numinferior = ent.nextInt();
        System.out.println("Introduce el límite superior del intervalo de los números."+"\ncomo maximo entre 0 y 49");
        int numsuperior = ent.nextInt();
        System.out.println("Ha elegido jugar con " + intentos + " numeros. y con un rango de juego entre "+numinferior+" y "+numsuperior);
        
       
        System.out.println("Introduzca "+ intentos + " números del "+ numinferior+ " al " +numsuperior+  "sin repetir ninguno: ");
        int numerosApostados [] = new int[intentos];

		for(int i=0;i<intentos;i++){
			
			numerosApostados[i]= ent.nextInt();
			}
		
		
		
//		3º.- Se muestran los números que ha elegido el usuario. (1 PUNTO)
		
	            System.out.println("Números del usuario");
	            Arrays.sort(numerosApostados);
	            for (int ii : numerosApostados) {
	                System.out.println(ii);
	            }
			
			
//	if(numerosApostados[i]<numinferior || numerosApostados[i]>numsuperior){
//		 
//		System.out.println("Número no permitido, intente de nuevo!!");
	            
	            
	 
	            
	            
	            
// 4º.- Se generan el mismo número de números por la máquina usando la clase Random y
// el método nextInt(n), éste método genera enteros aleatorios entre 0 y n-1. En el caso de que el número generado sea cero se debe generar otro. (2 PUNTOS)
//		
	          
//		        5º.- Se muestran los números generados por la máquina. (1 PUNTO)	            
	            

			Random num = new Random();
			 int maquina[]= new int[intentos]; 
			
			
	       
	        for (int j = 0; j < maquina.length; j++) {
	            maquina[j]=num.nextInt(numsuperior);
	            
	            do { maquina[j]=num.nextInt(numsuperior); }
	            while (maquina[j] < numinferior);
	        }
	        
	        System.out.println("Números de la máquina");
	        Arrays.sort(maquina);
	        for (int j : maquina) {
	            System.out.println(j);}
        
        
	       
	        
	     

//	        6º.- Se comparan los números de jugador y máquina y se muestran los aciertos. (2 PUNTOS)
	        
	        int aciertos=0;
	        
	       for (int j : maquina) {
	    	   
	    	   for (int ii : numerosApostados)
	    	   {
	    		    
	    	       if(j==ii) {
	    	    	   
	    	        	aciertos++;
	    	        
	    	        } 
	    	   }
			
		}
	        
	    
	        
	        System.out.println("Finalizado tiene  "+aciertos+" aciertos");
	        
	        
	        
	        
	        
        
      

}}
//	}}


