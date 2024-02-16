import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = scan.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.print("Pages: ");
            int nrOfPages = Integer.valueOf(scan.nextLine());

            System.out.print("Publication year:");
            int publicationYear = Integer.valueOf(scan.nextLine());

            books.add(new Book(title, nrOfPages, publicationYear));
        }
        System.out.println();
        System.out.println("What information will be printed? ");
        String information = scan.nextLine();

        if (information.equals("everything")) {
            for (Book toPrint : books) {
                System.out.println(toPrint);
            }
        } else {
            for (Book toPrint : books) {
                System.out.println(toPrint.getTitle());
            }
        }
    }
}

