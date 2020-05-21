/*
Q. Write a progeam to read the contents of a file one line at a time and output them to the screen.
*/

package I_O_Stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        BufferedReader in = null;

        try
        {
            in = new BufferedReader(new FileReader("source_BufferReader.txt"));


            String Line;
            while(true)
            {
                Line = in.readLine();
                if(Line == null)
                    break;
                System.out.println(Line);
            }
        }
        finally
        {
            if(in!= null)in.close();
        }

    }
}
