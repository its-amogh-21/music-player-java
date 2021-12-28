public class Song {
    String songName;
    double duration;

    public Song(String songName, double duration){
        this.songName = songName;
        this.duration = duration;
    }

    public String getSongName(){
        return songName;
    }

    public double getDuration(){
        return duration; 
    }

    public static void main(String[] args) {
        
    }
}
