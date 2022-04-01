package GUI_2022_03_14;

public abstract class Figura {
    private int pole;
    private int obwod;
    private String kolor;
    private String nazwa;

    public Figura(String nazwa, String kolor){
        this.nazwa = nazwa;
        this.kolor = kolor;
    }

    public String toString(){
        return "Nazwa: " + nazwa + " Kolor: " + kolor + " Pole: " + pole + " Obwod: " + obwod;
    }

    void setPole(int pole){
        this.pole = pole;
    }

    void setObwod(int obwod){
        this.obwod = obwod;
    }

    public void obliczPole(){}
    public void obliczObwod(){}

    public abstract void obliczPole(int a);

    public abstract void obliczObwod(int a);
}
