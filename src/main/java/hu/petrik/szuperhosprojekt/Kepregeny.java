package hu.petrik.szuperhosprojekt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Kepregeny {

    public static List<Szuperhos> szuperhosLista = new ArrayList<>();

    public static void szereplok(String fajlNev){
        try {
            BufferedReader br = new BufferedReader( new FileReader( fajlNev ) );

            String sor = br.readLine();
            while(sor != null){
                String[] adatok = sor.split(" ");

                Szuperhos sz;

                if(adatok[0].equals("Batman")){
                    sz = new Batman();
                }
                else{
                    sz = new Vasember();
                }

                for (int i = 0; i < Integer.parseInt(adatok[1]); i++) {
                    ((Milliardos)sz).kutyutKeszit();
                }

                szuperhosLista.add(sz);

                sor = br.readLine();
            }

            br.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void szuperhosok(){

        for( Szuperhos sz : szuperhosLista ){
            System.out.println(sz);
        }

    }

}
