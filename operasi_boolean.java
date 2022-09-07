public class operasi_boolean {
    public static void main(String[] args) {
        // operator &&(dan) ||(atau) !(kebalikan)
        // operasi && jika 1 false false semua
        // operasi || jika 1 true true semua
        // operasi ! kebalikan jika true maka false, jika false maka true
        var nilai = 80;
        var nilaiabsen = 85;
        var minimal = 70;
        var absen = 75;
        
        var lulusnilai = nilai >= minimal;
        var lulusabsen = nilaiabsen >= absen;

        var lulus = lulusabsen && lulusnilai;
        System.out.println("lulus? ");
        System.out.println(lulus);
    }
}
