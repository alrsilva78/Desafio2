package controller;

import model.DadosConsultaString;
import java.util.Scanner;

public class ConsultaString extends DadosConsultaString{

    Scanner scanner = new Scanner(System.in);


    public ConsultaString (String fraseConsulta) {
        super(fraseConsulta);
    }


    public void consultaString (){
 

        System.out.println("Digite uma palavra ou frase: ");
        setFrase(scanner.nextLine().toLowerCase());

        int contador = 0;
      
        for (int i = 0; i < getFrase().length(); i++) {
            if (getFrase().charAt(i)=='a') {
                contador ++;
            }   
            }
            if (contador != 0) {
                System.out.println("A quantidade de Letra 'a' na palavra: " + getFrase() + " é " + contador );
                
            } else {
                System.out.println("A palavra: " + getFrase() + "não contém a letra 'a'");
                
            }
            
        }


    }

