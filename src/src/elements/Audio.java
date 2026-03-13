package elements;

public class Audio extends Multimedia implements ElementoRiproducibile {

    private int length;
    private int volume;

    public Audio(String title, int length, int volume) {
        super(title);
        this.length = length;
        this.volume = volume;
    }

    public void volumeDown() {
        if (volume > 0)
            volume--;
    }
    public void volumeUp () {
            volume++;
    }
    @Override
    public void play() {
        /*
        for (int i = 0; i < length; i++) {
            System.out.print(title);
            for (int y = 0; y < volume; y++) {
                System.out.print("!");
            }
            System.out.println();
        }
   */
        for (int i = 0; i < length; i++) {

            String result = title;

            for (int y = 0; y < volume; y++) {
                result += "!";
            }

            System.out.println(result);
        }

    }
}