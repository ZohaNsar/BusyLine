package BusyLine;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> lines = null;
        Scanner scanner = new Scanner();
        File file = new File ("/home/zoha/zoha/Computer Architecture/instructions");
        lines = scanner.getLines(file) ;

        System.out.println(lines);

    }

}
