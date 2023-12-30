import java.math.BigInteger;
public class faden extends Thread{

    public void run(){
        BigInteger Ziel = new BigInteger("100000000");
        BigInteger A = new BigInteger("1");
        BigInteger B = new BigInteger("2");

        long StartZeit = System.nanoTime();

        while (A.compareTo(Ziel) == -1) {
            A = A.add(new BigInteger("1"));
            B = B.add(A);
        }

        long EndZeit = System.nanoTime();
    
        long ergebnis = (EndZeit - StartZeit);
        //System.out.println("Der Kern hat gebraucht:" + ergebnis );
}


    
}
