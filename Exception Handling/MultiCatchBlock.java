public class MultipleCatchBlock4 {  
  
    public static void main(String[] args) {  
          
           try{    
                String s=null;  // this will raise NullPointer Exception
                System.out.println(s.length());  
               }    

             // It's called when ArithmeticException occurs
               catch(ArithmeticException e)  
                  {  
                   System.out.println("Arithmetic Exception occurs");  
                  }    

             // It's called when ArrayIndexOutOfBoundsException occurs
               catch(ArrayIndexOutOfBoundsException e)  
                  {  
                   System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                  }    

             // It's called when ant type of exception occurs
               catch(Exception e)  
                  {  
                   System.out.println("Parent Exception occurs");  
                  }             
               System.out.println("rest of the code");    
    }  
} 
