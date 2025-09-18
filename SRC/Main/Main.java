package SRC.Main;

import javax.swing.JOptionPane;

import SRC.Model.BooksLoader;
import SRC.Model.Inventory;
import SRC.Model.User;
import SRC.Model.*;

public class Main {
    public static void main(String[] args) {
        Inventory inventory=new Inventory();
        byte user=0;
        do {
            user=Byte.parseByte(JOptionPane.showInputDialog(null, "Bienvenido a Biblio-online \n °Presion 1 Si no tiene una cuenta \n °Presione 2 si ya tiene una cuenta \n °presione 3 si quiere salir", "Bienvenida", 1));
            try {
                if (user == 1) {
                    String name=JOptionPane.showInputDialog(null, "Escriba su nombre por favor", "Name", 1);
                    String id= JOptionPane.showInputDialog(null,"Escriba su id por favor","id",1);
                    User usuario= new User(name, id);
                    inventory.AddUser(usuario);
                }else if (user==2) {
                    String temporalId="";
                    do {
                        String temporalName=JOptionPane.showInputDialog(null, "Por favor escriba su nombre de usuario", "comprobacion", user);
                        temporalId=JOptionPane.showInputDialog(null, "Profavor escriba su id", "id", user);
                        if (inventory.searchUser(temporalId)==false) {
                            JOptionPane.showMessageDialog(null, "Usuario no encontrado");
                        }
                    } while (inventory.searchUser(temporalId)==false);
                    String Choice=JOptionPane.showInputDialog(null, "A continuacion podra encontrar nuestro catalogo de libros"+inventory.ShowInfoBooks()+"\n Escriba el id del producto que desea seleccionar");
                    int Stock=inventory.getStock(Choice);
                    inventory.setStock(Stock, Choice);
                    Lending lending= new Lending(inventory.getUser(temporalId), inventory.searchBook(Choice));
                    inventory.getUser(temporalId).AddLending(lending);
                    JOptionPane.showMessageDialog(null, "Libro agregado a nombre de "+inventory.getUser(temporalId).getName()+"\n Info libro:"+inventory.InfoBook(Choice)+"\n Fecha de pedido: "+lending.ShowLendingDate()+"\n fecha de vencimiento: "+lending.ShowReturnDate(), Choice, user);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error"+e, null, 3);
            }
        } while (user!=3);
        
    }
}
