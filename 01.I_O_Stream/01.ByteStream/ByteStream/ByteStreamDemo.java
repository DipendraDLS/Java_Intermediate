package ByteStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ByteStreamDemo
{
    public static void main(String[] args) throws FileNotFoundException
    {

        Scanner in = new Scanner(new File("source.txt"));
        PrintWriter out = new PrintWriter(new File("destination.txt"));

        int recordCount = in.nextInt();
        System.out.println("No. of Records: " + recordCount);

        for (int i = 1; i <= recordCount; i++)
        {
            String name = in.next();
            int m1 = in.nextInt();
            int m2 = in.nextInt();
            int m3 = in.nextInt();
            int m4 = in.nextInt();
            int m5 = in.nextInt();
            int total = m1+m2+m3+m4+m5;
            out.printf("%s %d %d %d %d %d %d %n", name,m1,m2,m3,m4,m5,total);
        }
        in.close();
        out.close();
        System.out.println("Output written to destination file.");
    }

}