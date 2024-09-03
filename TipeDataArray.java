public class TipeDataArray {

    public static void main(String[] args) {
        //Array merupakan kumpulan dari sebuah data dengan tipe data yang sama
        int [] kumpulanAngka = new int[3];
        kumpulanAngka[0] = 10;
        kumpulanAngka[1] = 40;
        kumpulanAngka[2] = 50;
        System.out.println(kumpulanAngka[2]);

        //Array multi-dimension
        int[][] kumpulanAngkaMD = new int [3][3];
        kumpulanAngkaMD[0] = kumpulanAngka;
        System.out.println(kumpulanAngkaMD[0][2]);

    }
}
