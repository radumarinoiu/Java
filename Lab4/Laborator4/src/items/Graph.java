package items;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;

public class Graph implements Serializable {

    private String name;
    private String tgfPath;
    private String pngPath;

     public Graph(String name, String tgfPath, String pngPath)
     {
         this.name = name;
         this.tgfPath = tgfPath;
         this.pngPath = pngPath;
     }


    public void setName(String name) {
        this.name = name;
    }

    public void setPngPath(String pngPath) {
        this.pngPath = pngPath;
    }

    public void setTgfPath(String tgfPath) {
        this.tgfPath = tgfPath;
    }

    public String getName() {
        return name;
    }

    public String getPngPath() {
        return pngPath;
    }

    public String getTgfPath() {
        return tgfPath;
    }

    public void open(){
        try {
            Desktop desktop = Desktop.getDesktop();
            File image = new File(getPngPath());
            desktop.open(image);
        } catch (IOException e) {
            System.out.println("There was a problem opening the image.");
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Graful cu numele "+ getName() + " are png-ul "+ getPngPath() + " si tgf-ul "+getTgfPath();
    }
}
