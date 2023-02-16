class Tabungan{
   int saldo;

    int getSaldo(){
        System.out.println(saldo);
        return saldo;
    }

    void simpanUang(int jumlah){
        saldo += jumlah;
        System.out.println("OK");
    }

    boolean ambilUang(int jumlah){
        if(saldo-jumlah>=0){
            saldo -= jumlah;
            return true;
        }else{
            return false;
        }
    }

    boolean transfer(int jumlah){
        if(saldo-jumlah>=0){
            saldo -= jumlah;
            return true;
        }else{
            return false;
        }
    }
}

    // public static void main(String[] args) {
    //     Scanner scan = new Scanner(System.in);
    //     Tabungan tabung = new Tabungan();
    //     System.out.println("Saldo awal = " + tabung.getSaldo());

    //     System.out.print("Jumlah uang yang di simpan = ");
    //     int jumlah = scan.nextInt();
    //     tabung.simpanUang(jumlah);
    //     System.out.println("Saldo saat ini = ");
    //     tabung.getSaldo();

    //     System.out.print("Jumlah uang yang akan ditarik = ");
    //     int jumlahTarik = scan.nextInt();
    //     boolean tarik = tabung.ambilUang(jumlahTarik);
    //     if(tarik){
    //     System.out.println("Saldo saat ini = ");
    //     tabung.getSaldo();
    //     }else{
    //         System.out.println("Saldo tidak mencukupi");
    //     }
        
    // }
