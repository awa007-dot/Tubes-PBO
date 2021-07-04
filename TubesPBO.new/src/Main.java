import java.util.*;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        loginSession();
    }

    public static void loginSession() {
        System.out.println("==LOGIN==");
        System.out.print("Masukkan E-mail: ");
        String emailInput = input.nextLine();
        System.out.print("Masukkan Password: ");
        String passInput = input.nextLine();
        login(emailInput, passInput);
    }

    static public void login(String email, String pass){
        if (email.equalsIgnoreCase("mahasiswa@webmail.umm.ac.id") == pass.equalsIgnoreCase("123123")){
            Mahasiswa mahasiswa = new Mahasiswa();
            System.out.println("Login Berhasil!");
            System.out.println("==MAHASISWA==");
            mahasiswa.menuMahasiswa();
        }else if (email.equalsIgnoreCase("dosen@webmail.umm.ac.id") == pass.equalsIgnoreCase("123123")){
            Dosen dosen = new Dosen();
            System.out.println("Login Berhasil!");
            System.out.println("==DOSEN==");
            dosen.menuDosen();

        }else if (email.equalsIgnoreCase("admin@webmail.umm.ac.id") == pass.equalsIgnoreCase("123123")){
            Admin admin = new Admin();
            System.out.println("Login Berhasil!");
            System.out.println("==ADMIN==");
            admin.menuAdmin();
        }else {
            System.out.println("E-mail/Pass salah. Data tidak ditemukan");
            loginSession();
        }
    }

}
