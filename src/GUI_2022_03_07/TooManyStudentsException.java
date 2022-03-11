package GUI_2022_03_07;

public class TooManyStudentsException extends Exception{
    public TooManyStudentsException(){
        super("Za duzo studentow");
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }
}
