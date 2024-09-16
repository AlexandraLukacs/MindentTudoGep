package teszt;

import modell.MindentTudoGep;

public class MindentTudoGepTeszt {
    public static void main(String[] args) {
        new MindentTudoGepTeszt().tesztesetek();
    }

    private void tesztesetek() {
        tesztLottoGeneralas();
    }

    private void tesztLottoGeneralas() {
        MindentTudoGep gep = new MindentTudoGep();
        String szelveny = gep.getSzelvenySzoveg();
        
        System.out.println("teszt: nem üres");
        assert !szelveny.isBlank() : "üres a szelvény!";
        
        System.out.println("teszt: 5 számot tartalmaz");
        String[] sz = szelveny.split(",");
        assert sz.length == 5 : "nem 5 elemű";
        for (String s : sz) {
            s = s.trim();
            for (int i = 0; i < s.length(); i++) {

            }
        }
    }
}
