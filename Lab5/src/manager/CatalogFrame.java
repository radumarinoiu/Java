
package manager;

import javax.swing.*;
import java.awt.*;

public class CatalogFrame extends JFrame {
    GraphForm form;
    CatalogList list;
    ControlPanel control;

    public CatalogFrame() {
        super("Visual Document Manager");
        init();
        addComponents();
        this.pack();
    }

    private void init() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        form = new GraphForm(this);
        list = new CatalogList();
        control = new ControlPanel(this);
    }

    private void addComponents(){
        add(form, BorderLayout.NORTH);
        add(list, BorderLayout.CENTER);
        add(control, BorderLayout.SOUTH);
    }

}