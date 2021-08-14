package studentpackage;

public class Student {
    String firstName;
    String lastName;
    String group;
    int averageMark;

    public void getScholarship(String lastName, int averageMark){
        int scholarship;
        if (averageMark >=90) {
            scholarship = 100;
        }
        else if (averageMark >=80 && averageMark <=89) {
            scholarship = 90;
        }
        else {
            scholarship = 80;
        }
        System.out.println("Student " + lastName + " has " + scholarship + " grn");
    }

}