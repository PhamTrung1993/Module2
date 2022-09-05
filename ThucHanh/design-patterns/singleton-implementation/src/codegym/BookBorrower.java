package codegym;

public class BookBorrower {
    private BookSingleton borrwedBook;
    private boolean haveBook = false;

    public void borrowBook() {
        borrwedBook = BookSingleton.borrowBook();

        haveBook = borrwedBook != null;
    }
    public String getAuthorAndTitle() {
        if (haveBook) {
            return borrwedBook.getAthorAndTitle();
        }
        return "I don't have the book";
    }
    public void returnBook() {
        borrwedBook.returnBook(borrwedBook);
    }
}
