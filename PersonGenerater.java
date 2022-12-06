import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.CREATE;


public class PersonGenerater
{
    public static void main(String[] args)
    {
        Scanner pipe = new Scanner(System.in);

        boolean done = false;
        ArrayList<String> personList = new ArrayList<String>();
        String ID = "";
        String firstName = "";
        String lastName = "";
        String title = "";
        int yoB = 0;

        String[] record = new String[4];

        do
        {
            ID = SafeInput.getNonZeroLenString(pipe, " ID number" );
            firstName = SafeInput.getNonZeroLenString(pipe, " First Name");
            lastName = SafeInput.getNonZeroLenString(pipe, "Last Name");
            title = SafeInput.getNonZeroLenString(pipe, "Title");
            yoB = SafeInput.getInt(pipe, "Year of Birth ");


            personList.add(ID + ", " + firstName + ", " + lastName + ", " + title + "., " + yoB);
            done = SafeInput.getYNConfirm(pipe, "Do you want to exit?");
        }
        while(!done);

        File workDir = new File(System.getProperty("user.dir"));
        Path file = Paths.get(workDir.getPath() + "\\src\\PersonTestFile.txt");

        try
        {
            OutputStream out = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out));

            for(String rec : personList)
            {
                writer.write(rec, 0, rec.length());
                writer.newLine();
            }
            writer.close();
            System.out.println("data file written");

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

}
