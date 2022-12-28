import java.io.File;
import java.util.Arrays;
import java.util.List;

public class Main {
    static void file (){
        List<String> dirList = Arrays.asList("F:/", "Game","F:/Game", "src","F:/Game", "res","F:/Game", "savegames","F:/Game", "temp","F:/Game/src", "main"
                ,"F:/Game/src", "test","F:/Game/res", "drawables","F:/Game/res", "vectors","F:/Game/res", "icons");
        for (int i = 0; i < dirList.size(); i=i+2) {
            int j = i +1;
            File dir = new File(dirList.get(i), dirList.get(j));
            Conclusion.conclusion(dir);
        }
        List<String> fileList = Arrays.asList("F:/Game/temp", "temp.txt", "F:/Game/src/main", "Main.java","F:/Game/src/main", "Utils.java");
        for (int i = 0; i < fileList.size(); i=i+2) {
            int j = i+1;
            File file = new File(fileList.get(i), fileList.get(j));
            Conclusion.conclusionFile(file);
        }
    }
    public static void main(String[] args) {
        file();
    }
}