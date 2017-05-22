package com.example.miki.trisintent;

import java.util.Arrays;
import java.util.Random;



public class Paroliere {

   protected String parola="";
    protected boolean[] viste;
    protected int tentativi=10;
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
        lunghezza=parola.length()-2;
    }

    public void controlla(String c){
       // if(c.equals(""))return;
        if(c.length()==1){
           char a=c.charAt(0);
            for (int i=0; i<parola.length();i++){
                if(parola.charAt(i)==a&&!viste[i]){
                    viste[i]=true;
                    lunghezza--;
                }else{
                    tentativi--;
                }
            }
        }else{
            if(c.equals(parola)){
                lunghezza=0;
                vittoria=true;
            }else{
                tentativi--;
            }
        }

    }

    public boolean finito(){
        if(tentativi<=0||lunghezza==0){
            return true;
        }else{
            return false;
        }
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
