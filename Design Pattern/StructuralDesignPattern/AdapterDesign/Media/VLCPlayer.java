package StructuralDesignPattern.AdapterDesign.Media;

public class VLCPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVLC(String filename) {
        System.out.println("Playing VLC File | Name: " + filename);
    }

    @Override
    public void playMP4(String filename) {
        
    }
    
}
