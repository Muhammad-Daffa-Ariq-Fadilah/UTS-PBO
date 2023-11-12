package uts2;
import java.util.List;
import java.util.Scanner;
public class Admin extends User{
  public Admin(String nama){
    super(nama);
  }
  public void TambahBuku(List<Buku> bukuList, Buku buku){
    bukuList.add(buku);
    System.out.println("Buku");
    System.out.println("Judul : " + buku.getJudul());
    System.out.println("Genre : " + buku.getGenre());
    System.out.println("-- Telah ditambahkan --");
  }
  public void ShowBuku(List<Buku> bukuList){
    System.out.println("Daftar Buku");
    for (Buku buku : bukuList) {
      System.out.println("- " + buku.getJudul() + " (" + buku.getGenre() + ")");
    }
  }
  public void HapusBuku(List<Buku> bukuList, Buku buku){
    int index = -1;
    for (int i = 0; i < bukuList.size(); i++){
      Buku currentBook = bukuList.get(i);
      if (currentBook.getJudul().equals(buku.getJudul()) && currentBook.getGenre().equals(buku.getGenre())){
        index = i;
        break;
      }
    }
    if (index != -1){
      bukuList.remove(index);
      System.out.println("Buku dihapus: " + buku.getJudul() + " (" + buku.getGenre() + ")");
    }else{
      System.out.println("Buku tidak ditemukan.");
    }
  }
  public void showMenu(List<Buku> bukuList){
    Scanner input = new Scanner(System.in);
    int choice;
    do{
      System.out.println("\nMenu Admin:");
      System.out.println("1. Tambah Buku");
      System.out.println("2. Hapus Buku");
      System.out.println("3. Tampilkan Buku");
      System.out.println("4. Keluar");
      System.out.print("Pilih menu: ");
      choice = input.nextInt();
      input.nextLine();
      switch(choice){
        case 1:
          System.out.print("Masukkan judul buku: ");
          String judul = input.nextLine();
          System.out.print("Masukkan genre buku: ");
          String genre = input.nextLine();
          TambahBuku(bukuList, new Buku(judul, genre));
          break;
        case 2:
          System.out.print("Masukkan judul buku yang akan dihapus: ");
          String judulHapus = input.nextLine();
          System.out.print("Masukkan genre buku yang akan dihapus: ");
          String genreHapus = input.nextLine();
          HapusBuku(bukuList, new Buku(judulHapus, genreHapus));
          break;
        case 3:
          ShowBuku(bukuList);
          break;
        case 4:
          System.out.println("Keluar dari menu Admin.");
          break;
        default:
          System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
      }
    }while(choice != 4);
  }
}