package Front;

import javax.swing.JOptionPane;

public class ExamenTest {
	
	public static void main(String[] args) {
		
		  int contador = 0;
		
		
		int Pregunta1 = JOptionPane.showOptionDialog(null,
				"¿CUANTO ES 1+1?", "Pregunta",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
				null, new Object[] {"1", "28","2","38"}, null);
				
		
				if (Pregunta1==2){
				JOptionPane.showMessageDialog(null, "Correcto", "Acierto", JOptionPane.INFORMATION_MESSAGE);
				  contador++;

				}
				else {

				JOptionPane.showMessageDialog(null, "Incorrecto", "Fallo",
				JOptionPane.ERROR_MESSAGE);
				}
	
				
				
				
		int Pregunta2 = JOptionPane.showOptionDialog(null,
				"¿CUANTO ES 11 + 2?", "Pregunta",
				 JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
				 null, new Object[] {"13", "8","42","112"}, null);
						
				
						if (Pregunta2==0){
						JOptionPane.showMessageDialog(null, "Correcto", "Acierto", JOptionPane.INFORMATION_MESSAGE);
						  contador++;

						}
						else {

						JOptionPane.showMessageDialog(null, "Incorrecto", "Fallo",
						JOptionPane.ERROR_MESSAGE);
						}
						
						
		int Pregunta3 = JOptionPane.showOptionDialog(null,"¿CUANTO ES 7 - 2?", "Pregunta",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
	    			null, new Object[] {"5", "8","23","11"}, null);
										
								
					if (Pregunta3==0){
						JOptionPane.showMessageDialog(null, "Correcto", "Acierto", JOptionPane.INFORMATION_MESSAGE);
						contador++;
						}
							
					else {

						JOptionPane.showMessageDialog(null, "Incorrecto", "Fallo", JOptionPane.ERROR_MESSAGE);
						}
			
		int Pregunta4 = JOptionPane.showOptionDialog(null,"¿CUANTO ES 7 x 7?", "Pregunta",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
			    	null, new Object[] {"56", "21","52","49"}, null);
												
										
					if (Pregunta4==3){
								JOptionPane.showMessageDialog(null, "Correcto", "Acierto", JOptionPane.INFORMATION_MESSAGE);
								contador++;
								}
									
					else {

						JOptionPane.showMessageDialog(null, "Incorrecto", "Fallo", JOptionPane.ERROR_MESSAGE);
								}					

					
		int Pregunta5 = JOptionPane.showOptionDialog(null,"¿CUANTO ES 81 / 9?", "Pregunta",
							JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
					    	null, new Object[] {"56", "4","9","2"}, null);
														
												
							if (Pregunta5==2){
										JOptionPane.showMessageDialog(null, "Correcto", "Acierto", JOptionPane.INFORMATION_MESSAGE);
										contador++;
										}
											
							else {

								JOptionPane.showMessageDialog(null, "Incorrecto", "Fallo", JOptionPane.ERROR_MESSAGE);
										}	
							
		int Pregunta6 = JOptionPane.showOptionDialog(null,"¿CUANTO ES  5 x 9?", "Pregunta",
						 JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
						 null, new Object[] {"56", "12","75","45"}, null);
																
														
						if (Pregunta6==3){
									JOptionPane.showMessageDialog(null, "Correcto", "Acierto", JOptionPane.INFORMATION_MESSAGE);
									contador++;
												}
													
						else {

							JOptionPane.showMessageDialog(null, "Incorrecto", "Fallo", JOptionPane.ERROR_MESSAGE);
							}
						
						
	    int Pregunta7 = JOptionPane.showOptionDialog(null,"¿Cual es la raiz cuadrada de 25?", "Pregunta",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
						null, new Object[] {"5", "19","65","12"}, null);
																		
																
							if (Pregunta7==0){
											JOptionPane.showMessageDialog(null, "Correcto", "Acierto", JOptionPane.INFORMATION_MESSAGE);
											contador++;
														}
															
							else {

								JOptionPane.showMessageDialog(null, "Incorrecto", "Fallo", JOptionPane.ERROR_MESSAGE);
									}
							
							
		
		 int Pregunta8 = JOptionPane.showOptionDialog(null,"¿Cual es la raiz cuadrada de 81?", "Pregunta",
						 JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
						 null, new Object[] {"12", "9","21","40"}, null);
																						
																				
							if (Pregunta8==1){
								JOptionPane.showMessageDialog(null, "Correcto", "Acierto", JOptionPane.INFORMATION_MESSAGE);
									contador++;
									}
																			
								else {

									JOptionPane.showMessageDialog(null, "Incorrecto", "Fallo", JOptionPane.ERROR_MESSAGE);
										}	
							
							
		int Pregunta9 = JOptionPane.showOptionDialog(null,"¿Cuanto es 9 x 9 + 9 ?", "Pregunta",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
						null, new Object[] {"123", "100","90","80"}, null);
																									
																							
							if (Pregunta9==2){
								JOptionPane.showMessageDialog(null, "Correcto", "Acierto", JOptionPane.INFORMATION_MESSAGE);
								  contador++;
										}
																						
							else {

								JOptionPane.showMessageDialog(null, "Incorrecto", "Fallo", JOptionPane.ERROR_MESSAGE);
													}	
							
							
		int Pregunta10 = JOptionPane.showOptionDialog(null,"¿ Cuanto es 1 x 1 + 1?", "Pregunta",
						 JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
						 null, new Object[] {"2", "3","4","3"}, null);
																												
																										
							if (Pregunta10==0){
										JOptionPane.showMessageDialog(null, "Correcto", "Acierto", JOptionPane.INFORMATION_MESSAGE);
										contador++;
													}
																									
							else {

								JOptionPane.showMessageDialog(null, "Incorrecto", "Fallo", JOptionPane.ERROR_MESSAGE);
																}	


				
						
						
						
					
					
					
					JOptionPane.showMessageDialog(null, "Tienes una nota de: " + contador + " /10");
				
				
	}
	
}
