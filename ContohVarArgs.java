public class ContohVarArgs {
    public static int jumlahkan(int ... kumpulanAngka){
        int total = 0;
        for (int nilai : kumpulanAngka) {
            total += nilai;
        }
        return total;
    }
    public static void main(String[] args) {
        int hasil1 = jumlahkan(10, 20, 30);
        System.out.println("Hasil :" + hasil1);
    }
}
