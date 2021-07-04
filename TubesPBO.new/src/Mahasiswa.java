import java.util.*;

public class Mahasiswa {

    Scanner input = new Scanner(System.in);
    Data data = new Data();
    Main main = new Main();
    static ArrayList<String> CVAnggota = new ArrayList<String>();
    String emailPortofolio;
    String tempatPKN;
    String waktuPelaksanan;
    int vCV = 0, vPortofolio = 0, vTempatPKN = 0, vWaktuPelaksanaan = 0, inputJumlahAnggota;

    public void menuMahasiswa(){
        System.out.println("[1]. Pengajuan Proposal\n" +
                "[2]. Pendaftaran Ujian\n" +
                "[3]. LogOut");
        System.out.print("Pilih Menu: ");
        int menuOption = input.nextInt();

        switch (menuOption){
            case 1:
                System.out.println("Pengajuan Proposal");
                pengajuanProposal();
                break;

            case 2:
                System.out.println("Pendaftaran Ujian");
                pendaftaranUjian();
                break;

            default:
                main.loginSession();
        }
    }

    public void pengajuanProposal(){
        System.out.println("[1]. Curriculum Vitae\n" +
                "[2]. Portofolio\n" +
                "[3]. Tempat PKN\n" +
                "[4]. Waktu Pelaksanaan\n" +
                "[5]. Lihat Rekap Proposal\n" +
                "[6]. Menu Utama");
        System.out.print("Pilih Kebutuhan: ");
        int pengajuanProposalOption = input.nextInt();

        switch (pengajuanProposalOption){

            case 1:
                if (vCV == 1){
                    input.nextLine();
                    System.out.println("CV Sudah terisi dengan nama: " + CVAnggota);
                    System.out.print("Apakah ingin diperbaharui?(Y/N)");
                    String question = input.nextLine();
                    if (question.equalsIgnoreCase("Y")) {
                        vCV = 0;
                        for (int i = 0; i < inputJumlahAnggota; i++) {
                            CVAnggota.remove(0);
                        }
                        System.out.println("Data Berhasil Dihapus, silahkan pilih pilihan anda lagi");
                        pengajuanProposal();
                    }else{
                        pengajuanProposal();
                    }
                }

                System.out.println("Curriculum Vitae:");
                System.out.print("Masukkan Jumlah Anggota: ");
                inputJumlahAnggota = input.nextInt();
                input.nextLine();


                if (inputJumlahAnggota>4&&inputJumlahAnggota<1){
                    System.out.println("Maksimal Anggota Kelompok 4 Orang!");
                    pengajuanProposal();
                }

                int number = 1;
                System.out.println("Memasukkan Data CV");

                for (int i = 0; i<inputJumlahAnggota; i++){
                    System.out.print("Masukkan Nama Anggota ke-" + number++ + ": ");
                    String namaAnggota = input.nextLine();
                    CVAnggota.add(i, namaAnggota);
                }

                System.out.println("Nama Berhasil Dimasukkan!");
                System.out.println(CVAnggota.toString());
                vCV++;
                pengajuanProposal();
                break;

            case 2:
                if (vPortofolio == 1){
                    input.nextLine();
                    System.out.println("Portofolio Sudah terisi dengan e-mail: " + emailPortofolio + " yang akan dikiri ke Instansi");
                    System.out.print("Apakah ingin diperbaharui?(Y/N)");
                    String question = input.nextLine();
                    if (question.equalsIgnoreCase("Y")) {
                        vPortofolio = 0;
                        emailPortofolio = "";
                        System.out.println("Data Berhasil Dihapus, silahkan pilih pilihan anda lagi");
                        pengajuanProposal();
                    }else{
                        pengajuanProposal();
                    }
                }
                input.nextLine();
                System.out.println("Portofolio: ");
                System.out.println("Silahkan kirim e-mail anda ke Instansi: ");
                emailPortofolio = input.nextLine();
                System.out.println(emailPortofolio);
                vPortofolio++;
                pengajuanProposal();
                break;

            case 3:
                if (vTempatPKN == 1){
                    input.nextLine();
                    System.out.println("Tempat PKN Sudah terisi di: " + tempatPKN);
                    System.out.print("Apakah ingin diperbaharui?(Y/N)");
                    String question = input.nextLine();
                    if (question.equalsIgnoreCase("Y")) {
                        vTempatPKN = 0;
                        tempatPKN = "";
                        System.out.println("Data Berhasil Dihapus, silahkan pilih pilihan anda lagi");
                        pengajuanProposal();
                    }else{
                        pengajuanProposal();
                    }
                }
                input.nextLine();
                System.out.println("Tempat PKN");
                System.out.print("Silahkan isi tempat PKN anda: ");
                tempatPKN = input.nextLine();
                System.out.println(tempatPKN);
                vTempatPKN++;
                pengajuanProposal();
                break;

            case 4:
                if (vWaktuPelaksanaan == 1){
                    input.nextLine();
                    System.out.println("Waktu PKN Sudah terisi pada: " + tempatPKN);
                    System.out.print("Apakah ingin diperbaharui?(Y/N)");
                    String question = input.nextLine();
                    if (question.equalsIgnoreCase("Y")) {
                        vWaktuPelaksanaan = 0;
                        waktuPelaksanan = "";
                        System.out.println("Data Berhasil Dihapus, silahkan pilih pilihan anda lagi");
                        pengajuanProposal();
                    }else{
                        pengajuanProposal();
                    }
                }
                input.nextLine();
                System.out.println("Waktu Pelaksanaan");
                System.out.println("Silahkan isi Waktu Pelaksanaan (Hari, Tanggal(DD Month YYYY)): ");
                waktuPelaksanan = input.nextLine();
                System.out.println(waktuPelaksanan);
                vWaktuPelaksanaan++;
                pengajuanProposal();
                break;

            case 5:
                input.nextLine();
                laporan();
                pengajuanProposal();
                break;

            default:
                menuMahasiswa();
        }
    }

