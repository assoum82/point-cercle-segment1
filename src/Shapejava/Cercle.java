package Shapejava;

/**
 * Created by brahim on 11/5/16.
 */
public class Cercle {
    private Point centrecord;
    private Segment rayon;

    public Cercle(Point point2segment) {
        this.rayon = new Segment(point2segment);
    }
    public Cercle(Segment rayon){
        this.rayon = rayon;
        this.centrecord = rayon.getPoint1();
    }

    public Point getCentre() {
        return centrecord;
    }

    public void setCentre(Point centre) {
        this.centrecord = centre;
    }

    public Segment getRayon() {
        return rayon;
    }

    public void setRayon(Segment rayon) {
        this.rayon = rayon;
    }
    public float périmètre(float rayon) {

        return (float) (2 * rayon * Math.PI);
    }
    public void Symetrie(float rayon) {
        this.rayon.Symetriesegment();
    }

}
