public class Player extends Entite {
    private int score;
    private String name;

    public Player(Hitbox h, Coordonnee c, String name) {
        super(h, c);
        this.name = name;
        this.score = 0;
    }

    public int getScore() {
        return this.score;
    }

    public void incrementScoreByX(int x) {
        this.score += x;
    }

    public void decrementScoreByX(int x) {
        if (this.score <= x) {
            this.score = 0;
        } else {
            this.score -= x;
        }
    }

    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        Player p = new Player(new Hitbox(10, 20), new Coordonnee(12, 15), "name");
        p.getHitbox();
    }

}
