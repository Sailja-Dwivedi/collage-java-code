public class inheritance {
    public static void main(String[] args) {

    base b = new base();
    b.setName("Shailja");
    b.getName();
    b.setRollNo(20);
    b.getRollNo();
    b.setMob(947847658);
    b.getMob();
    child c = new child();

    c.setResult("Pass");
    c.getResult();
    }
}
class base{
    String Name;
    public void setName(String s){
        Name = s;
    }
    public void getName(){
        System.out.println("My Name is: "+Name);
    }
    int RollNo;
    public void setRollNo(int s){
        RollNo = s;
    }
    public void getRollNo(){
        System.out.println("My Roll Number is: "+RollNo);
    }
    int Mob;
    public void setMob(int s){
        Mob = s;
    }
    public void getMob(){
        System.out.println("My Mob Number is: "+Mob);
    }
}
class child extends base{
    String result;
    public void setResult(String s){
        result = s;
    }
    public void getResult(){
        System.out.println("My Result is: "+result);
    }
}
