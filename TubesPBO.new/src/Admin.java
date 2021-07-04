import java.util.*;


public class Admin {
    Scanner input = new Scanner(System.in);
    Data data = new Data();
    Main main = new Main();

    String jumlahAnggota;
    String waktuDisetujui;
    String tempatDisetujui;
    String emailBalasan;
    int vsuratBalasan = 0, vjumlahAnggotaDisetujui = 0, vwaktuDisetujui = 0, vtempatDisetujui = 0, vnilaiPKN = 0, vnilaiPkn = 0, vnilaiUjian = 0;

    public void menuAdmin() {
        System.out.println("[1]. Approval\n" +
                "[2]. Penjadwalan Ujian\n" +
                "[3]. Nilai PKN\n" +
                "[3]. LogOut");
        System.out.println("Pilih Kebutuhan: ");
        int adminOption = input.nextInt();

        switch (adminOption) {
            case 1:
                System.out.println("Approval");
                approval();
                break;
            case 2:
                System.out.println("Penjadwalan Ujian");
                penjadwalanUjian();

            case 3:
                System.out.println("Nilai PKN");
                nilaiPKN();

            default:
                main.loginSession();

        }
    }
    public void approval(){
        System.out.println("[1]. Surat Balasan\n" +
                "[2]. Jumlah Anggota yang disetujui\n" +
                "[3]. Waktu yang disetujui\n" +
                "[4]. Tempat yang disetujui\n");
        System.out.println("Pilih Kebutuhan: ");
        int suratBalasanOption = input.nextInt();

        switch (suratBalasanOption){
            case 1:
                if (vsuratBalasan == 1){
                    input.nextLine();
                    System.out.println("Email dari perusahaan ");
                    System.out.print("Apakah ingin diperbaharui?(Y/N)");
                    String question = input.nextLine();
                    if (question.equalsIgnoreCase("Y")) {
                        vsuratBalasan = 0;
                        emailBalasan = "";
                        System.out.println("Data Berhasil Dihapus, silahkan pilih pilihan anda lagi");
                        approval();
                    }else{
                        approval();
                    }
                }
                input.nextLine();
                System.out.println("Surat dari perusahaan: ");
                System.out.println("Silahkan terima Email: ");
                emailBalasan = input.nextLine();
                System.out.println(emailBalasan);
                vsuratBalasan++;
                approval();
                break;

            case 2:
                if (vjumlahAnggotaDisetujui == 1){
                    input.nextLine();
                    System.out.println(" Jumlah Anggota yang disetujuui ");
                    System.out.println("Apakah ingin diperbaharui?(Y/N)");
                    String question = input.nextLine();
                    if (question.equalsIgnoreCase("Y")){
                        vjumlahAnggotaDisetujui = 0;
                        jumlahAnggota = "";
                        System.out.println("Data Berhasil Dihapus, silahkan pilih pilihan anda lagi");
                        approval();
                    }else{
                        approval();
                    }
                }
                input.nextLine();
                System.out.println("Jumlah Anggota : ");
                System.out.println("Silahkan isi jumlah Anggota: ");
                jumlahAnggota = input.nextLine();
                System.out.println(jumlahAnggota);
                vjumlahAnggotaDisetujui++;
                approval();
                break;

            case 3:
                if (vwaktuDisetujui == 1){
                    input.nextLine();
                    System.out.println(" Waktu yang disetujui ");
                    System.out.println("Apakah ingin diperbaharui?(Y/N)");
                    String question = input.nextLine();
                    if (question.equalsIgnoreCase("Y")){
                        vwaktuDisetujui = 0;
                        waktuDisetujui = "";
                        System.out.println("Data Berhasil Dihapus, silahkan pilih pilihan anda lagi");
                        approval();
                    }else{
                        approval();
                    }
                }
                input.nextLine();
                System.out.println("waktu yang disetujui: ");
                System.out.println("Silahkan isi waktu yang disetujui: ");
                waktuDisetujui = input.nextLine();
                System.out.println(waktuDisetujui);
                vwaktuDisetujui++;
                approval();
                break;

            case 4:
                if (vtempatDisetujui == 1){
                    input.nextLine();
                    System.out.println(" Tempat yang disetujui ");
                    System.out.println("Apakah ingin diperbaharui?(Y/N)");
                    String question = input.nextLine();
                    if (question.equalsIgnoreCase("Y")){
                        vtempatDisetujui = 0;
                        tempatDisetujui = "";
                        System.out.println("Data Berhasil Dihapus, silahkan pilih pilihan anda lagi");
                        approval();
                    }else{
                        approval();
                    }
                }
                input.nextLine();
                System.out.println("Tempat yang disetujui: ");
                System.out.println("Silahkan isi tmepat: ");
                tempatDisetujui = input.nextLine();
                System.out.println(tempatDisetujui);
                vtempatDisetujui++;
                approval();
                break;

            case 5:
                input.nextLine();
                System.out.println("Surat balasan: " + emailBalasan +" Email dari perusahaan.");
                System.out.println("Jumlah Anggota: " + jumlahAnggota+".");
                System.out.println("Waktu yang telah disetujui" + waktuDisetujui+ ". ");
                System.out.println("Tempat yang telah disetujui " + tempatDisetujui + ".");
                approval();
                break;

            default:
                menuAdmin();
        }

    }


    String nilaiPKN;

    public void penjadwalanUjian(){
        System.out.println("[1]. Nilai PKN dari Perusahaan\n");
        System.out.println("Nilai PKN dari Perusahaan: ");
        System.out.println("Nilai PKN: ");
        input.nextLine();
        nilaiPKN = input.nextLine();
        menuAdmin();
    }

    public void nilaiPKN(){
        data.showData();
        menuAdmin();
    }

}
