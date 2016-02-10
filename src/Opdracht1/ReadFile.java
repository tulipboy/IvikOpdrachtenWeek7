package Opdracht1;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by tulip on 08/02/2016.
 */
public class ReadFile {

    public static Scanner reader;
    public static Scanner lezer;
    ArrayList<Integer> unsorted = new ArrayList<Integer>();
    ArrayList<Integer> sorted = new ArrayList<Integer>();

    public void openFile() {
        try {
            reader = new Scanner(new File("constituent.txt"));
        } catch (Exception e) {
            System.out.println("could not open the file");
        }
    }

    public void openFileList(){
        try {
            lezer = new Scanner(new File("largeFile.txt"));
        } catch (Exception e) {
            System.out.println("could not open the large file (exercise 3)");
        }
    }

    public void readFileSum() {
        while (reader.hasNextInt()) {         //reads the next int from the file
            String a = reader.next();
            AddUp x = new AddUp();

            int A = Integer.parseInt(a);    //made it a int
            int sum = x.addUp(A);           //I added a method to make it easier to read

            System.out.print("The sum of the individual digits " + a + " becomes: " + sum + "\n");
        }
    }

    public void readFileSumofAll() {
        int sumOfAll = 0;
        while (reader.hasNextInt()) {
            String a = reader.next();
            int A = Integer.parseInt(a);
            sumOfAll = sumOfAll + A;
        }
        System.out.println("The sum of all the numbers together = " + sumOfAll);
    }

    public void closeFile() {
        reader.close();
    }

   /* public void readFileSort() {

        while (lezer.hasNextLine()) {         //reads the next int from the file

            unsorted.add(lezer.nextLine());

            String a = lezer.nextLine();

            unsorted.add(Integer.parseInt(a));

            Collections.sort(unsorted);

            System.out.println("After Sorting:");
            for (int counter : unsorted) {
                sorted.add(counter);
            }
            System.out.println(sorted);
        }

    }
    */
}