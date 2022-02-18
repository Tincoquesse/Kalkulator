package menageData;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class FileMenager {
    
    FileWriter fileWriter;
    PrintWriter printWriter;

    public FileMenager(String fileName) throws IOException {
        this.fileWriter = new FileWriter(fileName);
        this.printWriter = new PrintWriter(fileWriter);
    }
    public void saveToFile(String input, double sum){
        printWriter.printf("%s=%s\n", input, sum);
    }
    public void closeWriting(){
        printWriter.close();
    }
}
