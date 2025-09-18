package SRC.Model;

import java.util.Date;

class Lending {
    private Date lendingDate;
    private Date returnDate;
    private User lendgingUser;
    private Book lendingBook;

    public Lending(Date lendingDate, Date returnDate, User lendgingUser, Book lendingBook) {
        this.lendingDate = lendingDate;
        this.returnDate = returnDate;
        this.lendgingUser = lendgingUser;
        this.lendingBook = lendingBook;
    }

    public Date getLendingDate() {
        return lendingDate;
    }
    public void setLendingDate(Date lendingDate) {
        this.lendingDate = lendingDate;
    }
    public Date getReturnDate() {
        return returnDate;
    }
    public void setReturnDate(Date returnDate) {
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