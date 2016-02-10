package Opdracht1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.logging.Formatter;

/**
 * Created by tulip on 08/02/2016.
 */
public class ConstituentDigitsMain {




    public static void main(String[] args) {

        CreateNewFile y = new CreateNewFile();
        y.createFile();


        ReadFile x = new ReadFile();        // This is exercise 1
        x.openFile();
        x.readFileSum();
        x.closeFile();

        ReadFile z = new ReadFile();        // This is exercise number 2 but I integrated it in this exercise.
        z.openFile();
        z.readFileSumofAll();
        z.closeFile();

        CreateNewLargeFile a = new CreateNewLargeFile();
        a.createLargeFile();

        ReadFile b = new ReadFile();
        b.openFile();
        b.readFileSort();
        b.closeFile();

    }
}
