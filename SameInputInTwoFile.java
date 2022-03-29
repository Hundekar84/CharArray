package CharArrayWriter;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

import static java.lang.System.out;

public class SameInputInTwoFile
{
    public static void main(String[] args) throws IOException {
        CharArrayWriter charArrayWriter=new CharArrayWriter();
        charArrayWriter.write("welcome to coditas");

        FileWriter f1=new FileWriter("src/CharArrayWriter/abc1");
        FileWriter f2=new FileWriter("src/CharArrayWriter/abc2");

        out.println("done");
        charArrayWriter.writeTo(f1);
        charArrayWriter.writeTo(f2);

        charArrayWriter.close();
        f1.close();
        f2.close();

    }
}
/*
f1=welcome to coditas
f2=welcome to coditas
 */
