package node;

public class InfoPoint {
    int x;
    int y;
    int stroke;
    public InfoPoint(int x, int y, int stroke)
    {
        this.x=x;
        this.y=y;
        this.stroke=stroke;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getStroke() {
        return stroke;
    }

    public void setStroke(int stroke) {
        this.stroke = stroke;
    }
}
