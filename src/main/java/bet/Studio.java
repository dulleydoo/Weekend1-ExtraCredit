package bet;

public class Studio {
    public static void main(String[] args) {
        //Artist(String artistName, String label)

        String[] beyonceSongs = {"Who runs the world", "Halo", "Thick"};
//        for(int x = 0; x < beyonceSongs.length; x++){
//            System.out.println(beyonceSongs[x]);
        String[] poloGSongs = {"Brothers", "Pop Star", "Block Party"};
        String[] lilDurkSongs = {"Crossroads", "Back In Blood", "Laugh Now Cry Later"};
        Artist artist1 = new Artist("Beyonce","Universal", beyonceSongs);
        Artist artist2 = new Artist("Polo G", "Interscope", poloGSongs);
        Artist artist3 = new Artist("Lil Durk", "The Streets",lilDurkSongs);



        artist1.playPlaylist();
        System.out.println("============================");
        artist2.playPlaylist();
        System.out.println("============================");
        artist3.playPlaylist();








    }
}
