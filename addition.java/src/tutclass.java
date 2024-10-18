public class tutclass {
    public static void main(String[] args) {
        //The object of using or define your class
        student bcaStud = new student();
        //Accessing all data member of your class and set a perticular data
        //bcaStud.name = "Ramji";
        bcaStud.rollNo = 25;
        bcaStud.computer = 80;
        bcaStud.hindi = 70;
        bcaStud.eng = 60;
        bcaStud.dbms = 76;
        int total = bcaStud.totalSubNumber(bcaStud.computer, bcaStud.hindi, bcaStud.eng, bcaStud.dbms);
        System.out.println("The Sutudent Name is: " + bcaStud.name);
        System.out.println("The Sutudent Roll Number is: " + bcaStud.rollNo);
        System.out.println("The total Number of all subjects: " + total);
        float percent = bcaStud.per(bcaStud.total, 400);
        System.out.println("The percent : " + percent);
        System.out.println();


        student bcaStud1 = new student();
        bcaStud1.name = "ShyamJI";
        bcaStud1.rollNo = 26;
        bcaStud1.computer = 85;
        bcaStud1.hindi = 75;
        bcaStud1.eng = 65;
        bcaStud1.dbms = 86;
        int total1 = bcaStud1.totalSubNumber(bcaStud1.computer, bcaStud1.hindi, bcaStud1.eng, bcaStud1.dbms);
        System.out.println("The Sutudent Name is: " + bcaStud1.name);
        System.out.println("The Sutudent Roll Number is: " + bcaStud1.rollNo);
        System.out.println("The total Number of all subjects: " + total1);
    }
}
class student{

    public student(){
        name = "Mohan JI";
    }
    String name;
    int rollNo;
    int computer;
    int hindi;
    int eng;
    int dbms;
    int total;
    float per;
    int totalSubNumber(int sub1, int sub2, int sub3, int sub4){
         total = (sub1 + sub2 + sub3 + sub4);
        return total;
    }
    float per(int totalNum, int ObtainNumber){
        per = (totalNum*100/ObtainNumber);
        return  per;
    }
}