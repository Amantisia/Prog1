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
        printAlphabet(out, true);
        printAlphabet(out, false);
    }

    public static void printAlphabet(PrintWriter out, boolean smallLetters) {
        int from = 'A';
        int to = 'Z';
        int toLower = 32;

        if(smallLetters) {
            from += toLower;
            to += toLower;
        }

        String s = "";
        for(int i = from; i <= to; i++) {
            s += (char) i + " ";
        }

        s = s.substring(0, s.length() - 1);
        out.println(s);
    }
}
