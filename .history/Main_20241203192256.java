import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Menu menu = new Menu();
        Pesanan pesanan = new Pesanan();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(x:"\n1. Tambah Menu Item");
            System.out.println(x:"2. Tampilkan Menu");
            System.out.println(x:"3. Pesan Item");
            System.out.println(x:"4. Tampilkan Struk");
            System.out.println(x:"5. Keluar");

            System.out.print(s:"Pilih opsi: ");
            int opsi = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (opsi) {
                    case 1:
                        System.out.print(s:"Masukkan Nama Item: ");
                        String nama = scanner.nextLine();
                        System.out.print(s:"Masukkan Harga: ");
                        double harga = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.print(s:"Masukkan Kategori: ");
                        String kategori = scanner.nextLine();

                        System.out.println(x:"1. Makanan\n2. Minuman\n3. Diskon");
                        int jenis = scanner.nextInt();
                        scanner.nextLine();

                        if (jenis == 1) {
                            System.out.print(s:"Jenis Makanan: ");
                            String jenisMakanan = scanner.nextLine();
                            menu.tambahMenuItem(new Makanan(nama, harga, kategori, jenisMakanan));
                        } else if (jenis == 2) {
                            System.out.print(s:"Jenis Minuman: ");
                            String jenisMinuman = scanner.nextLine();
                            menu.tambahMenuItem(new Minuman(nama, harga, kategori, jenisMinuman));
                        } else if (jenis == 3) {
                            System.out.print(s:"Diskon (%): ");
                            double diskon = scanner.nextDouble();
                            menu.tambahMenuItem(new Diskon(nama, harga, kategori, diskon));
                        }
                        break;
                }
            }
        }
    }
}
