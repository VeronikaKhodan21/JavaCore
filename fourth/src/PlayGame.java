

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class PlayGame {
    public   List<Integer> list;

    public PlayGame(List<Integer> list ){
        this.list = list;
    }
    public PlayGame(String plaseFile){
        try (BufferedReader reader = new BufferedReader(new FileReader(plaseFile))) {
                    String str =reader.readLine();
                    this.list = convertList(str);
                } catch (IOException e) {
                }
    }
    public String toString(){
        String a = "Поле игры: \n";
        for (int i = 0; i <3; i++) {
            if(list.get(i) == 1){
                a += "x ";
            }if(list.get(i) == 0){
                a +=  "* ";
            }if(list.get(i)== 2){
                a += "o ";
            }}
            a+="\n";
        for (int i = 3; 2<i && i< 6; i++){
            if(list.get(i) == 1){
                a+= "x ";
            }if(list.get(i)== 0){
                a  += "* ";
            }if(list.get(i)== 2){
                a += "o ";
            }}
            a+="\n";
        for (int i = 6; 5<i && i<9; i++){
            if(list.get(i) == 1){
                a += "x ";
            }if(list.get(i) == 0){
                a +="* ";
            }if(list.get(i)== 2){
                a +="o ";
            }}
            return a;
    }
    private  byte [] gameToBite(){
        byte[] bytes = new byte[9];
        for (int i = 0; i < list.size(); i++) {
            byte b = (byte) Integer.parseInt(list.get(i).toString());
            bytes[i] = b;
        }
        return bytes;
    }
    public Boolean writeGameFile(String nameFile){
        try (FileOutputStream file = new FileOutputStream(nameFile)) {
            file.write(gameToBite());
            return true;
        } catch (IOException e) {
            return false;
        }
    }
    public Boolean toReadGameFile(String plaseFile){
        try (BufferedReader reader = new BufferedReader(new FileReader(plaseFile))) {
                    String str =reader.readLine();
                    this.list = convertList(str);
                    return true;
                } catch (IOException e) {
                    return false;
                }
    }
    private List<Integer> convertList(String str){
        byte[] byts = str.getBytes();
        int[] ret = new int[byts.length];
        for (int i = 0; i < byts.length; i++)
        {
            ret[i] = byts[i];
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            list.add( Integer.valueOf(ret[i]));
        }
        return list;
    }
}

