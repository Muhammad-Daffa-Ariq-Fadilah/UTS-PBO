package uts2;
import java.util.List;
abstract class User {
  protected String nama;
  public User(String nama) {
    this.nama = nama;
  }
  public abstract void ShowBuku(List<Buku> bukuList);
}