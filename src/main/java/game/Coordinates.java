package game;

public class Coordinates {
    int x, y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double countDistance(Coordinates coordinates){
        int dx=coordinates.x-this.x;
        int dy=coordinates.y-this.y;
        return Math.sqrt(Math.pow(dx,2)+Math.pow(dy,2));
    }

public int getX() {
       return x;
   }

   public int getY() {
       return y;
   }
}
