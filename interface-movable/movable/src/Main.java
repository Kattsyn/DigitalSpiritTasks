public class Main {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(5, 6, 10, 15);     // upcast
        System.out.println(m1); //MovablePoint{x=5, y=6, xSpeed=10, ySpeed=15}
        m1.moveLeft();
        System.out.println(m1); //MovablePoint{x=-5, y=6, xSpeed=10, ySpeed=15}

        Movable m2 = new MovableCircle(1, 2, 3, 4, 20);  // upcast
        System.out.println(m2); //MovableCircle{center=MovablePoint{x=1, y=2, xSpeed=3, ySpeed=4}, radius=20}
        m2.moveRight();
        System.out.println(m2); //MovableCircle{center=MovablePoint{x=4, y=2, xSpeed=3, ySpeed=4}, radius=20}

        Movable m3 = new MovableRectangle(1, 10, 10, 1, 4, 5);
        System.out.println(m3); //MovableRectangle{topLeft=MovablePoint{x=1, y=10, xSpeed=4, ySpeed=5}, bottomRight=MovablePoint{x=10, y=1, xSpeed=4, ySpeed=5}}
        m3.moveRight();
        System.out.println(m3); //MovableRectangle{topLeft=MovablePoint{x=5, y=10, xSpeed=4, ySpeed=5}, bottomRight=MovablePoint{x=14, y=1, xSpeed=4, ySpeed=5}}
    }
}