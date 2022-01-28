package nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

import static java.io.File.separator;

public class PathsAndFiles {
    public static void main(String args[]){
        String dir = separator + "Users" + separator + "ted.sc" + separator + "Desktop" + separator + "git" +
                separator + "javaStudy" + separator + "src" +separator + "nio2";
        String dir2 = separator + "Users" + separator + "ted.sc";
        checkPath(dir,dir2);
    }

    public static void checkPath(String dir1, String dir2){
        Path path = Paths.get(dir1);
        Path path2 = Paths.get(dir2);
        Path relatived = path.relativize(path2);
        System.out.println("relatived path="+relatived);
        Path absolute = relatived.toAbsolutePath();
        System.out.println("toAbsolutePath path="+absolute);
        Path nomalized = absolute.normalize();
        System.out.println("nopmalized path="+nomalized);
        Path resolved = path.resolve("Users");
        System.out.println("resolved path="+resolved);
    }
}
