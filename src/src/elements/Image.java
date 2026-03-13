package elements;

public class Image extends Multimedia {

    private int brightness;
    public Image(String title, int brightness) {
        super(title);
        this.brightness = brightness;
    }
    public void show() {

           /* for (int x = 0; x < brightness; x++ ){
                System.out.print(title+"*");
            }
            System.out.println();*/

            String result = title;

            for (int x = 0; x < brightness; x++) {
                result += "*";
            }

            System.out.println(result);
        }
        }

