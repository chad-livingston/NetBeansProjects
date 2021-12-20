
public class Main {

    public static void main(String[] args) {
        // test your program here!
        SimpleDate date = new SimpleDate(30, 12, 2020);
        
        System.out.println(date);
        
        System.out.println("inc by 1 day");
        date.advance();
        System.out.println(date);
    }
}
