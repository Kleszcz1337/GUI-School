package GUI_2022_03_07;

public class Subject {

    private String title;
    private Person teacher;
    private Student[] listOfStudent = new Student[16];
    private int numOfStudents = 0;

    public Subject(String title){
        this.title = title;
    }

    public void setTeacher(Person person){
        this.teacher = person;
    }

    public StringBuilder getAllStudentsName(){
        StringBuilder stringBuilder = new StringBuilder();

        for(Person student : listOfStudent)
            if(student != null)
                stringBuilder.append(student.getName() + " ");

        return stringBuilder;
    }


    public String toString(){
        String string = title + ", teacher: " + teacher.getName() + "\n"
                + "Students: ";

        return string+getAllStudentsName();
    }

    public void addStudent(Student student) throws TooManyStudentsException{
        if(numOfStudents > 15)
            throw new TooManyStudentsException();
        else
            listOfStudent[numOfStudents++] = student;
    }
}
