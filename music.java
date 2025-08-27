// File: music/playable.java
package music;

public interface playable {
    void play();
}
// File: music/string/Veena.java
package music.string;

import music.playable;

public class Veena implements playable {
    @Override
    public void play() {
        System.out.println("Veena is playing");
    }
}
// File: music/wind/Saxophone.java
package music.wind;

import music.playable;

public class Saxophone implements playable {
    @Override
    public void play() {
        System.out.println("Saxophone is playing");
    }
}
// File: live/Test.java
package live;

import music.playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {
    public static void main(String[] args) {
        // Creating instances of Veena and Saxophone
        Veena veena = new Veena();
        Saxophone saxophone = new Saxophone();
        
        // Calling play method
        veena.play();
        saxophone.play();
        
        // Placing instances in variables of type playable
        playable instrument1 = veena;
        playable instrument2 = saxophone;
        
        // Calling play method using playable variables
        instrument1.play();
        instrument2.play();
    }
}
