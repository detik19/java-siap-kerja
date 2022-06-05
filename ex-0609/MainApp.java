public class MainApp {

    public static void main(String[] args) {
       String day = "SATURDAY";

       String uniform =  switch(day){
          case "MONDAY", "TUESDAY", "WEDNESDAY" ->"Putih Abu-abu";      
          case "THURSDAY" -> "Batik";        
          case "FRIDAY" -> "Pramuka";        
          case "SATURDAY" -> "Khas";        
          case "SUNDAY" -> "LIBUR";        
          default -> "hari tidak valid";     
       };   
       System.out.println(uniform); 
        
    }

}