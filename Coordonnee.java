
public class Coordonnee {
    private float verticalY;
    private float horizontalX;

    public Coordonnee(Float x, Float y) {
        this.horizontalX = x;
        this.verticalY = y;
    }

    public float getX() {
        return horizontalX;
    }

    public float getY() {
        return verticalY;
    }

    public void setX(float xx) {
        this.horizontalX = xx;
    }

    public void setY(float y) {
        this.verticalY = y;
    }

    public String toString() {
        return "(" + this.horizontalX + "," + this.verticalY + ")";
    }
}
