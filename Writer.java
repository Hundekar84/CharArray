package CharArrayWriter;

import java.io.*;

public class Writer {
    public static void main(String[] args) throws IOException {
        CharArrayWriter charArrayWriter=new CharArrayWriter();
        charArrayWriter.write("i am santosh");


        FileWriter f1=new FileWriter("src/a1.txt");
        FileWriter f2=new FileWriter("src/b1.txt");

        System.out.println("created");


        charArrayWriter.writeTo(f1);
        charArrayWriter.writeTo(f2);
        f1.close();
        f2.close();


    }
}
/*
a1=i am santosh
b1=i am santosh
 */