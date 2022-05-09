package oo.inheritance;

public class Player {

    int x;
    int y;

    boolean walk(Direction direction) {
        switch (direction) {
            case NORTH -> y++;
            case SOUTH -> y--;
            case EAST -> x++;
            case WEST -> x--;
        }

        return true;
    }

}
