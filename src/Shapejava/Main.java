package Shapejava;

/**
 * Created by brahim on 11/5/16.
 */
public class Main {
    public static void main(String[] args) {
        Point A = new Point();
        Point B = new Point(5);
        Point C = new Point(3,0);
        A.symetrie();
        B.symetrie();
        C.symetrie();
        System.out.println("====================");
        //creation d'un segment avec point c et b comme entré
        Segment M = new Segment(C,B);
        System.out.println(M.getPoint2().getAbsice() + "   " + M.getPoint2().getOrdone()+" "+M.getPoint1().getAbsice() + "   " + M.getPoint1().getOrdone());
        M.Symetriesegment();
        System.out.println("la distance entre point C ET B  = [" + M.Distance() + "]");
        //creation d'une cercle avec point c et b comme entré
        Cercle H = new Cercle(M);
        
    }
}
