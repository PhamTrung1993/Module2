import book.Book;
import book.FictionBook;
import book.ProgrammingBook;

public class Client {
    public static void main(String[] args) {
        Book book1 = new ProgrammingBook("Book1", "Java Lock", 120, "TG1", "Java", "None");
        Book book2 = new ProgrammingBook("Book2", "Java OOP", 200, "TG2", "Java", "None");
        Book book3 = new ProgrammingBook("Book3", "Java Code", 200, "TG3", "Java", "None");
        Book book4 = new ProgrammingBook("Book4", "JavaScript", 200, "TG4", "JS", "None");
        Book book5 = new FictionBook("Book5", "lonely Star", 100, "MU", "Rác");
        Book book6 = new FictionBook("Book6", "waves", 150, "MU", "Rác");
        Book book7 = new FictionBook("Book7", "wife pick up", 70, "MU", "Viễn tưởng 1");
        Book book8 = new FictionBook("Book8", "Chicken Síster", 75, "MU", "Viễn tưởng 1");

        Book listBook[] = {book1, book2, book3, book4, book5, book6, book7, book8};

        int count = 0;
        for (int i = 0; i < listBook.length; i++) {
            if (listBook[i] instanceof ProgrammingBook) {
                ProgrammingBook p = (ProgrammingBook) listBook[i];
                String language = p.getLanguage();
                if (language == "Java") {
                    count++;
                }
            }
        }
        System.out.println("The number of ProgrammingBook books has the language 'Java': ");
        System.out.println(count);

        int count2 = 0;
        for (int i = 0; i < listBook.length; i++) {
            if (listBook[i] instanceof FictionBook) {
                FictionBook f = (FictionBook) listBook[i];
                String category = f.getCategory();
                if (category == "Viễn tưởng 1") {
                    count2++;
                }
            }
        }
        System.out.println("Count the number of Fiction books whose category is 'Viễn Tưởng 1' : ");
        System.out.println(count2);

        int count3 = 0;
        for (int i = 0; i < listBook.length; i++) {
            if (listBook[i] instanceof FictionBook) {
                FictionBook m = (FictionBook) listBook[i];
                int price = m.getPrice();
                if (price < 100) {
                    count3++;
                }
            }
        }
        System.out.println("Count the number of Fiction books that price < 100");
        System.out.println(count3);

        int sum=0;
        for (Book b: listBook
        ) {
            sum+=b.getPrice();
        }
        System.out.println("Total amount of 8 books");
        System.out.println(sum);
    }
}
