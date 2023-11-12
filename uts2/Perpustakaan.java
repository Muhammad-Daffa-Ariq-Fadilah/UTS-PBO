package uts2;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Perpustakaan{
  public static void main(String[] args){
    List<Buku> daftarBuku = new ArrayList<>();
    daftarBuku.add(new Buku("C++", "Programming"));
    daftarBuku.add(new Buku("Sherlock Holmes", "Thriller"));
    daftarBuku.add(new Buku("Naruto", "Fantasy"));
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan peran (Customer/Admin): ");
    String peran = input.nextLine();
    User pengguna;
    if(peran.equalsIgnoreCase("Customer")){
      System.out.print("Masukkan nama pengguna: ");
      String nama = input.nextLine();
      pengguna = new Customer(nama);
    }else if(peran.equalsIgnoreCase("Admin")){
      System.out.print("Masukkan nama admin: ");
      String nama = input.nextLine();
      pengguna = new Admin(nama);
      Admin admin = (Admin) pengguna;
      admin.showMenu(daftarBuku);
    }else{
      System.out.println("Peran tidak valid.");
      return;
    }
    pengguna.ShowBuku(daftarBuku);
  }
}