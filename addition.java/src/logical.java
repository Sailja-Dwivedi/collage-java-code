public class logical {
    public static void main(String[] args) {

//        This section is AND operator example.
        //        int age = 120;
////        condition1      Operator     condition2
//        if((age>=18)      &&          (age <=100)){
//            System.out.println("You are eligible for voting");
//        }else{
//            System.out.println("You are not eligible for voting");
//        }

//        This section is OR operator example.

//         String userName = "pravesh";
//         String passWord = "kumar";
//         if((userName == "dwivedi") || (passWord == "pravesh")){
//             System.out.println("You are login");
//         }else {
//             System.out.println("Plese check your username or password");
//         }

//        This section is Not operator example.
        String userName = "pravesh";
        if(!(userName == "kumar")){
            System.out.println("You are eligible");
        }else {
            System.out.println("you are not eligible");
        }
    }
}
