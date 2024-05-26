package StructuralDesignPattern.AdapterDesign.Media;

public class MediaAdapter {
    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equals("VLC")){
            advancedMusicPlayer = new VLCPlayer();
        }
        else if(audioType.equals("MP4")){
            advancedMusicPlayer = new MP4Player();
        }
    }

    public void play(String audioType, String filename){
        if(audioType.equalsIgnoreCase("VLC")){
            advancedMusicPlayer.playVLC(filename);
        }
        else if(audioType.equalsIgnoreCase("MP4")){
            advancedMusicPlayer.playMP4(filename);
        }
    }
}
