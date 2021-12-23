
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        SimpleCollection j = new SimpleCollection("characters");
        System.out.println(j);        
        
        System.out.println();
        
        j.add("magneto");
        System.out.println(j);
        
       // System.out.println();
        
        j.add("mystique");
        System.out.println(j);
        
       // System.out.println();
        
        j.add("phoenix");
        System.out.println(j);
        
        
        
       /* When the code was: 
        SimpleCollection c = new SimpleCollection("collection");
        c.add("element");
        System.out.println(c);
        
        Expected output: 
        The collection collection has 1 element: 
        element  
                
        Currently output is: 
        The collection collection has 1 element: 
        element 
        
        expected:<...s 1 element: element[]> but was:<...s 1 element: element[ ]>*/
        
    }
    
    
}
