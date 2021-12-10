package Singleton;

import Decorator.Glasses.*;

import javax.swing.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class Catalogue  {

    private Map<String, GlassesFrame> frames = new HashMap<>();
    private static Catalogue instance = null;

    private Catalogue(){
        instatiateCatalogue();
    }

    public void addFrame(String key, GlassesFrame frame) {
        frames.put(key, frame);

    }

    public static synchronized Catalogue getInstance(){
        if(instance == null)
             instance = new Catalogue();
        return instance;

    }

    public GlassesFrame buyFrame(String key) {

        if( frames.containsKey(key)){
        GlassesFrame tempFrame = getGlassesFrame(key);

            Iterator it = frames.entrySet().iterator();
            while (it.hasNext()) {
                Entry item = (Entry) it.next();
                if(item.getValue() == key) it.remove();
            }
        frames.remove(key);
        return tempFrame;
        }
        throw new NullPointerException("Not Avalaible");
    }

    public GlassesFrame getGlassesFrame(String key){
        return frames.get(key);
    }


    public void displayCatalogue() {
        StringBuilder output = new StringBuilder();
        Iterator it = frames.entrySet().iterator();
        while(it.hasNext()){
            Entry<String, GlassesFrame> value = (Entry)it.next();
            output.append(value.getKey()).append(" = ").append(value.getValue().getDescription()).append("\n\n");
        }
        JOptionPane.showMessageDialog(null,"----Catalogue List---\n\n" + output);
    }

    private void instatiateCatalogue(){

        frames.put("Round Frame", new RoundFrame(new Lens("Varifocal", 20.0), Size.LARGE));
        frames.put("Square Frame", new SquareFrame(new Lens("Bifocal", 30.0), Size.MEDIUM));

    }


}