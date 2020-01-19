package BusyLine;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Scanner {
    public ArrayList<String> getLines (File file) {
        ArrayList<String> lines = new ArrayList<>();
        int i = 0;
        try {
            java.util.Scanner scan = new java.util.Scanner(file);
            while (scan.hasNextLine()){
                lines.add(i, scan.nextLine());
                ++i;
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return lines;

    }

}
