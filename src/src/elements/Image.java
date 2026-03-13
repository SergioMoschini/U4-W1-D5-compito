package elements;

public class Image extends Multimedia {

    private int brightness;
    public Image(String title, int brightness) {
        super(title);
        this.brightness = brightness;
    }
    public void play() {
            for (int x = 0; x < brightness; x++ ){
                System.out.println("*");
            }
            System.out.println("funzionano le immagini");
        }
}
