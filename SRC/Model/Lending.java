package SRC.Model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Lending {
    private LocalDateTime  lendingDate;
    private LocalDateTime returnDate;
    private User lendgingUser;
    private Book lendingBook;
    private static final DateTimeFormatter formateadorhora= DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy HH:mm");

    public Lending( User lendgingUser, Book lendingBook) {
        this.lendingDate = lendingDate.now();
        this.returnDate = lendingDate.plusHours(112);
        this.lendingBook = lendingBook;
    }

    public String ShowLendingDate(){
        return lendingDate.format(formateadorhora);
    }

    public String ShowReturnDate(){
        return returnDate.format(formateadorhora);
    }
    public LocalDateTime getLendingDate() {
        return lendingDate;
    }
    public void setLendingDate(LocalDateTime lendingDate) {
        this.lendingDate = lendingDate;
    }
    public LocalDateTime getReturnDate() {
        return returnDate;
    }
    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }
    public User getLendgingUser() {
        return lendgingUser;
    }
    public void setLendgingUser(User lendgingUser) {
        this.lendgingUser = lendgingUser;
    }
    public Book getLendingBook() {
        return lendingBook;
    }
    public void setLendingBook(Book lendingBook) {
        this.lendingBook = lendingBook;
    }


    
}