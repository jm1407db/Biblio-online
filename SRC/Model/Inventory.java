package SRC.Model;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Book>ListBooks=BooksLoader.ListBooks("BooksList.txt");
    private ArrayList<User>ListUser;

    public Inventory() {
        ListUser = new ArrayList<>();
    }

    public void AddUser(User user){
        ListUser.add(user);
    }

    public boolean searchUser(String id){
        for (User user : ListUser) {
            if (user.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public User getUser(String id){
        for (User user : ListUser) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

    public Book searchBook(String id){
        for (Book book : ListBooks) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        return null;
    }

    public String InfoBook(String id){
        for (Book book : ListBooks) {
            if (book.getId().equals(id)) {
                return "Id: "+book.getId()+" | Name: "+book.getName()+" | Autor: "+book.getAutor()+" | Stock: "+book.getStock();
            }
        }
        return null;
    }
    public String ShowInfoBooks(){
        String info= "";
        for (Book book : ListBooks) {
            info+="\n"+book.getId()+" | "+book.getName()+" | "+book.getAutor()+" | "+book.getStock();
        }
        return info;
    }
}
