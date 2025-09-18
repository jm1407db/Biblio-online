package SRC.Model;

import java.util.ArrayList;

class Book {
    private String id;
    public String name;
    public String autor;
    public int stock;

    
    public Book(String id, String name, String autor, int stock) {
        this.id = id;
        this.name = name;
        this.autor = autor;
        this.stock = stock;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
}