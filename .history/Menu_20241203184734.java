import java.util.ArrayList;
import java.io.*;

public class Menu {
    private ArrayList<MenuItem> daftarMenu;

    public Menu() {
        this.daftarMenu = new ArrayList<>();
    }
    public void tambahMenuItem(MenuItem item) {
        daftarMenu.add(item);
    }
    public void tampilkanMenu() {
        for (MenuItem item : daftarMenu) {
            item.tampilMenu();
        }
    }
    public MenuItem cariMenuItem(String nama) throws Exception {
        for (MenuItem item : daftarMenu) {
            if (item.getNama().equalsIgnoreCase(nama)) {
                return item;
            }
        }
        throw new Exceptions(message:"Item tidak ditemukan di menu.");
    }
    public void simpanMenuKeFile(String filename) throws IOException {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(daftarMenu);
        }
    }
    @SuppressWarnings("unchecked")
    public void muatMenuDariFile(String filename) throws IOExceptions, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            daftarMenu = (ArrayList<MenuItem>) ois.readObject();
        }
    }
}