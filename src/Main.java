import org.w3c.dom.ls.LSOutput;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] valores;
        String texto;
        Boolean entradaValida=true;//verificar se todas as entradas sao 0 ou 1

        do {
            if (entradaValida==false)entradaValida=true;

            texto = input.nextLine();
            valores = texto.split(" ");



            for(int x=0;x<valores.length;x++){
                if ( !valores[x].equals("0") && !valores[x].equals("1") ){

                    entradaValida=false;

                    System.out.println("write a valid text with 4 numbers and between 0 or 1 ex: 0 0 0 1"+"\n");
                    break;
                }
            }


        } while (valores.length > 3 && !entradaValida);


        int IA = Integer.parseInt(valores[0]);
        int IB = Integer.parseInt(valores[1]);
        int FA = Integer.parseInt(valores[2]);
        int FB = Integer.parseInt(valores[3]);


        if (IA==FA & IB==FB) {
            System.out.println("0");
        }else if(IA!=FA && IB!=FB){
            System.out.println("1");
        } else if (IA!=FA && IB==FB) {
            System.out.println("1");
        }else if(IA==FA && IB!=FB){
            System.out.println("2");
        }


    }
}