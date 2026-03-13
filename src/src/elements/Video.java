package elements;

public class Video extends Multimedia implements ElementoRiproducibile {

    private int brightness;
    private int length;
    private int volume;
    public Video(String title, int length, int volume, int brightness){
        super(title);
        this.length = length;
        this.volume = volume;
        this.brightness = brightness;

    }

    public void volumeDown() {
        volume--;
    }
    public void volumeUp () {
        volume++;
    }

    public void brightnessDown() {
    brightness-- ;
}
public void brightnessUp() {
brightness++ ;
}
@Override
public void play() {
    for (int i = 0; i < length; i++){
        System.out.print(title);

        for (int y = 0; y < volume; y++){
            System.out.println("!");
        }
        for (int x = 0; x < brightness; x++ ){
            System.out.println("*");
        }
        System.out.println("funzionano tutto i video");
    }
}}