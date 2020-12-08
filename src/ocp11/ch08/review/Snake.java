package ocp11.ch08.review;

public class Snake {
}

class Cobra extends Snake {
}

class GardenSnake extends Cobra {
}

class SnakeHandler {

    private Snake snake;

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    public static void main(String[] args) {
        new SnakeHandler().setSnake(new Cobra());
        new SnakeHandler().setSnake(new Snake());
        new SnakeHandler().setSnake(new GardenSnake());
        new SnakeHandler().setSnake(null);
    }
}
