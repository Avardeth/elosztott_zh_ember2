package zh_ember2;

import java.time.LocalDate;

public class Ember {
    private final String nev;
    private final int szulEv;
    
    public Ember(String nev, int szulEv) {
        this.nev = nev;
        this.szulEv = szulEv;
    }
    
    public String getNev() {
        return this.nev;
    }
    
    public int getKor() {
        LocalDate today = LocalDate.now();
        return today.getYear() - this.szulEv;
    }
    
    public String bemutatkozas() {
        return "A nevem " + this.getNev() + ", " + this.getKor() + " éves vagyok.";
    }
}
