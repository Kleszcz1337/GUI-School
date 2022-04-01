package GUI_2022_03_21;

import GUI_2022_03_21.Task1.Square;
import GUI_2022_03_21.Task2.TooBigSquareException;

public class Main {
    public static void main(String[] args) {
        try {
            Square square1 = new Square(2);
            Square square2 = new Square(6);
            Square square3 = new Square(1);
            Square square4 = new Square(8);
            Square square5 = new Square(2);

            Square[] squareArray = {
                    square1,
                    square2,
                    square3,
                    square4,
                    square5
            };

        } catch (TooBigSquareException ex){
            System.out.println(ex);
        }
    }
}
