public class MainDuitKu {
    public static void main(String[] args) {

        // 1. registrasi user
        DompetDigital anton = new DompetDigital("Anton", "081234567");

        // 2. setor pertama
        anton.setor(50000);

        // 3. bayar tagihan (gagal)
        anton.bayarTagihan(60000);

        // 4. setor lagi
        anton.setor(20000);

        // 5. bayar tagihan lagi (berhasil)
        anton.bayarTagihan(60000);

        // 6. tampilkan saldo akhir
        anton.tampilSaldo();
    }
}