package bet;

public class Artist {
    //name, label, songs
    public String artistName;
    public String label;
    public String[] songs;

    //constructor
    public Artist(String artistName, String label, String[] songs){
        this.artistName = artistName;
        this.label = label;
        this.songs = songs;
    }

    public void playPlaylist() {
        for (int x = 0; x < songs.length; x++) {
            System.out.println(songs[x]);
        }

        }










//        for(int x = 0; x < songs.length; x++) {
//            System.out.println(songs[x]);

            //songs
            //iterate through  iterate/repeatedly
            //start at first song
            //go to the next song



    //print artist name and label
    public void printArtistInfo(){
        System.out.println(this.artistName + " " + this.label);

    }


}