    public void laporan() {
        System.out.println("Rekapitulasi Proposal Anda: ");
        System.out.println("Nama Anggota Curriculum Vitae yaitu: " + CVAnggota.toString());
        System.out.println("Setelah itu, Portofolio dikirimkan dengan e-mail " + emailPortofolio + " ke Instansi.");
        System.out.println("Tempat yang anda pilih sebagai tempat PKN anda berada di " + tempatPKN + ". ");
        System.out.println("Waktu pelaksanaan PKN pada " + waktuPelaksanan + ".");
    }

    String nilaiPerusahaan;
    String uploadLaporan;

    public void pendaftaranUjian() {
        System.out.println("[1]. Mendaftar Ujian\n" +
                "[2]. Upload nilai dari perusahaan\n" +
                "[3]. Upload Laporan");
        System.out.print("Pilih Kebutuhan: ");
        int pendaftaranUjianOption = input.nextInt();

        switch (pendaftaranUjianOption) {
            case 1:
                if ((vCV == 0 && vPortofolio == 0) && (vWaktuPelaksanaan == 0 && vPortofolio == 0)){
                    System.out.println("Dimohon untuk mengisi Pengajuan Proposal terlebih dahulu");
                    pengajuanProposal();
                }
                input.nextLine();
                System.out.println("Mendaftar Ujian: ");
                System.out.println("Pendaftaran telah selesai!");
                pendaftaranUjian();
                break;


            case 2:
                input.nextLine();
                System.out.println("Upload nilai dari perusahaan: ");
                data.lampiranSatu();
                pendaftaranUjian();
                break;

            case 3:
                input.nextLine();
                System.out.println("Upload Laporan: ");
                laporan();
                System.out.println("Apakah anda ingin meng-upload laporan tersebut?(Y/N)");
                String answer = input.nextLine();
                if (answer.equalsIgnoreCase("Y")){
                    System.out.println("Laporan berhasil di-upload");
                }else {
                    System.out.println("peng-upload-an laporan ditunda");
                }
                pendaftaranUjian();
                break;

            default:
                menuMahasiswa();
        }
    }

}
