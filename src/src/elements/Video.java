package elements;

public class Video extends Multimedia implements ElementoRiproducibile {

    private int brightness;
    private int lenght;
    private int volume;
    public Video(String title, int lenght, int volume, int brightness){
        super(title);
        this.lenght = lenght;
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
public void play() {
    for (int i = 0; i < lenght; i++){
        System.out.print(title);

        for (int y = 0; y < volume; y++){
            System.out.println("!");
        }
        for (int x = 0; x < brightness; x++ ){
            System.out.println("*");
        }
        System.out.println("funziona tutto fino ad ora");
    }
}}