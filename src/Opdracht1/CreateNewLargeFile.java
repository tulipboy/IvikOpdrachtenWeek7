package Opdracht1;

import java.io.File;
import java.io.FileWriter;

/**
 * Created by tulip on 09/02/2016.
 */
public class CreateNewLargeFile {

    public void createLargeFile(){           //Creates a new file that is going to be used
        File f = new File ("largeFile.txt");
        FileWriter writer =  null;

        char[] in = new char[50];
        try {
            f.createNewFile();
            System.out.println("largeFile.txt is created");   //I kept this line just for my own security
            writer = new FileWriter("largeFile.txt");
            writer.write(" 70.920 38.797 14.354 99.323 90.374 7.581 \n 37.507 3.263 40.079 27.999 65.213 55.552");   //I added these numbers myself, but I guess the next exercise will be adding a method to implement it.
            writer.flush();
            writer.close();
        }
        catch(Exception e){
            System.out.println("the .txt is not created");
        }
    }


}



