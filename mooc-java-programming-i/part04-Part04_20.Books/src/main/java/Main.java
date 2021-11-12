
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner input = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = input.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.valueOf(input.nextLine());
            System.out.print("Publication year: ");
            int pubYr = Integer.valueOf(input.nextLine());

            books.add(new Book(title, pages, pubYr));
        }
        System.out.println("What information will be printed?");
        String userOpt = input.nextLine();

        for (Book book : books) {
            if (userOpt.equals("name")) {
                System.out.println(book.getTitle());
            } else {
                System.out.println(book);
            }
        }

    }
}
