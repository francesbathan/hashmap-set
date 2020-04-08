import java.util.HashMap;
import java.util.Set;

public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Take A Bow", "Corrupt, you corrupt...");
        trackList.put("Starlight", "Far away, the ship is taking me far away...");
        trackList.put("Supermassive Black Hole", "Oh baby, don't you know I suffer...");
        trackList.put("Map of the Problematique", "Fear, and panic in the air...");

        Set<String> keys = trackList.keySet();
        System.out.println(trackList.get("Supermassive Black Hole"));
        for(String key : keys) {
            System.out.print("Track: " + key + " " + "Lyrics: " + '"' + trackList.get(key) + '"');
        }
    }
}