package uts2;
import java.util.List;
public class Customer extends User{
  public Customer(String nama){
    super(nama);
  }
  public void ShowBuku(List<Buku> bukuList){
    System.out.println("Daftar Buku");
    for (Buku buku : bukuList){
      System.out.println("- " + buku.getJudul() + " (" + buku.getGenre() + ")");
    }
  }
}