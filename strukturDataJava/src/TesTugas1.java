import java.util.Scanner;
public class TesTugas1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Tabungan tabung = new Tabungan();
        System.out.println("Saldo awal = " + tabung.getSaldo());

        System.out.print("Jumlah uang yang di simpan = ");
        int jumlah = scan.nextInt();
        tabung.simpanUang(jumlah);
        System.out.println("Saldo saat ini = ");
        tabung.getSaldo();

        System.out.print("Jumlah uang yang akan ditarik = ");
        int jumlahTarik = scan.nextInt();
        boolean tarik = tabung.ambilUang(jumlahTarik);
        if(tarik){
        System.out.println("Saldo saat ini = ");
        tabung.getSaldo();
        }else{
            System.out.println("Saldo tidak mencukupi");
        }
        System.out.print("Masukkan jumlah yang akan di transfer = ");
        int jumlahTf = scan.nextInt();
        tabung.transfer(jumlahTf);
        System.out.println("Transfer berhasil");
        System.out.println("Saldo saat ini = ");
        tabung.getSaldo();
        scan.close();
    }
}
