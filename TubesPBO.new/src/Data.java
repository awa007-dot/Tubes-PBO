import java.util.*;

public class Data {
    Scanner input = new Scanner(System.in);
    static String nama, nim, tempat, waktu, konversi, judulPKN;

    static int nilaiSatu, nilaiDua;
    static double totalNilaiSatu, totalNilaiDua;

    static String kegiatan[][] = new String[50][50];
    static String keg[][] = new String[50][50];

    public void lampiranSatu(){
        System.out.println("==PENILAIAN KEGIATAN MAHAASISWA DALAM PKN==");

        System.out.print("Nama: ");
        nama = input.nextLine();
        System.out.print("NIM: ");
        nim = input.nextLine();
        System.out.print("Tempat: ");
        tempat = input.nextLine();
        System.out.print("Waktu: ");
        waktu = input.nextLine();

        kegiatan[0][0] = "Sopan Santun: ";
        kegiatan[1][0] = "Disiplin Kehadiran: ";
        kegiatan[2][0] = "Disiplin dalam Pekerjaan: ";
        kegiatan[3][0] = "Kesungguhan dalam melakukan Kerja Praktek: ";
        kegiatan[4][0] = "Tanggung Jawab: ";
        kegiatan[5][0] = "Kemauan untu melakukan hal-hal yang ada di tempat kerja: ";
        kegiatan[6][0] = "Pengetahuaan tentang ilmu yang dilaksanakan dalam kerja Praktek: ";
        kegiatan[7][0] = "Keterampilan: ";
        kegiatan[8][0] = "Kemauan Berbicara/Menyampaikan: ";
        kegiatan[9][0] = "Kemauan Bergaul: ";

        System.out.println("A = Sangat Baik, B = Baik, C = Cukup, D = Kurang, E = Sangat Kurang");

        for (int i = 0; i < 10; i++){
            System.out.println("Masukkan nilai angka: ");
            System.out.print(kegiatan[i][0] );
            nilaiSatu = input.nextInt();
            if (nilaiSatu<=100&&nilaiSatu>=80){
                konversi = "A";
            }else if (nilaiSatu<80&&nilaiSatu>=75){
                konversi = "B";
            }else if (nilaiSatu<75&&nilaiSatu>=70){
                konversi = "C";
            }else if (nilaiSatu<70&&nilaiSatu>=0){
                konversi = "D";
            }
            kegiatan[i][1] = konversi;
            totalNilaiSatu = totalNilaiSatu + nilaiSatu;
        }

        for (int i = 0; i < 10; i++){
            System.out.println(kegiatan[i][0] + kegiatan[i][1]);
        }
        System.out.println("Total: "+ totalNilaiSatu);
        System.out.println("Mengetahui, Dosen 2021");

        total();
    }

    String Nama, NIM;

    public void lampiranDua(){
        System.out.println("==FORM PENILAIAN HASIL UJIAN PKN==");
        System.out.print("Judul PKN: ");
        judulPKN = input.nextLine();
        System.out.print("Nama: ");
        Nama = input.nextLine();
        System.out.print("NIM: ");
        NIM = input.nextLine();


        keg[0][0] = "Tingkat keberhasilan Aplikasi/Pemahaman Tugas PKN: ";
        keg[1][0] = "Penulisan buku laporan: ";
        keg[2][0] = "Keaktifan mahasiswa: ";

        System.out.println("A = 80-100, B = 75-79 , C = 70-74 , D = 60-69 ");
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan nilai: ");
            System.out.print("~ " + keg[i][0]);
            nilaiDua = input.nextInt();
            if (nilaiDua<=100&&nilaiDua>=80){
                konversi = "A";
            }else if (nilaiDua<80&&nilaiDua>=75){
                konversi = "B";
            }else if (nilaiDua<75&&nilaiDua>=70){
                konversi = "C";
            }else if (nilaiDua<70&&nilaiDua>=0){
                konversi = "D";
            }
            keg[i][1] = konversi;
            totalNilaiDua = totalNilaiDua + nilaiDua;
        }

        for (int i = 0; i < 3; i++){
            System.out.println(keg[i][0] + keg[i][1]);
        }

        System.out.println(totalNilaiDua);
        System.out.println("Malang, 3 Juli 2021" +
                "\nSaya yang menyerahkan," +
                "\nPenilai Ujian");
    }

    public void total(){
        double persenPerusahaan = (totalNilaiSatu / 1000);
        double persenUjian = (totalNilaiDua / 300);
        double total = ((persenPerusahaan*60)) + ((persenUjian*40)) ;
        System.out.println(total);
    }

    public void showData(){
        System.out.println("NILAI KEGIATAN MAHASISWA DALAM PKN");
        for (int i = 0; i < 10; i++){
            System.out.println(kegiatan[i][0] + kegiatan[i][1]);
        }
        System.out.println("Total: " + totalNilaiSatu);

        System.out.println("\nNILAI HASIL UJIAN PKN");
        for (int i = 0; i < 3; i++){
            System.out.println(keg[i][0] + keg[i][1]);
        }
        System.out.println("Total: " + totalNilaiDua);

        System.out.print("Total Keseluruhan(60% Nilai Perusahaan, 40% Nilai Ujian): ");
        total();
    }

}
