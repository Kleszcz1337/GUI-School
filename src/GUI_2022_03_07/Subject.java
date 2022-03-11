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

   /* public String getAllStudentsName(){
        for(Person student : listOfStudent)
    }

    */

    public String toString(){
        String string = title + ", teacher: " + teacher.getName() + "\n"
                + "Students: "; //getAllStudentsName();
        return string;
    }

    public void addStudent(Student student) throws TooManyStudentsException{
        if(numOfStudents > 15)
            throw new TooManyStudentsException();
        else
            listOfStudent[numOfStudents++] = student;
    }
}
