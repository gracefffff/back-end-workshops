import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String path = in.nextLine();
        CatalogScanner catalogScanner = new CatalogScanner(path);
        catalogScanner.scan();
    }
}
