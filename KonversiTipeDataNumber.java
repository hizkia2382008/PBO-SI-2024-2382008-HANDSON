public class KonversiTipeDataNumber {

    public static void main(String[] args) {


        //Widening
        short tipeDataShort = 10;
        int tipeDataInt = tipeDataShort;
        long tipeDataLong = tipeDataInt;

        //Narrowing
        int tipeDataInt2 = 10;
        byte tipeDataByte = (byte) tipeDataInt2;

        //Overflow
        int tipeDataInterger = 128;
        short tipeDataShortConverted = (short) tipeDataInterger;
        System.out.println(tipeDataInterger);


    }

}
