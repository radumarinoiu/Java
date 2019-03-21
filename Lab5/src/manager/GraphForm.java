package manager;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
public class GraphForm extends JPanel {
   
	private final CatalogFrame frame;
    String[] graphType = {"simple", "directed"};
    JComboBox graphList= new JComboBox(graphType);
    //graphList.setSelectedIndex(1);
   // graphList.addActionListener(this);
    
    
    
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    
    int height = screenSize.height / 2;
    int width = screenSize.width / 4;
    
    
    JLabel titleLabel = new JLabel("Name of the graph");
    JLabel typeLabel = new JLabel("Type of the graph");
    JLabel pathLabel = new JLabel("Path of definition file");
    JLabel pathImgLabel = new JLabel("Path of image file");
    JLabel verticesLabel = new JLabel("Number of vertices");
    JLabel nodesLabel = new JLabel("Number of nodes");
    JButton addButton = new JButton("Add");
    
    JTextField titleField = new JFormattedTextField();
    JTextField pathField = new JFormattedTextField();
    JTextField pathImgField = new JFormattedTextField();
    JSpinner verticesField = new JSpinner(
	    new SpinnerNumberModel(0,0, 1000,1));
    JSpinner nodesField = new JSpinner(
    	    new SpinnerNumberModel(0, 0,1000,1));
   
    
    
    public GraphForm(CatalogFrame frame) {
        this.setBorder(BorderFactory.createTitledBorder("Add graph"));
        this.frame = frame;
        init();

        this.setLayout(new GridLayout(0,1));
    }
    
    private void init() {               
    	frame.setPreferredSize(new Dimension(width, height));
        frame.setLocation(screenSize.width/3-frame.getSize().width, screenSize.height/3-frame.getSize().height);
        
        add(titleLabel);
        add(titleField);

        add(typeLabel);
        add(graphList);
        
        add(pathLabel);
        add(pathField);
        
        add(pathImgLabel);
        add(pathImgField);
        
        add(verticesLabel);
        add(verticesField);
        
        add(nodesLabel);
        add(nodesField);
         
        
        
        add(addButton);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addGraph();
            }
        });
    }
    private void addGraph() {
    	 String graph = titleField.getText() + " " + pathField.getText() + " "+ pathImgField.getText()+" "+ (int) verticesField.getValue()+ " "+(int) nodesField.getValue() +"\n";
        
        frame.list.addGraph(graph);
    }
}