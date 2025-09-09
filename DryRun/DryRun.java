import java.io.*;
import java.util.*;

public class DryRun {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner("DryRun\\dryrun.dat");

        while(s.hasNextLine()) {
            String text = s.nextLine();
            System.out.println(text);
        }

        s.close();
    }
}
