package nio2;


import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import static java.io.File.separator;

public class FileManager {
    public static void main(String[] args) throws Exception {
        String inputFile = separator + "Users" + separator + "ted.sc" + separator + "Desktop" + separator + "2021ems개인정보통지대상자.txt";

        String file = separator + "Users" + separator + "ted.sc" + separator + "Desktop" + separator + "git" +
                separator + "javaStudy" + separator + "src" +separator + "nio2" + separator + "file.txt";
        Path fromPath = writeFile(Paths.get(file));
        readFile(fromPath);
        copyMoveDelete(fromPath, file);
    }

    public static void copyMoveDelete(Path fromPath, String fileName){
        try{
            Path toPath = fromPath.toAbsolutePath().getParent();

            //디렉토리가 없다면 생성
            Path copyPath = toPath.resolve("copied");
            if(!Files.exists(copyPath)) Files.createDirectories(copyPath);

            //파일 복사
            Path copiedFilePath = copyPath.resolve(fileName);
            StandardCopyOption  copyOption = StandardCopyOption.REPLACE_EXISTING;

            //복사된 파일 읽기
            System.out.println("***** Copied file contents *****");
            readFile(copiedFilePath);

            //파일 이동
            Path movedFilePath = Files.move(copiedFilePath, copyPath.resolve("moved.txt"),copyOption);

            //파일 삭제
            Files.delete(movedFilePath);
            Files.delete(copyPath);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void readFile(Path path) throws Exception{
        Charset charset=Charset.forName("EUC_KR");
        System.out.println("Path="+path);
        List<String> fileContents = Files.readAllLines(path, charset);
        for(String tempContents:fileContents)
            System.out.println(tempContents);
        System.out.println();
    }

    public static List<String> getContents(){
        List<String> contents = new ArrayList<>();
        contents.add("첫째 줄");
        contents.add("둘째 줄");
        contents.add("셋째 줄");
        contents.add("Current Date="+new Date());
        return contents;
    }

    public static Path writeFile(Path path) throws Exception{
        Charset charset = Charset.forName("EUC_KR");
        List<String> contents = getContents();
        StandardOpenOption openOption = StandardOpenOption.CREATE;
        return Files.write(path, contents, charset, openOption);
    }
}
