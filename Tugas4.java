
import java.util.HashMap;
import java.util.Scanner;

public class Latihan {
    String nama, kelas, matkulPraktikum;
    int nim;

    public Latihan (String nm, String kl, String mat, int ni) {
        nama = nm;
        kelas = kl;
        matkulPraktikum = mat;
        nim = ni;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Latihan> mhs = new HashMap<>();
        String input;
        Latihan data;

        mhs.put("1", new Latihan("Putri", "3H","Struktur Data",2020000));
        mhs.put("2", new Latihan("Agus", "3A","Pemrograman Dasar",2020012));
        mhs.put("3", new Latihan("Arro", "3D","Matematika Diskrit",2020017));

        System.out.println("Ketik 'stop' untuk keluar dari perulangan!");

        boolean loop = true;
        while(loop) {
            System.out.print("\nMasukkan ID : ");
            input = in.nextLine();
            data = mhs.get(input);

            if(input.matches("stop")) {
                loop = false;
                break;
            }
            if (data != null) {
                System.out.println("Data Mahasiswa	: "+data.nama);
                System.out.println("Kelas		: "+ data.kelas);
                System.out.println("Mata Kuliah	: "+data.matkulPraktikum);
                System.out.println("NIM		: "+data.nim);
            }else {
                System.out.println("Data Tidak Tersedia");
            }
        }
        System.out.println("\nThank youu ");
        in.close();
    }
}
