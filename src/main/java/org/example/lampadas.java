package org.example;

import java.util.Scanner;

public class lampadas {
    public static Scanner input = new Scanner(System.in);
    private String texto;

    int IA,IB,FA,FB;

    /*public lampadas(String texto) {
        this.texto = texto;

        if(!verificador(texto)){
            do{
                texto=input.nextLine();
            }while (!verificador(texto));
        }


    }*/



    public boolean verificador(String texto){
        String[] valores;
        valores = texto.split(" ");

        if (valores.length>4 || valores.length<4){
            System.out.println("Write a text with 4 values");
            return false;
        }


        for(int x=0;x<valores.length;x++){
            if ( !valores[x].equals("0") && !valores[x].equals("1") ){
                System.out.println("write a valid text with only 0 and 1 ex: 0 0 0 1"+"\n");
                return false;
            }
        }

        IA=Integer.parseInt(valores[0]);;
        IB=Integer.parseInt(valores[1]);;
        FA=Integer.parseInt(valores[2]);;
        FB=Integer.parseInt(valores[3]);;
        return true;
    }

    public int quantosInterruptores(){
        if(IA!=FA && IB!=FB){
            return 1;
        } else if (IA!=FA && IB==FB) {
            return 1;
        }else if(IA==FA && IB!=FB){
            return 2;
        }
        return 0;
    }
}
