package lecture_2.virus;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Path base = Paths.get("D:\\Me\\ITC\\YEAR3\\semester1\\OOP\\Course\\code\\lecture_2\\virus\\test\\");

        try (Stream<Path> stream = Files.walk(base)) {
            for (int i = 1; i <= 5; i++) {
            Path folder = base.resolve(String.format("folder_%03d", i));
            Files.createDirectories(folder);
            System.out.println("Created: " + folder.getFileName());
        }
            stream.filter(Files::isDirectory)
                  .forEach(dir -> {
                     for(int i = 0; i < 5; i++){
                         Path file = dir.resolve("file_" + i + ".txt");
                         
                         Files.writeString(file, """
                                Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
                                Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?""");
                      try {
                          Files.createFile(file);
                          System.out.println("Created: " + file);
                      } catch (IOException e) {
                          System.err.println("Could not create " + file + ": " + e.getMessage());
                      }
                     }
                  });
        } catch (IOException e) {
            System.err.println("Error walking folder: " + e.getMessage());
        }
    }
}