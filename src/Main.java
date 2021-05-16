import java.io.File;
import java.io.IOException;
import java.lang.StringBuilder;
import java.io.FileWriter;

class Main {

   

    public static void main(String[] args) {

        StringBuilder sb =new StringBuilder() ;

        File dir = new File("D://Games");
        if (dir.mkdir())
            System.out.println(sb);

        File directory = new File("D://Games//src//main");
        boolean created = directory.mkdir();
        if (created)
            System.out.println(sb);
        File test = new File("src/test");
        boolean testim = test.mkdir();
        if (testim)
            System.out.println(sb);

        File file = new File("D://Games//res");

        boolean alex = file.mkdir();
        if (alex)
            System.out.println(sb);
        File direct = new File("D://Games//savegames");
        boolean box = direct.mkdir();
        if (box)
            System.out.println(sb);
        File dire = new File("D://Games//temp");
        boolean cex = dire.mkdir();

        if (cex)
            System.out.println(sb);

        File myFile = new File("main/Main.java");
        try {
            if (myFile.createNewFile())
                System.out.println(sb);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        File utils = new File("main/Utils.java");
        try {
            if (utils.createNewFile())
                System.out.println(sb);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File draw = new File("res/drawables");

        boolean fly = draw.mkdir();
        if (fly)
            System.out.println(sb);
        File vector = new File("res/vektors");

        boolean vect = vector.mkdir();
        if (vect)
            System.out.println(sb);
        File icons = new File("D://Games//res//icons");

        boolean icon = icons.mkdir();
        if (icon)
            System.out.println(sb);

        File temp = new File("temp/temp.txt");
        try {
            if (temp.createNewFile())
                System.out.println(sb);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        sb.append(dir);
        String text = sb.toString();
        try (FileWriter writer = new FileWriter("temp.txt", false)) {
            writer.write(text);
            writer.append('\n');
            writer.append('!');
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }


}