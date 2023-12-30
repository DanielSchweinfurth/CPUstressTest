public class stress extends Thread{
    
private static final int kernzahl = Runtime.getRuntime().availableProcessors(); //ermittelt die Anzahl der logischen Prozessoren (Threads)

public static void main(String[] args) {
     
    long StartTime = System.nanoTime();

    for (int i = 0; i < kernzahl; i++) {
        faden kern0 = new faden();
        kern0.start();
        
    }
    long EndTime = System.nanoTime();
    long Score = EndTime - StartTime;
    System.out.println("Stress Test beendet. Score = " + Score);
    
}


}
