package modell;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class MindentTudoGep {
    private boolean[] szelvenyBoole;
    private int[] szelvenyInt;
    private ArrayList<Integer> szelvenyLista;
    private HashSet<Integer> szelvenyHalmaz;
    private TreeSet<Integer> szelvenyHalmazRendezett;
    
    public MindentTudoGep(){
        szelvenyBoole = new boolean[91];//1..90
        szelvenytGeneral();
        
        szelvenyInt = new int[5];
        intSzelvenytGeneral();
        
        szelvenyLista = new ArrayList<>();
        szelvenytGeneral();
        
        szelvenyHalmaz = new HashSet<>();
    }
    
    public void szelvenytGeneral() {
        while(szelvenyLista.size()<5){
            int v = (int)(Math.random()*90)+1;
            if(szelvenyLista.contains(v)){
                szelvenyLista.add(v);
            }
        }
        Collections.sort(szelvenyLista);
        
        while (szelvenyHalmaz.size()<5) {            
            int v = (int)(Math.random()*90)+1;
            szelvenyHalmaz.add(v);
        }
    }
    
    private void intSzelvenytGeneral() {
        int db = 0;
         while (db < 5) {            
            int v = (int)(Math.random()*90)+1;
            if(!benneVan(v,db)){
                szelvenyInt[db++]=v;
            }
        }
    }
    
    private boolean benneVan(int szam, int db){
        int i = 0;
        while (i < db && !(szelvenyInt[i] == szam)) {            
            i++;
        }
        return i < db; // || i>= db;
    }
    
    public String getSzelveny(){
        return "";
    }
    
//    public void  szelvenytGeneral(){
//        Arrays.fill(szelvenyBoole, false);
//        int db = 0;
//        while (db < 5) {            
//            int v = (int)(Math.random()*90)+1;
//            if(!szelvenyBoole[v]){
//                szelvenyBoole[v]=true;
//                db++;
//            }
//        }
//    }
//    
//    public boolean [] getSzelvenyBoole(){
//        return szelvenyBoole;
//    }

    public String getSzelvenySzoveg() {
        return "";
    }


}
