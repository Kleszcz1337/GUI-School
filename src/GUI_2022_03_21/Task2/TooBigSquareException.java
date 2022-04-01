package GUI_2022_03_21.Task2;

public class TooBigSquareException extends Exception{
    private int max;

    public TooBigSquareException(int max){
        super("Maximum length is " + max);
    }

}
