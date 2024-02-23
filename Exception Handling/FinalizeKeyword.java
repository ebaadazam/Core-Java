/*
finalize is the method in Java which is used to perform clean up processing just before object is garbage collected.
finalize() method is used with the objects.
finalize() method performs the cleaning activities with respect to the object before its destruction.
finalize() method is executed just before the object is destroyed.
*/

public class FinalizeExample {    
     public static void main(String[] args)     
    {     
        FinalizeExample obj = new FinalizeExample();        
        // printing the hashcode   
        System.out.println("Hashcode is: " + obj.hashCode());           
        obj = null;    
        // calling the garbage collector using gc()   
        System.gc();     
        System.out.println("End of the garbage collection");     
    }     
   // defining the finalize method   
    protected void finalize()     
    {     
        System.out.println("Called the finalize() method");     
    }     
} 
