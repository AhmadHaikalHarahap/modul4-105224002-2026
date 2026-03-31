public class DompetDigital {
    String nama;
    String noHp;
    int saldo;

    // constructor
    public DompetDigital(String nama, String noHp) {
        this.nama = nama;
        this.noHp = noHp;
        this.saldo = 0;
    }

    // method setor uang
    void setor(int jumlah) {
        if (jumlah < 10000) {
            System.out.println("Setoran ditolak! Minimal Rp 10.000");
        } else {
            saldo += jumlah;
            System.out.println("Setor berhasil: Rp " + jumlah);
            System.out.println("Saldo sekarang: Rp " + saldo);
        }
    }

    // method bayar tagihan
    void bayarTagihan(int jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("Pembayaran berhasil: Rp " + jumlah);
            System.out.println("Sisa saldo: Rp " + saldo);
        } else {
            System.out.println("Pembayaran gagal! Saldo tidak cukup.");
            System.out.println("Saldo saat ini: Rp " + saldo);
        }
    }

    // method tampil saldo
    void tampilSaldo() {
        System.out.println("Saldo akhir: Rp " + saldo);
    }
}