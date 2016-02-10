package Opdracht1;

import java.io.File;
import java.io.FileWriter;

/**
 * Created by tulip on 08/02/2016.
 */
public class CreateNewFile {

    public void createFile(){           //Creates a new file that is going to be used
        File f = new File ("constituent.txt");
        FileWriter writer =  null;

        char[] in = new char[50];
        try {
            f.createNewFile();
            System.out.println("constituent.txt is created");   //I kept this line just for my own security
            writer = new FileWriter("constituent.txt");
            writer.write(" 034 \n 035 \n 0324 \n 261 \n 46534");   //I added these numbers myself, but I guess the next exercise will be adding a method to implement it.
            writer.flush();
            writer.close();
        }
        catch(Exception e){
            System.out.println("the .txt is not created");
        }
    }


}
