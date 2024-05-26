package StructuralDesignPattern.AdapterDesign.Media;

public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String filename) {
        if(audioType.equalsIgnoreCase("MP3")){
            System.out.println("Playing MP3 File | Name: " + filename);
        }
        else if(audioType.equalsIgnoreCase("VLC") || audioType.equalsIgnoreCase("MP4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, filename);
        }
        else{
            System.out.println("Invalid Media: " + audioType + "Format Not Supported");
        }
    }
    
}
