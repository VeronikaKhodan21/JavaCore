

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class BackupDir {
    public static Boolean upBackup(String source,String backup ) {
         try {
            return backup(source, backup);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
     public static Boolean backup(String sourceDir, String backupDir) throws IOException {
        Path sourcePath = Paths.get(sourceDir);
        Path backupPath = Paths.get(backupDir);
        // проверяем существует ли деректория
        if (!Files.exists(backupPath)) {
            Files.createDirectories(backupPath);
        }

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(sourcePath)) {
            for (Path entry : stream) {
                if (Files.isRegularFile(entry)) {
                    copFile(entry, backupPath.resolve(entry.getFileName()));
                }
            }
            return true;
        }catch(IOException e){
            return false;
        }
    }

    private static void  copFile(Path source, Path dest) throws IOException {
        Files.copy(source, dest, StandardCopyOption.REPLACE_EXISTING);
    }
}
