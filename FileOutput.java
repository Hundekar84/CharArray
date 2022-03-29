package CharArrayWriter;

import javax.swing.*;
import java.io.*;
import java.util.Optional;

public class FileOutput {
    public static void main(String[] args) throws IOException {
        FileOutputStream f1=new FileOutputStream("src/CharArrayWriter/a1");
        FileOutputStream f2=new FileOutputStream("src/CharArrayWriter/a2");

        f1.write(65);
        f2.write(66);


        System.out.println("created");

        FileInputStream d1=new FileInputStream("src/CharArrayWriter/a1");
        FileInputStream d2=new FileInputStream("src/CharArrayWriter/a2");


        SequenceInputStream sin=new SequenceInputStream(d1,d2);
        int i=0;
        while ((i= sin.read())!=-1){
            System.out.println(i);
        }
        System.out.println("sucess");
    }
}
