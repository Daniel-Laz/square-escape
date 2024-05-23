import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("inserisci il lato del quadrato");
        int l=in.nextInt();
        System.out.print(pulisci());
        for (int i=0; i< l ; i++){
            for (int j=0; j< l ; j++) {
                System.out.print('x'+ "  ");
            }
            System.out.println();
        }
    }
    public static String posizione(int x, int y) {
        return "\033["+ y +";2"+ x +"H";
    }
    public static String pulisci() {
        return "\033[2J";
    }
    public static String colore(int x){
        return "\u001b["+x+"m";
    }
    public static void ritardo() {
        for (int i = 0; i < 999999999; i++) {
            for (int j = 0; j < 999999999; j++) {
            }
        }
    }
}