package uts;
import java.util.Scanner;
public class HewanMain{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Hewan animal;
        System.out.print("Masukkan jenis hewan: ");
        String jenisHewan = input.nextLine();
        if (jenisHewan.equalsIgnoreCase("Kucing")) {
            animal = new Kucing();
        } else if (jenisHewan.equalsIgnoreCase("Anjing")) {
            animal = new Anjing();
        } else {
            System.out.println("Jenis hewan tidak ada dalam data");
            return;
        }
        animal.bersuara();
        if (animal.mamalia) {
            System.out.println(jenisHewan + " termasuk mamalia");
        } else{
            System.out.println(jenisHewan + " bukan mamalia");
        }
    }
}