import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class DrawingFrame extends JFrame {
    static Toolbar form;
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int height = screenSize.height / 2;
    int width = screenSize.width / 3;
    Canvas drawArea;
    ControlPanel control;

    ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == control.resetButton) {
                drawArea.clear();
            } else if (e.getSource() == control.loadButton) {
                try {
                    load();
                } catch (IOException e1) {
                    System.out.println("Fisierul nu exista sau formatul nu este bun.");
                }
            } else if (e.getSource() == control.saveButton) {
                try {
                    save();
                } catch (IOException e1) {
                    System.out.println("Destinatia nu exista sau nu ai drept de salvare.");
                }
            }
        }
    };

    public DrawingFrame() {
        super("JAVA Paint");
        rootPane.setBorder(BorderFactory.createTitledBorder("Drawing panel"));
        rootPane.setPreferredSize(new Dimension(width, height));
        init();
        addComponents();
        this.pack();
    }

    private void init() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        form = new Toolbar(this);
        drawArea = new Canvas();
        control = new ControlPanel(this);
        control.resetButton.addActionListener(actionListener);
        control.saveButton.addActionListener(actionListener);
        control.loadButton.addActionListener(actionListener);
    }

    private void addComponents() {
        add(form, BorderLayout.NORTH);
        add(drawArea, BorderLayout.CENTER);
        add(control, BorderLayout.SOUTH);
    }

    public void save() throws IOException {
        ImageIO.write(drawArea.getImage(), "PNG", new File("lab6.png"));
    }

    public void load() throws IOException {
        drawArea.setImage(ImageIO.read(new File("lab6.png")));
        repaint();
    }

}
