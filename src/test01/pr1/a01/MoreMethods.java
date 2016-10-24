package test01.pr1.a01;

import java.io.PrintWriter;
/**
 * Created by HalfBaked on 24.10.2016.
 * Aufgabe 1.c
 * Gibt alle Buchstaben des Alphabets in einer Zeile getrennt durch Leerzeichen aus.
 * Hat der Parameter smallLetters den Wert true, dann werden die Kleinbuchstaben ausgegeben,
 * hat smallLetters den Wert false werden die Grossbuchstaben ausgegeben.
 */
public class MoreMethods {

    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out, true);
        printAlphabet(out,true);
    }
        public static void printAlphabet(PrintWriter out, boolean smallLetters){
            char s = 'a';
            char b = 'A';

            while(s <= 'z'){
                if(smallLetters){
                    out.print(s);
                } else {
                    out.print(b);
                }
                out.print(' ');
                s++;
                b++;
                
            }
        }

}
