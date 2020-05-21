/*Q. Write a program to duplicate each character in a text file and write the output to a separate
     file using character streams.
       eg:- Source.txt
                apple
            destination.txt
                aappppllee
*/

package I_O_Stream;

import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderWriter
{
    public static void main(String[] args) throws Exception
    {

        FileReader in = null;
        FileWriter out = null;

        in = new FileReader("source_character_stream.txt");
        out =new FileWriter("destination_character_stream.txt");

        int charData;
        while(true)
        {
            charData = in.read();
            if (charData == -1)
                break;
            else
            {
                out.write(charData);
                out.write(charData);
            }
        }
        if (in!= null)in.close();
        if (out!=null)out.close();
    }
}

