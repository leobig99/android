package com.example.miki.prova;

/**
 * Created by miki on 15/05/2017.
 */

public class GiocoTris {
    String vinto="";
    String campo[];
    int turno=0;

    public GiocoTris() {
        this.campo =new String[9];
        for (int i=0; i<campo.length;i++)
            campo[i]="";

    }

    public void mossa(int pos){
        if(turno==0){
            campo[pos]="X";
            turno=1;
        }else{
            campo[pos]="O";
            turno=0;
        }

        vincitore();
    }
    public String isVittoria(){
        return vinto;
    }

    public void vincitore(){

        if(campo[0].equals(campo[1])&&campo[1].equals(campo[2])&& !campo[0].equals("")){
            vinto=campo[0];
        }
        if(campo[0].equals(campo[4])&&campo[4].equals(campo[8])&& !campo[0].equals("")){
            vinto=campo[0];
        }
        if(campo[0].equals(campo[3])&&campo[3].equals(campo[6])&& !campo[0].equals("")){
            vinto=campo[0];
        }
        if(campo[1].equals(campo[4])&&campo[4].equals(campo[7])&& !campo[1].equals("")){
            vinto=campo[1];
        }
        if(campo[2].equals(campo[5])&&campo[5].equals(campo[8])&& !campo[2].equals("")){
            vinto=campo[2];
        }
        if(campo[2].equals(campo[4])&&campo[4].equals(campo[6])&& !campo[2].equals("")){
            vinto=campo[2];
        }
        if(campo[3].equals(campo[4])&&campo[4].equals(campo[5])&& !campo[3].equals("")){
            vinto=campo[3];
        }
        if(campo[6].equals(campo[7])&&campo[7].equals(campo[8])&& !campo[6].equals("")){
            vinto=campo[6];
        }


    }
}
