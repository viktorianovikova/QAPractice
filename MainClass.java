package studentpackage;

public class MainClass {


    public static void main(String[] args){

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Aspirant aspirant1 = new Aspirant();
        Aspirant aspirant2 = new Aspirant();
        Aspirant aspirant3 = new Aspirant();

        student1.lastName = "Ivanov";
        student2.lastName = "Petrov";
        student3.lastName = "Antonov";
        aspirant1.lastName = "Kosenko";
        aspirant2.lastName = "Klymenko";
        aspirant3.lastName = "Malai";


        student1.averageMark = 79;
        student2.averageMark = 89;
        student3.averageMark = 90;
        aspirant1.averageMark = 79;
        aspirant2.averageMark = 89;
        aspirant3.averageMark = 90;

    student1.getScholarship(student1.lastName, student1.averageMark);
    student2.getScholarship(student2.lastName, student2.averageMark);
    student3.getScholarship(student3.lastName, student3.averageMark);
    aspirant1.getScholarship(aspirant1.lastName, aspirant1.averageMark);
    aspirant2.getScholarship(aspirant2.lastName, aspirant2.averageMark);
    aspirant3.getScholarship(aspirant3.lastName, aspirant3.averageMark);
}
}