import processing.core.PApplet;

public class ProcessingChallenge extends PApplet {
    int HEIGHT = 480;
    int WIDTH = 640;
    int DIAMETER = 10;
    int c1=0;

    public static void main(String[] args) {
        PApplet.main("ProcessingChallenge", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        ellipse(c1++, HEIGHT/5, DIAMETER, DIAMETER);
        ellipse(2*c1, 2*HEIGHT/5, DIAMETER, DIAMETER);
        ellipse(3*c1, 3*HEIGHT/5, DIAMETER, DIAMETER);
        ellipse(4*c1, 4*HEIGHT/5, DIAMETER, DIAMETER);
    }
}
