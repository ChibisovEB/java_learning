import java.io.FileWriter;
import java.io.IOException;
public class FileIO {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("file.txt", false)){
            fw.write("Какое то......");
            fw.append("\n");
            fw.append("Еще какое то !!!!!");
            fw.append("\n");
            fw.append("Ну и напоследок");
            fw.append("\n");
            fw.write("и последння строка");
            fw.append("\n");
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
