package Structural.Adapter;
//Target Interface
 interface MediaPlayer {
    void play(String audioType, String fileName);
}
// Adaptee
class VlcPlayer {
    public void playVlcFile(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }
}
// Adapter
 class VlcAdapter implements MediaPlayer {
    private VlcPlayer vlcPlayer;

    public VlcAdapter() {
        vlcPlayer = new VlcPlayer();  // Initialize VlcPlayer instance
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            vlcPlayer.playVlcFile(fileName);  // Delegate to VlcPlayer method
        } else {
            System.out.println("Invalid format. " + audioType + " format not supported by VlcPlayer.");
        }
    }
}
// class AudioPlayer implements MediaPlayer {
//    private VlcAdapter vlcAdapter;
//
//    public AudioPlayer() {
//        vlcAdapter = new VlcAdapter();  // Initialize VlcAdapter
//    }
//
//    @Override
//    public void play(String audioType, String fileName) {
//        if (audioType.equalsIgnoreCase("vlc")) {
//            vlcAdapter.play(audioType, fileName);  // Use the adapter to play vlc files
//        } else {
//            System.out.println("Invalid media. " + audioType + " format not supported");
//        }
//    }
//}
 class SingleInterfaceAdapter {
    public static void main(String[] args) {
//        AudioPlayer audioPlayer = new AudioPlayer();
        VlcAdapter audioPlayer=new VlcAdapter();
        audioPlayer.play("vlc", "example.vlc");
        audioPlayer.play("mp4", "example.mp4");
    }
}


