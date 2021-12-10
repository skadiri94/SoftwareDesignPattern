package Singleton;

import Decorator.Glasses.*;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;


public class Catalogue  {

    private Map<String, GlassesFrame> frames = new HashMap<>();
    private static Catalogue instance = null;

    private Catalogue(){
        instatiateCatalogue();
    }

    public void addFrame(String key, GlassesFrame frame) {
        frames.put(key, frame);

    }

    public static Catalogue getInstance(){
        if(instance == null)
             instance = new Catalogue();
        return instance;

    }

    public GlassesFrame buyFrame(String key) {
        GlassesFrame tempFrame = getGlassesFrame(key);
        frames.remove(key);
        return tempFrame;
    }

    public GlassesFrame getGlassesFrame(String key){
        return frames.get(key);
    }

    public void displayCatalogue() {
        StringBuilder output = new StringBuilder();
        for (String key: frames.keySet()){
            output.append(key).append(" = ").append(frames.get(key).getDescription()).append("\n\n");
        }
        JOptionPane.showMessageDialog(null,"----Catalogue List---\n\n" + output);
    }

    private void instatiateCatalogue(){

        frames.put("Round Frame", new RoundFrame(new Lens("Varifocal", 20.0), Size.LARGE));
        frames.put("Square Frame", new SquareFrame(new Lens("Bifocal", 30.0), Size.MEDIUM));

    }


}