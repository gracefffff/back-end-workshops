import java.io.*;
import java.nio.charset.StandardCharsets;

public class CatalogScanner {
    private File catalog;

    CatalogScanner(String pathCatalog) {
        this.catalog = new File(pathCatalog);
    }

    private File[] getFiles() {
        return catalog.listFiles();
    }
    private String recognitionFileType(File file) {
        if(file.isDirectory()) {
            return "directory";
        }
        else {
            return "file";
        }
    }
    private String recognitionAtribute(File file) {
        StringBuilder atributes = new StringBuilder();
        if(file.canRead()) {
            atributes.append("r");
        }
        else {
            atributes.append("-");
        }
        if(file.canWrite()) {
            atributes.append("w");
        }
        else {
            atributes.append("-");
        }
        if(file.canExecute()) {
            atributes.append("x");
        }
        else {
            atributes.append("-");
        }
        return atributes.toString();
    }


    public void scan() throws IOException {
        int counter = 0;
        final int COUNTER_MAX_VALUE = 5;
        BufferedWriter writer = new BufferedWriter(new PrintWriter(catalog.getAbsolutePath() + "/output.txt",
                "UTF-8"));
        File[] files = getFiles();
        for (File file: files) {
            writer.write(file.getName() + ", "+ recognitionFileType(file)+", " + recognitionAtribute(file) + ", " + file.getAbsolutePath() +"\n" );
            counter++;
            if (counter == COUNTER_MAX_VALUE){
                writer.flush();
                counter = 0;
            }
        }
        writer.close();
    }

}
