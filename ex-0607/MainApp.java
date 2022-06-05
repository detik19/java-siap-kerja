public class MainApp {

    public static void main(String[] args) {
       String day = "SATURDAY";

       switch(day){
            case "MONDAY":
            case "TUESDAY":
            case "WEDNESDAY":
                System.out.println("Putih Abu - abu");
                break;
            case "THURSDAY":
                System.out.println("BATIK");
                break;
            case "FRIDAY":
                System.out.println("Pramuka"); 
                break;
            case "SATURDAY":
                System.out.println("Khas");  
                break;    
            case "SUNDAY":
                System.out.println("Hari Libur");  
                break;
            default:
                System.out.println("hari tidak valid");                 
                
       }    
        
    }

}