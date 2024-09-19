public class ContohReturnValue {
    public static void SebutkanNama() {
        System.out.println("Nama saya adalah arya wahyu");
    }
    public static int kembalikanAngka(){
        int hasilperkalian = 20 * 2;
        return hasilperkalian;
    }
    public static void main(String[] args) {
        SebutkanNama();
        int hasil = kembalikanAngka();
        System.out.println(hasil);
    }
}
