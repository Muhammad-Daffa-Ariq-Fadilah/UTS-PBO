package uts2;
public class Buku{
  private String judul;
  private String genre;
  public Buku(String judul, String genre){
    this.judul = judul;
    this.genre = genre;
  }
  public String getJudul(){
    return judul;
  }
  public String getGenre(){
    return genre;
  }
}