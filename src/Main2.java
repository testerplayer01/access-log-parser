import java.io.File;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        main2(args);
    }

    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int validFileCount = 0;

        while (true) {
            System.out.println("Введите путь к файлу:");
            String path = scanner.nextLine();
            File file = new File(path);

            boolean fileExists = file.exists();
            boolean isFile = file.isFile();

            if (!fileExists) {
                System.out.println("Файл не существует.");
                continue;
            } else if (!isFile) {
                System.out.println("Указанный путь ведёт к папке, а не к файлу.");
                continue;
            } else {
                validFileCount++;
                System.out.println("Путь указан верно");
                System.out.println("Это файл номер " + validFileCount);
            }
        }
    }
}
