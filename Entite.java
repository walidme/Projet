public abstract class Entite {
    // private <?> Skin; ????
    private Hitbox hitbox;
    private Coordonnee coords;
    private int maxSpeed;

    public Entite(Hitbox h, Coordonnee c, int ms) {
        this.hitbox = h;
        this.coords = c;
        this.maxSpeed = ms;
    }

    public void moveLeft(int mx) {
        this.coords.setX(this.coords.getX() - mx);
    }

    public void moveRight(int mx) {
        this.coords.setX(this.coords.getX() + mx);
    }

    public void moveUp(int my) {
        this.coords.setY(this.coords.getY() - my);
    }

    public Hitbox getHitbox() {
        return this.hitbox;
    }
}