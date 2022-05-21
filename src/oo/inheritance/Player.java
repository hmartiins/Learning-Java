package oo.inheritance;

public class Player {

    int life = 100;
    int x;
    int y;

    boolean attack(Player opponent) {
        int deltaX  = Math.abs(x - opponent.x);
        int deltaY = Math.abs(y - opponent.y);

        if(deltaX == 0 && deltaY == 1) {
            opponent.life -= 10;
            return true;
        } else if(deltaX == 1 && deltaY == 0) {
            opponent.life -= 10;
            return true;
        }

        return false;
    }

    void walk(Direction direction) {
        switch (direction) {
            case NORTH -> y++;
            case SOUTH -> y--;
            case EAST -> x++;
            case WEST -> x--;
        }
    }

}
