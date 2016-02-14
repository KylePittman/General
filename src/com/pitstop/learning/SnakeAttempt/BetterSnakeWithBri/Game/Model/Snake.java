package com.pitstop.learning.SnakeAttempt.BetterSnakeWithBri.Game.Model;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Snake {

    private List<Segment> snakeCells;

    private Point snakeDirection;

    private Random random;

    private boolean borderless;

    public Snake() {
        this.random = new Random();
        this.snakeCells = new ArrayList<Segment>();
        createSnake();
    }

    public void createSnake() {
        this.snakeCells.clear();
        this.snakeDirection = generateRandomDirection();

        int x = Game.getCellWidth() / 2;
        int y = Game.getCellHeight() / 2;

        Segment segment = new Segment(Color.RED);
        segment.setLocation(new Point(x, y));
        segment.setDirection(snakeDirection);
        snakeCells.add(segment);

        for (int i = 0; i < 3; i++) {
            x -= snakeDirection.x;
            y -= snakeDirection.y;
            Segment segment2 = new Segment(Color.RED);
            segment2.setLocation(new Point(x, y));
            segment2.setDirection(snakeDirection);
            snakeCells.add(segment2);
        }
    }

    public Point generateRandomDirection() {
        int a = 0;
        int b = 0;

        do {
            a = getRandomDirectionCoordinate();
            b = (a == 0) ? getRandomDirectionCoordinate() : 0;
        } while ((a == 0) && (b == 0));

        return new Point(a, b);
    }

    private int getRandomDirectionCoordinate() {
        return random.nextInt(3) - 1;
    }

    public void updatePosition() {
        Segment segment1 = null;

        for (int i = getSnakeLength() - 2; i >= 0; i--) {
            Segment segment2 = snakeCells.get(i + 1);
            segment1 = snakeCells.get(i);
            Point previousDirection = segment1.getDirection();
            segment2.setDirection(previousDirection);

            Point location = segment2.getLocation();
            location.x += previousDirection.x;


            location.y += previousDirection.y;
            if (borderless) {
                if (location.x >= Game.getCellWidth()) {
                    location.x = 0;
                } else if (location.x < 0) {
                    location.x = Game.getCellWidth() - 1;
                }

                if (location.y >= Game.getCellHeight()) {
                    location.y = 0;
                } else if (location.y < 0) {
                    location.y = Game.getCellHeight() - 1;
                }
            }
            segment2.setLocation(location);

        }

        segment1.setDirection(snakeDirection);

        Point location = segment1.getLocation();
        location.x += snakeDirection.x;
        location.y += snakeDirection.y;

        if (borderless) {
            if (location.x >= Game.getCellWidth()) {
                location.x = 0;
            } else if (location.x < 0) {
                location.x = Game.getCellWidth() - 1;
            }
            if (location.y >= Game.getCellHeight()) {
                location.y = 0;
            } else if (location.y < 0) {
                location.y = Game.getCellHeight() - 1;
            }
        }

        segment1.setLocation(location);
    }

    public void addSnakeTail() {
        Segment segment = snakeCells.get(getSnakeLength() - 1);

        Point direction = segment.getDirection();
        Point location = segment.getLocation();
        int x = location.x - direction.x;
        int y = location.y - direction.y;

        Segment segment2 = Segment.copy(segment);
        segment2.setLocation(new Point(x, y));

        snakeCells.add(segment2);
    }

    public List<Segment> getSnakeCells() {
        return snakeCells;
    }

    public int getSnakeLength() {
        return snakeCells.size();
    }

    public Point getSnakeHeadLocation() {
        return snakeCells.get(0).getLocation();
    }

    public void setSnakeDirection(Point snakeDirection) {
        if (!(snakeDirection.x == -this.snakeDirection.x || snakeDirection.y == -this.snakeDirection.y))
            this.snakeDirection = snakeDirection;
    }

    public void setBorderless(boolean borderless) {
        this.borderless = borderless;
        System.out.println("Set Borderless: " + this.borderless);
    }

    public Point getRandomNonSnakeLocation() {
        Point p;

        do {
            int x = random.nextInt(Game.getCellWidth());
            int y = random.nextInt(Game.getCellHeight());
            p = new Point(x, y);
        } while (isSnakeLocation(p));
        return p;
    }

    public boolean isSnakeLocation(Point p) {
        for (Segment segment : snakeCells) {
            if (segment.getLocation().equals(p)) {
                return true;
            }
        }

        return false;
    }

    public boolean isSnakeDead() {
        int segmentWidth = Game.getCellWidth();
        int segmentHeight = Game.getCellHeight();

        if (!borderless) {
            for (Segment segment : snakeCells) {
                Point p = segment.getLocation();
                if ((p.x < 0) || (p.x >= segmentWidth)) {
                    return true;
                }
                if ((p.y < 0) || (p.y >= segmentHeight)) {
                    return true;
                }
            }
        }

        for (int i = 0; i < (getSnakeLength() - 1); i++) {
            Point s = snakeCells.get(i).getLocation();
            for (int j = (i + 1); j < getSnakeLength(); j++) {
                Point t = snakeCells.get(j).getLocation();
                if (s.equals(t)) {
                    return true;
                }
            }
        }

        return false;
    }

}
