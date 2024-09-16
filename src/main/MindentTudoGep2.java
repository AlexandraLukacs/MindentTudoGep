package main;

import modell.MindentTudoGep;

public class MindentTudoGep2 {
    
    public static void main(String[] args) {
       new MindentTudoGep2().lottoSzelvenyBemutato();
    }

    private void lottoSzelvenyBemutato() {
        MindentTudoGep gep = new MindentTudoGep();
        //boolean[] szelveny = gep.getSzelvenyBoole();
        //mutatBooleSzelveny(szelveny);
    }
    
    

    private void mutatBooleSzelveny(boolean[] szelveny) {
        for (int i = 1; i < szelveny.length; i++) {
            boolean b = szelveny[i];
            if (b){
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }
    
}
