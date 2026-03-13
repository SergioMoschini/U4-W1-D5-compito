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

  /*  for (int i = 0; i < length; i++){
        System.out.print(title);

        for (int y = 0; y < volume; y++){
            System.out.print("!");
        }
        for (int x = 0; x < brightness; x++ ){
            System.out.print("*");
        }
        System.out.println();
    }questo ciclo for e' un ciclo di "prova" sotto suggerimento del professore ho utilizzato il concatenamento
    //al posto di print e println */
    for (int i = 0; i < length; i++) {
        String result = title;
        for (int y = 0; y < volume; y++) {
            result += "!";
        }
        for (int x = 0; x < brightness; x++) {
            result += "*";
        }
        System.out.println(result);
    }
}}