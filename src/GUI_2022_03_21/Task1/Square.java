package GUI_2022_03_21.Task1;

import GUI_2022_03_21.Task2.Figure;
import GUI_2022_03_21.Task2.TooBigSquareException;

public class Square
        implements Comparable<Square>, Figure{
    private int length;
    private int number;

    private static int counter = 0;

    public Square(int length) throws TooBigSquareException {
        if(length > max)
            throw new TooBigSquareException(max);
        this.length = length;
        this.number = counter++;
    }

    public int getArea(){
        return length*length;
    }

    @Override
    public int getPerimeter() {
        return 0;
    }

    public String toString(){
        return "(" + number +  "): " + getArea();
    }

    @Override
    public int compareTo(Square s) {
        return getArea() - s.getArea();
    }
}
