package main;


public class main {

    public static void main(String[] args) {
        
        // Create Instance
        e1 call = new e1();
        
        int result = call.sum(1, 6);
        System.out.println(result);
        
        System.out.println("First Name : "+ call.getFirstName());
        System.out.println("Last Name : "+ call.getLastName());
    }
    
}
