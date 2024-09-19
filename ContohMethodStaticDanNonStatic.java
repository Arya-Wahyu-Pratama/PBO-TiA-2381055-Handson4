public class ContohMethodStaticDanNonStatic {
    public static double hitungluaspersegi(double sisi){
        return sisi * sisi;
    }

    public static void main(String[] args) {
        double luaspersegi = ContohMethodStaticDanNonStatic.hitungluaspersegi(20);
        System.out.println("Luas persegi : " + luaspersegi);

        ContohMethodStaticDanNonStatic object = new ContohMethodStaticDanNonStatic();
        object.tampilkanPrsanSelamatDatang("Arya wahyu");
    }
    public void tampilkanPrsanSelamatDatang(String nama) {
        System.out.println(nama);
    }
}
