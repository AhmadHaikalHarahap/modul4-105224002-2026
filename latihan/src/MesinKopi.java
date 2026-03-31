// No 1: Class MesinKopi (hanya blueprint)
public class MesinKopi {
    int stokKopi;
    int stokAir;
    int stokSusu;

    // No 2: Constructor
    public MesinKopi() {
        this.stokKopi = 0;
        this.stokAir = 0;
        this.stokSusu = 0;
    }

    // No 3: Method tambah bahan
    void tambahBahan(int kopi, int air, int susu) {
        this.stokKopi += kopi;
        this.stokAir += air;
        this.stokSusu += susu;
        System.out.println("Stok bahan berhasil ditambahkan.");
    }

    // No 4: Method cek ketersediaan
    boolean siapCappuccino() {
        return (stokKopi >= 15 && stokAir >= 50 && stokSusu >= 100);
    }
}