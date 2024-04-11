package titio;

import java.util.Scanner;

public class Avaliação1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declarando as váriaveis
		int cont, num1, num2, res;
		
		 num1 = 0;
		 num2 = 1;
        // Escreva aas variáveis 
		 
		System.out.println(num1);
		System.out.println(num2);
		// para                               //inicio
			for (cont = 3; cont <= 8; cont++) {
			    res = num1 + num2;
			    System.out.println(res);
			    num1 = num2;
			    num2 = res;
	    
	 } 
	//fim 
  }

}