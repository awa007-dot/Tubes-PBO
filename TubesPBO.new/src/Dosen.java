import java.util.*;

public class Dosen {
    Scanner input = new Scanner(System.in);
    Main main = new Main();
    Data data = new Data();

    String jumlahPeserta;
    String waktuUjian;
    int vjumlahpeserta = 0, vwaktuUjian = 0;

    public void menuDosen(){
        System.out.println("[1]. Jumlah Peserta\n" +
                "[2]. Waktu pelaksanaan Ujian\n" +
                "[3]. Isi Formulir Ujian\n"+
                "[4]. LogOut");
        System.out.println("Pilih Kebutuhan: ");
        int jadwalUjianOption = input.nextInt();

        switch (jadwalUjianOption) {

            case 1:
                if (vjumlahpeserta == 1){
                    input.nextLine();
                    System.out.println("Jumlah Peserta: " + jumlahPeserta);
                    System.out.print("Apakah ingin diperbaharui?(Y/N)");
                    String question = input.nextLine();
                    if (question.equalsIgnoreCase("Y")) {
                        vjumlahpeserta = 0;
                        jumlahPeserta = "";
                        System.out.println("Data Berhasil Dihapus, silahkan pilih pilihan anda lagi");
                        menuDosen();
                    }else{
                        menuDosen();
                    }
                }
                input.nextLine();
                System.out.println("Jumlah Peserta: ");
                System.out.println("Silahkan isi jumlah peserta: ");
                jumlahPeserta = input.nextLine();
                System.out.println(jumlahPeserta);
                vjumlahpeserta++;
                menuDosen();

            case 2:
                if (vwaktuUjian == 1){
                    input.nextLine();
                    System.out.println("Waktu Pelaksanaan Ujian: " + waktuUjian);
                    System.out.print("Apakah ingin diperbaharui?(Y/N)");
                    String question = input.nextLine();
                    if (question.equalsIgnoreCase("Y")) {
                        vwaktuUjian = 0;
                        waktuUjian = "";
                        System.out.println("Data Berhasil Dihapus, silahkan pilih pilihan anda lagi");
                        menuDosen();
                    }else{
                        menuDosen();
                    }
                }
                input.nextLine();
                System.out.println("Waktu Ujian: ");
                System.out.println("Silahkan isi Waktu Ujian: ");
                waktuUjian = input.nextLine();
                System.out.println(waktuUjian);
                vwaktuUjian++;
                menuDosen();
                break;

            case 3:
                data.lampiranDua();
                menuDosen();
                break;

            default:
                main.loginSession();

        }
    }
}
