package Front;

import javax.swing.JOptionPane;

public class Mundial {
	
	
	public static void main(String[] args) {
	
	String []equipos = new String[4];
	equipos[0]="España";
	equipos[1]="Costa Rica";
	equipos[2]="Japon";
	equipos[3]="Alemania";
	
	int puntos[]= new int[4];
	 puntos[0]=0;
	 puntos[1]=0;
	 puntos[2]=0;
	 puntos[3]=0;
	
	
	int Pregunta1 = JOptionPane.showOptionDialog(null,
			"Elija el Grupo a insertar resultados ", "Grupos",
			JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
			null, new Object[] {"GRUPO A", "GRUPO B","GRUPO C","GRUPO D","GRUPO E","GRUPO F","GRUPO G","GRUPO H"}, null);



	if (Pregunta1==4){
	
	
		//PARTIDO 1
		
		
	int españita=	Integer.parseInt(JOptionPane.showInputDialog
			(null, "Partido "+equipos[0]+"-"+equipos[1]+"--> Inserte los goles de España:"));
	
	int CR=	Integer.parseInt(JOptionPane.showInputDialog
			(null, "Partido "+equipos[0]+"-"+equipos[1]+"--> Inserte los goles de Costa Rica:"));
	
	
		if(españita>CR) {
			 puntos[0]+=3;
			
		}
		
		else if (españita==CR) {
			
			puntos[0]+=1;
			puntos[1]+=1;
		}
		
		else if (españita<CR) {
			
			puntos[1]+=3;
		}
		
		
		
		
		
		//PARTIDO 2
		
	españita=	Integer.parseInt(JOptionPane.showInputDialog
				(null, "Partido "+equipos[0]+"-"+equipos[3]+"--> Inserte los goles de España:"));
		
	int alemania=	Integer.parseInt(JOptionPane.showInputDialog
				(null, "Partido "+equipos[0]+"-"+equipos[3]+"--> Inserte los goles de Alemania:"));
		
		
			if(españita>alemania) {
				 puntos[0]+=3;
				
			}
			
			else if (españita==alemania) {
				
				puntos[0]+=1;
				puntos[3]+=1;
			}
			
			else if (españita<alemania) {
				
				puntos[3]+=3;
			}
		
		
		
		
		
			//PARTIDO 3
		
	españita=	Integer.parseInt(JOptionPane.showInputDialog
				(null, "Partido "+equipos[0]+"-"+equipos[2]+"--> Inserte los goles de España:"));
		
	int japon=	Integer.parseInt(JOptionPane.showInputDialog
				(null, "Partido "+equipos[0]+"-"+equipos[2]+"--> Inserte los goles de Japon:"));
		
		
			if(españita>japon) {
				 puntos[0]+=3;
				
			}
			
			else if (españita==japon) {
				
				puntos[0]+=1;
				puntos[2]+=1;
			}
			
			else if (españita<japon) {
				
				puntos[2]+=3;
			}
			
			
			
			
			
			//PARTIDO 4
			
	japon=	Integer.parseInt(JOptionPane.showInputDialog
					(null, "Partido "+equipos[2]+"-"+equipos[3]+"--> Inserte los goles de Japon:"));
			
	alemania=	Integer.parseInt(JOptionPane.showInputDialog
					(null, "Partido "+equipos[2]+"-"+equipos[3]+"--> Inserte los goles de Alemania:"));
			
			
				if(japon>alemania) {
					 puntos[2]+=3;
					
				}
				
				else if (japon==alemania) {
					
					puntos[2]+=1;
					puntos[3]+=1;
				}
				
				else if (japon<alemania) {
					
					puntos[3]+=3;
				}
				
				
				
				//PARTIDO 5
				
	japon=	Integer.parseInt(JOptionPane.showInputDialog
						(null, "Partido "+equipos[2]+"-"+equipos[1]+"--> Inserte los goles de Japon:"));
				
	CR=	Integer.parseInt(JOptionPane.showInputDialog
						(null, "Partido "+equipos[2]+"-"+equipos[1]+"--> Inserte los goles de Costa Rica:"));
				
				
					if(japon>CR) {
						 puntos[2]+=3;
						
					}
					
					else if (japon==CR) {
						
						puntos[2]+=1;
						puntos[1]+=1;
					}
					
					else if (japon<CR) {
						
						puntos[1]+=3;
					}
					
					
					
					
					//PARTIDO 6
					
	alemania= Integer.parseInt(JOptionPane.showInputDialog
							(null, "Partido "+equipos[3]+"-"+equipos[1]+"--> Inserte los goles de Alemania:"));
					
	CR= Integer.parseInt(JOptionPane.showInputDialog
							(null, "Partido "+equipos[3]+"-"+equipos[1]+"--> Inserte los goles de Costa Rica:"));
					
					
						if(alemania>CR) {
							 puntos[3]+=3;
							
						}
						
						else if (alemania==CR) {
							
							puntos[3]+=1;
							puntos[1]+=1;
						}
						
						else if (alemania<CR) {
							
							puntos[1]+=3;
						}
	
						
						
								
	// AVISO IMPORTANTE!!!!    SE VIENE MEDIO PORRO..... PDT: LO HICE A LAS 2 DE LA MAÑANA NO PODIA CON MI VIDA
						
						
						

						String Primerclasificado=" ";
						String segundoclasificado=" ";

	
						
						
						
//	PRIMER CLASIFICADO					
						
			if ( puntos[0]>puntos[3]&& puntos[0]>puntos[2]|| puntos[0]>puntos[1]&& puntos[0]> puntos[3]|| puntos[0]>puntos[1]&& puntos[0]>puntos[2]) {
			Primerclasificado = equipos[0];}			

			if (puntos[1]> puntos[0]&&puntos[1]>puntos[2]||puntos[1]> puntos[0]&&puntos[1]> puntos[3]||puntos[1]>puntos[2]&&puntos[1]> puntos[3]) {
			Primerclasificado = equipos[1];}	

			if (puntos[2]>puntos[3]&&puntos[2]>puntos[0]||puntos[2]> puntos[1]&&puntos[2]>puntos[3]||puntos[2]>puntos[0]&&puntos[2]> puntos[1]) {
			Primerclasificado = equipos[2];}
						
			if (puntos[3]>puntos[0]&&puntos[3]>puntos[2]||puntos[3]>puntos[1]&&puntos[3]>puntos[0]) {
			Primerclasificado = equipos[3];
						}
			
			
//		SEGUNDO CLASIFICADO	
			if ( Primerclasificado == equipos[0]) {
				
				if (puntos[1]> puntos[0]&&puntos[1]>puntos[2]||puntos[1]> puntos[0]&&puntos[1]> puntos[3]||puntos[1]>puntos[2]&&puntos[1]> puntos[3]) {
					segundoclasificado = equipos[1];}	

				if (puntos[2]>puntos[3]&&puntos[2]>puntos[0]||puntos[2]> puntos[1]&&puntos[2]>puntos[3]||puntos[2]>puntos[0]&&puntos[2]> puntos[1]) {
					segundoclasificado = equipos[2];}
							
				if (puntos[3]>puntos[0]&&puntos[3]>puntos[2]||puntos[3]>puntos[1]&&puntos[3]>puntos[0]) {
					segundoclasificado = equipos[3];
							}
				}	
			
			if ( Primerclasificado == equipos[1]) {
				
				if ( puntos[0]>puntos[3]&& puntos[0]>puntos[2]|| puntos[0]>puntos[1]&& puntos[0]> puntos[3]|| puntos[0]>puntos[1]&& puntos[0]>puntos[2]) {
					segundoclasificado = equipos[0];}			

					if (puntos[2]>puntos[3]&&puntos[2]>puntos[0]||puntos[2]> puntos[1]&&puntos[2]>puntos[3]||puntos[2]>puntos[0]&&puntos[2]> puntos[1]) {
						segundoclasificado = equipos[2];}
								
					if (puntos[3]>puntos[0]&&puntos[3]>puntos[2]||puntos[3]>puntos[1]&&puntos[3]>puntos[0]) {
						segundoclasificado = equipos[3];
								}
				
			}
			
			
			if ( Primerclasificado == equipos[2]) {
				
				if ( puntos[0]>puntos[3]&& puntos[0]>puntos[2]|| puntos[0]>puntos[1]&& puntos[0]> puntos[3]|| puntos[0]>puntos[1]&& puntos[0]>puntos[2]) {
					segundoclasificado = equipos[0];}			

					if (puntos[1]> puntos[0]&&puntos[1]>puntos[2]||puntos[1]> puntos[0]&&puntos[1]> puntos[3]||puntos[1]>puntos[2]&&puntos[1]> puntos[3]) {
						segundoclasificado = equipos[1];}	

								
					if (puntos[3]>puntos[0]&&puntos[3]>puntos[2]||puntos[3]>puntos[1]&&puntos[3]>puntos[0]) {
						segundoclasificado = equipos[3];
								}	
			}
				
			if ( Primerclasificado == equipos[3]) {	
			
			if ( puntos[0]>puntos[3]&& puntos[0]>puntos[2]|| puntos[0]>puntos[1]&& puntos[0]> puntos[3]|| puntos[0]>puntos[1]&& puntos[0]>puntos[2]) {
				segundoclasificado = equipos[0];}			

				if (puntos[1]> puntos[0]&&puntos[1]>puntos[2]||puntos[1]> puntos[0]&&puntos[1]> puntos[3]||puntos[1]>puntos[2]&&puntos[1]> puntos[3]) {
					segundoclasificado = equipos[1];}	

				if (puntos[2]>puntos[3]&&puntos[2]>puntos[0]||puntos[2]> puntos[1]&&puntos[2]>puntos[3]||puntos[2]>puntos[0]&&puntos[2]> puntos[1]) {
					segundoclasificado = equipos[2];}
			}
								
							
		
				
		
		
		JOptionPane.showMessageDialog(null, 
				   "Equipo: "+equipos[0]+" - "+"Puntos: "+puntos[0]
				+"\nEquipo: "+equipos[1]+" - "+"Puntos: "+puntos[1]
				+"\nEquipo: "+equipos[2]+" - "+"Puntos: "+puntos[2]
				+"\nEquipo: "+equipos[3]+" - "+"Puntos: "+puntos[3]
						
				
						+"\nClasificados los equipos de: "+Primerclasificado+" y de "+segundoclasificado);
		
		
	
	
	}
}

}
