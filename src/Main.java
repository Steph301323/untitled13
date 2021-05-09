import java.io.File;
import java.io.IOException;
import java.lang.StringBuilder;

class Main {

    public static void main(String[] args) {

        File dir = new File("D://Games");
        // если объект представляет каталог
        if (dir.isDirectory()) {
            // получаем все вложенные объекты в каталоге
            for (File item : dir.listFiles()) {

                if (item.isDirectory()) {

                    System.out.println(item.getName() + "  \t folder");
                } else {

                    System.out.println(item.getName() + "\t file");
                }
            }
        }
        File directory = new File("D://Games//src//main");
        boolean created = directory.mkdir();
        if (created)
            System.out.println("директория создана");
        File file1 = new File("D://Games//src//test");
        boolean d = file1.mkdir();
        if (d)
            System.out.println("директория создана");

        File file = new File("D://Games//res");

        boolean a = file.mkdir();
        if (a)
            System.out.println("директория создана");
        File direct = new File("D://Games//savegames");
        boolean b = direct.mkdir();
        if (b)
            System.out.println("директория создана");
        File dire = new File("D://Games//temp");
        boolean c = dire.mkdir();

        if (c)
            System.out.println("директория создана");

        File myFile = new File("D://Games//src//main//Main.java");
        try {
            if (myFile.createNewFile())
                System.out.println("Файл был создан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        File myFile1 = new File("D://Games//src//main//Utils.java");
        try {
            if (myFile1.createNewFile())
                System.out.println("Файл был создан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File file3 = new File("D://Games//res//drawables");

        boolean aa = file3.mkdir();
        if (aa)
            System.out.println("Folder has been created");
        File file4 = new File("D://Games//res//vektors");

        boolean aaa = file4.mkdir();
        if (aaa)
            System.out.println("директория создана");
        File file5 = new File("D://Games//res//icons");

        boolean bb = file5.mkdir();
        if (bb)
            System.out.println("директория создана");

        File myFile12 = new File("D://Games//temp//temp.txt");
        try {
            if (myFile12.createNewFile())
                System.out.println("Файл был создан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }




    }
}