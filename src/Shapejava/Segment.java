package Shapejava;

/**
 * Created by brahim on 11/5/16.
 */
public class Segment {
    private Point point1;
    private Point point2 ;
    public Segment(Point A){
        this.point1 = new Point();
        this.point2 = new Point(A.getAbsice(),A.getOrdone());
    }
    public Segment(Point A, Point B){
        this.point1 = new Point(A.getAbsice(),A.getOrdone());
        this.point2 = new Point(B.getAbsice(),B.getOrdone());
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }
    public double Distance(){
        return (Math.pow((this.point1.getAbsice() - this.point2.getAbsice()), 2) + Math.pow((this.point1.getOrdone() - this.point2.getOrdone()), 2));
    }
    public double helfsegment(Point A ,Point B){
        return (Math.pow((B.getAbsice() - A.getAbsice()), 2) + Math.pow((B.getOrdone() - A.getOrdone()), 2));
    }
    public void Symetriesegment(){
        this.point1.symetrie();
        this.point2.symetrie();
    }
}
