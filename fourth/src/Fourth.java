import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Fourth {
    public static void main(String[] args) {
        // Задание 1
        backupDirMain();
        playGameMain();
    }
    public static void backupDirMain(){
       Boolean backup = BackupDir.upBackup("./fourth","./fourth/backup");
        if (backup) {
            System.out.println("Резервная копия упешно создана!");
        }else{
            System.out.println("Что-то пошло не так......");
        } 
    }
    
    public static void playGameMain(){
        List<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 9; i++) {
            int x = r.nextInt(3);
            list.add(x);
            
        }
        PlayGame pg = new PlayGame(list);
        System.out.println(pg.toString());
        Boolean bol = pg.writeGameFile("fourth/tot.txt") ;
        if(bol){
            System.out.println("Всё успешно записано");
        }else{
            System.out.println("Что-то пошло не так.....");
        }
        Boolean out = pg.toReadGameFile("fourth/tot.txt");
        if(out){
            System.out.println("\nВсё успешно прочитано");
        }else{
            System.out.println("\nЧто-то пошло не так.......");
        }
        System.out.println( new PlayGame("fourth/tot.txt").toString());
    }

}
