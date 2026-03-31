public class MainApp {
    public static void main(String[] args) {

        // Membuat objek
        MesinKopi mesinRuangTunggu = new MesinKopi();

        // Cek awal
        System.out.println("Mesin siap? " + mesinRuangTunggu.siapCappuccino());

        // Isi bahan
        mesinRuangTunggu.tambahBahan(120, 400, 250);

        // Cek lagi
        if (mesinRuangTunggu.siapCappuccino()) {
            System.out.println("Mesin siap digunakan.");
        } else {
            System.out.println("Bahan belum cukup.");
        }
    }
}
