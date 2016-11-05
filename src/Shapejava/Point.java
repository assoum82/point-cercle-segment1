package Shapejava;

/**
 * Created by brahim on 11/5/16.
 */
public class Point {
    private int absice,ordone;
    public Point(){
        this.absice = 0;
        this.ordone = 0;
    }
    public Point (int x ){
        this.absice =x;
        this.ordone =x;
    }
    public Point (int x,int y ){
        this.absice =x;
        this.ordone =y;
    }

    public int getAbsice() {
        return absice;
    }

    public void setAbsice(int absice) {
        this.absice = absice;
    }

    public int getOrdone() {
        return ordone;
    }

    public void setOrdone(int ordone) {
        this.ordone = ordone;
    }
    public void  symetrie(){
        System.out.println( -this.absice + "||"+ -this.ordone );
    }
    public void deplacer(int dx, int dy){
        this.absice+=dx;
        this.ordone+=dy;
    }

}
