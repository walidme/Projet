public class Player extends Entite {
    private int score;
    private String name;

    public Player(Hitbox h, Coordonnee c, String name, int ms) {
        super(h, c, ms);
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
        Player p = new Player(new Hitbox(10, 20), new Coordonnee(12, 15), "name", 10);
        p.getHitbox();
    }
 public boolean limite(Bloc bloc){
    	if(this.moveRight() == true){
    		if(this.x + this.width < bloc.getX() || this.x + this.width > bloc.getX() + 2 || this.y + this.height <= bloc.getY() || this.y >= bloc.getY() + bloc.getHeight()){return false;}
    	    else{return true;} //condition du player ou il touche l'obstacle , sinon il ne le touche pas
    	}else{return false;}	    	
    }

}
}
