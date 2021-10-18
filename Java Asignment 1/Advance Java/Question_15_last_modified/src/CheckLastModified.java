import java.io.File;
import java.util.Date;

public class CheckLastModified {
    public static void main(String[] args) {
        String filePath = "src/myFile.txt";
        File file = new File(filePath);
        Date date=new Date(file.lastModified());
        System.out.println("\nThe file was last modified on: "+date+"\n");
    }
}