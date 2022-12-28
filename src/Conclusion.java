import java.io.File;
import java.io.IOException;

public class Conclusion {
    static StringBuilder sb = new StringBuilder();
    static void conclusion(File name) {
        try {
            if (name.mkdir())
                sb.append(" Directory " + name.getName() + " - create. ");
            else
                System.out.println("not create");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
    static void conclusionFile(File q) {
        try {
            if (q.createNewFile())
                sb.append(" File " + q.getName() + " - create. ");
            else
                System.out.println("not create");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
