package studentpackage;

public class Aspirant extends Student{

    String researchWork;

    @Override
    public void getScholarship(String lastName, int averageMark){
        int scholarship;
        if (averageMark >=90) {
            scholarship = 200;
        }
        else if (averageMark >=80 && averageMark <=89) {
            scholarship = 190;
        }
        else {
            scholarship = 180;
        }
        System.out.println("Aspirant " + lastName + " has " + scholarship + " grn");
    }
}
