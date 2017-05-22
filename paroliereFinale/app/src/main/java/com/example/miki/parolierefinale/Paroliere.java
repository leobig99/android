
package com.example.miki.parolierefinale;

import java.util.Arrays;
import java.util.Random;


public class Paroliere {

    protected String parola="";
    protected boolean[] viste;
    protected int tentativi;
    protected int  lunghezza=0;
    protected boolean vittoria=false;

    protected String [] s={"prova", "mela","banana","paroliere", "ciao come va"};

    public Paroliere() {
        Random gen =new Random();
        parola=s[gen.nextInt(s.length-1)+1];
        viste=new boolean [parola.length()];
        Arrays.fill(viste,false);
        viste[0]=true;
        viste[parola.length()-1]=true;
        tentativi=10;
        inizializzaLunghezza();
    }

    private void inizializzaLunghezza(){
        lunghezza=0;
        for (int i=1; i<parola.length()-1;i++)
            if(parola.charAt(i)!= ' ') lunghezza++;
    }

    public void controlla(String c){
        boolean trovata=false;
         if(c.equals(""))return;
        if(c.length()==1){
            char a=c.charAt(0);
            for (int i=0; i<parola.length();i++){
                if(parola.charAt(i)==a&&!viste[i]){
                    viste[i]=true;
                    trovata=true;
                    lunghezza--;
                }
            }
        }else{
            if(c.equals(parola)){
                lunghezza=0;
                vittoria=true;
                trovata=true;
            }
        }
        if(!trovata){
            tentativi--;
        }
    }

    public boolean finito(){
        if(lunghezza==0){
            vittoria=true;
        }
        if(tentativi<=0||lunghezza==0){
            return true;
        }else{
            return false;
        }
    }

    public int getTentativi(){
        return tentativi;
    }


    @Override
    public String toString() {
        String s="";
        for (int i=0; i<parola.length(); i++){
            if(viste[i]||parola.charAt(i)==' '){
                s=s+parola.charAt(i);
            }else{
                s=s+"-";
            }
        }
        return s;
    }
}