package StructuralDesignPattern.AdapterDesign.Media;

public class AdapterPatterDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("MP3", "Beyond the Horizon.mp3");
        audioPlayer.play("MP4", "Alone.mp4");
        audioPlayer.play("VLC", "Far Far Away.vlc");
        audioPlayer.play("avi", "Mind Me.avi");
    }   
}
