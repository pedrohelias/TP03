package Party;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		
		//Parte do Anfitrião
		
		Telefone telanf1 = new Telefone(61, 984183063);
		Anfitriao anf1 = new Anfitriao("Pedro Helias Carlos", "email qualquer", telanf1, 40 , 140158278);
				
		anf1.status();
		
		//Fim parte do Anfitrião
		
		
		//Parte do Convidado
		
		
		Telefone telconv[] = new Telefone[5];
		Convidado conv[] = new Convidado[5];
		Presente gift[] = new Presente[5];
		
		telconv[0] = new Telefone(61, 984526578);
		telconv[1] = new Telefone(61, 984515678);
		telconv[2] = new Telefone(61, 988926558);
		telconv[3] = new Telefone(61, 988926468);
		telconv[4] = new Telefone(61, 984327898);
		
		gift[0] = new Presente("presente 1");
		gift[1] = new Presente("presente 2");
		gift[2] = new Presente("presente 3");
		gift[3] = new Presente("presente 4");
		gift[4] = new Presente("presente 5");
		
		
		conv[0] = new Convidado("Neymar", "esse aqui 2", telconv[0], 55, 789456123, true, gift[0]);
		conv[1] = new Convidado("Faustão", "esse aqui 4", telconv[1], 05, 789456123, true, gift[1]);
		conv[2] = new Convidado("Mc Brinquedo", "esse aqui 8", telconv[2], 99, 789456123, true, gift[2]);
		conv[3] = new Convidado("Terry Crews", "esse aqui 8", telconv[3], 35, 789456123, true, gift[3]);
		conv[4] = new Convidado("Batman Preparado", "esse aqui 12", telconv[4],25 , 789456123, true, gift[4]);
		
		
		for(int i = 0; i<5; i++) {
			conv[i].status();
		}
		
	// Fim parte do Convidado
		
		
		
		ArrayList<Convidado> lista = new ArrayList<Convidado>();
		
		for(int j = 0; j < 5; j++) {
			lista.add(conv[j]);
		}
		System.out.println(" ");
		
		for(int i=0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println(" ");
		
		
		
	
	}
		

}
