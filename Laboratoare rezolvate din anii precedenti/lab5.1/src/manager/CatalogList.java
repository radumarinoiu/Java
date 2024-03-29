/**
 * @author Birsan Ioana (cas. Amariei)
 * @author Gensthaler Octavian
 */

package manager;

import javax.swing.*;

public class CatalogList extends JList {
    DefaultListModel model = new DefaultListModel<>();

    public CatalogList() {
        String title = "<html><i><font color='blue'>" +
                "Catalog Documents" + "</font></i></hmtl>";
        this.setBorder(BorderFactory.createTitledBorder(title));
        this.setModel(model);
    }

    public void addDocument(String item) {

        model.addElement(item);
    }
}
