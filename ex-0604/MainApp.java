public class MainApp {

    public static void main(String[] args) {
        int grade = 70;

        if(grade>70){
            System.out.println("pass");
            if(grade > 90){
                System.out.println("A");
            }else if(grade >80){
                System.out.println("B");
            }else {
                System.out.println("C");
            }
        }else{
            System.out.println("fail");
            if(grade>60){
                System.out.println("D");
            }else{
                System.out.println("E");
            }
        }
        

    }

}