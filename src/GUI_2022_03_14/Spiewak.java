package GUI_2022_03_14;

public abstract class Spiewak {
    private static int numerStartowy = 0;

    private String nazwisko;
    private int numerDanego;

    public Spiewak(String nazwisko){
        this.nazwisko = nazwisko;
        this.numerDanego = numerStartowy++;
    }

    abstract String spiewaj();

    public String toString(){
        return nazwisko + " " + numerDanego + " " + spiewaj();
    }

    public static Spiewak najglosniej(Spiewak[] array){
        int maxNumOfUpper=0;
        int indexOfWinner=0;
        int couter=0;


        for(int i=0; i<array.length; i++){
            char[] charArray = array[i].spiewaj().toCharArray();
            for(int j=0; j<charArray.length; j++){
                if(charArray[j] >= 'A' && charArray[j] <= 'Z')
                    couter++;
            }
            if(couter > maxNumOfUpper) {
                maxNumOfUpper = couter;
                couter = 0;
                indexOfWinner = i;
            }
        }
        return array[indexOfWinner];
    }
}
