import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainTwo {
    public static void main(String[] args) {
//        try {
//            List<String> listStrings = Files.readAllLines(Paths.get(
//                    "C:\\Users\279014648\\IdeaProjects\\Files\\data\\info.txt"));
//
//            PrintWriter printWriter = new PrintWriter(
//                    "C:\\Users\\279014648\\IdeaProjects\\Files\\data\\book.txt");
//            for (String line : listStrings) {
//                printWriter.write(line + "\n");
//            }
//
//            printWriter.flush();
//            printWriter.close();
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }
//    }

        try {
            List<String> listStrings = Files.readAllLines(Paths.get(
                    "C:\\Users\\279014648\\IdeaProjects\\Files\\data\\info.txt"));


            ArrayList<String> arrayList = new ArrayList<>(listStrings);

            Files.write(Paths.get(
                    "C:\\Users\\279014648\\IdeaProjects\\Files\\data\\new_book_2024.txt"
            ), arrayList);

            
        } catch (Exception ex) {
            ex.getMessage();
        }
        }
}
