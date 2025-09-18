package SRC.Model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class BooksLoader {
    public static ArrayList<Book>ListBooks (String pathFile){
        ArrayList<Book> books= new ArrayList<>();
        try(BufferedReader buffer= new BufferedReader(new FileReader(pathFile))) {
            String line;
            while ((line=buffer.readLine())!=null) {
                String [] values= line.split(",");
                String id= values[0];
                String name= values[1];
                String autor= values[2];
                int Stock= Integer.parseInt(values[3]);
                books.add(new Book(id, name, autor, Stock));
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, pathFile, 0);
        }
        return books;
    }
}
