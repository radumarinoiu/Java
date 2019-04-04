import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Canvas extends JPanel {


    private BufferedImage image;
    private Graphics2D graphics;
    private int currentMouseX, currentMouseY;

    public Canvas() {
        this.setBorder(BorderFactory.createTitledBorder("Drawing paper:"));
        setDoubleBuffered(false);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                currentMouseX = e.getX();
                currentMouseY = e.getY();
                if (graphics != null) {
                    int stroke = Integer.parseInt(DrawingFrame.form.shapesSize.getText());
                    String color = (String) DrawingFrame.form.colorsValue.getSelectedItem();
                    drawShapeAt(currentMouseX, currentMouseY, stroke, color);
                    repaint();
                }
            }
        });
    }

    protected void paintComponent(Graphics g) {
        if (image == null) {
            image = new BufferedImage(getSize().width, getSize().height, BufferedImage.TYPE_INT_ARGB);
            graphics = image.createGraphics();
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            clear();
        }
        g.drawImage(image, 0, 0, null);
    }

    public void clear() {
        graphics.setPaint(Color.white);
        graphics.fillRect(0, 0, getSize().width, getSize().height);
        graphics.setPaint(Color.black);
        repaint();
    }

    public void drawShapeAt(int x, int y, int stroke, String color) {
        Random rand = new Random();
        graphics.setColor(new Color(rand.nextInt(0xFFFFFF)));
        NodeShape node = new NodeShape(x, y, stroke);
        graphics.fill(node);
        if (color.equals("red"))
            graphics.setPaint(Color.red);
        else if (color.equals("blue"))
            graphics.setPaint(Color.blue);
        else if (color.equals("pink"))
            graphics.setPaint(Color.pink);
        else if (color.equals("orange"))
            graphics.setPaint(Color.orange);
        else if (color.equals("black"))
            graphics.setPaint(Color.black);
        else if (color.equals("white"))
            graphics.setPaint(Color.white);
        else if (color.equals("green"))
            graphics.setPaint(Color.green);
        else if (color.equals("purple"))
            graphics.setPaint(Color.MAGENTA);
        graphics.draw(node);

    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
        graphics = image.createGraphics();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    }

}
