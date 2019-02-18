package pbo3ulang.pkg10116049.latihan20.targetsaldo;

/**
 *
 * @author ibadguthwara
 * NAMA              : M. Ibad Guthwara
 * KELAS             : PBO 3 ULANG
 * NIM               : 10116049
 * DESKRIPSI PROGRAM : Program Target Saldo
 */
public class PBO3ULANG10116049Latihan20TargetSaldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int saldoawal = 3500000, target = 8;
        double bunga =0.8;
        
        for(int i =1; i<=target; i++){
            saldoawal +=saldoawal * bunga;
            System.out.printf("Saldo di bulan ke-".concat(String.valueOf(i))
            .concat(" Rp. ")
            .concat(String.valueOf("%,d\r\n")),saldoawal);   
        }
    }
}
