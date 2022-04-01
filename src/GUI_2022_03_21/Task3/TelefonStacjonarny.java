package GUI_2022_03_21.Task3;

public class TelefonStacjonarny
        implements Comparable<TelefonStacjonarny>{
    private String producent;
    private int cena;

    public TelefonStacjonarny(String producent, int cena){
        this.producent = producent;
        this.cena = cena;
    }

    public String toString(){
        return producent + " + " + cena;
    }

    @Override
    public int compareTo(TelefonStacjonarny tel) {
        return tel.cena - cena;
    }
}
