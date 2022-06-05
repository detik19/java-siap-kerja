public class MainApp {

    public static void main(String[] args) {
        int grade = 72;

        if(grade>=90){
            System.out.println("A");
            System.out.println("pass");
        }
        else if(grade>=80){
            System.out.println("B");
            System.out.println("pass");
        }else if(grade>=70){
            System.out.println("C");
            System.out.println("pass");
        }else if(grade>=60){
            System.out.println("D");
            System.out.println("fail");
        }else {
            System.out.println("E");
            System.out.println("fail");
        }
        
    }

}