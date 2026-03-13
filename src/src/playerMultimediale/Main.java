package playerMultimediale;
import elements.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Multimedia[] elements = new Multimedia [5];

        elements[0] = new Image("Foto",4);
        elements[1] = new Audio("Track1",3, 3);
        elements[2] = new Audio("Track2",4, 4);
        elements[3] = new Video("Youtube1",1, 5, 3);
        elements[4] = new Video("Youtube2",3, 4, 7);
Scanner scanner = new Scanner(System.in);
int chooseelement;

do {
    System.out.println("Choose ur element between 1 and 5, type 0 to end the simulation");
    chooseelement = scanner.nextInt();
    /* la persona scrivera' 1 sul terminale, senza l'if sottostante verra' letto sempre il secondo
    elemento dell'array, devo quindi "simulare" la scelta del primo elemento, per farlo sottraggo 1
    al numero scelto dall'utente
    */
    if (chooseelement >= 1 && chooseelement <= 5) {
        Multimedia element  = elements [ chooseelement - 1 ];

        if (element instanceof ElementoRiproducibile) {
            ((ElementoRiproducibile) element).play();
        } else if (element instanceof Image) {
            ((Image) element).show();
        }
    } else if (chooseelement >5) {System.out.println("non esiste questo elemento, controlla di elemento, controlla di aver inserito un numero tra 1 e 5");
}else System.out.println("Programma terminato");} while (chooseelement != 0);
        System.out.println("Per stavolta ha funzionato, riprova, potrebbe esplodere tutto");

        scanner.close();
    }
}