package com.company;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

/**
 * Created on 5/5/16 by:
 * Dalton Lima         github.com/daltonbr
 * Lucas Pinheiro      github.com/lucaspin
 */
public class WriteFile {

    private String path = "registers.csv";
    private boolean appendToFile = false;

    public WriteFile (String filePath ) {
        path = filePath;
    }

    public WriteFile (String filePath, boolean appendValue ) {
        path = filePath;
        appendToFile = appendValue;
    }

    public void writeToFile (String textLine ){
        try {
            FileWriter write = new FileWriter( path, appendToFile);
            PrintWriter printLine = new PrintWriter( write );
            printLine.printf("%s" + "%n", textLine);
            printLine.close();
        } catch (IOException ioE ) {
            new WriteFile(path);
        }
    }
}
