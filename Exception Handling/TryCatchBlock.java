public class TryCatchExample4 {  
  
    public static void main(String[] args) {  
      int val = 20;
        try  
        {  
        int data = val / 0; //may throw exception   
        }  
        // handling the exception by using Exception class      
        catch(Exception e)  
        {  
            System.out.println("Arithmetic Exception Occurred");
            System.out.println(e.getMessage());  
        }  
        System.out.println("rest of the code");  
    }  
      
}  
