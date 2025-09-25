package hangman;
import java.util.Scanner;
import java.util.Random;
public class AppHangman{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int hp = 10;
        final String[] words = {"машина", "дом", "путь", "ракета", "кот", "собака"};
        int num = rand.nextInt(0, 6);
        String wordOfGame = words[num];
        char[] mask = new char[wordOfGame.length()];
        char[] wordToChar = wordOfGame.toCharArray();
        for(int i = 0; i < wordOfGame.length(); i++){
            mask[i] = '-';
        }
        while(true){
            int matchCount = 0, winCondition = 0;
            System.out.println(mask);
            System.out.print("Оставшееся количество жизней: " + hp +
                    "\n" + "Введите букву: ");
            String inChar = input.next();
            if(inChar.length() > 1){
                System.out.print("Можно ввести только одну букву!" + '\n' + "Ввод: ");
                inChar = input.next();
            }
            char[] i = inChar.toCharArray();
            for(int x = 0; x < wordOfGame.length(); x++){
                if(i[0] == wordToChar[x]){
                    mask[x] = wordToChar[x];
                    matchCount++;
                }else continue;
            }
            if(matchCount == 0) hp--;
            if(hp == 0){
                System.out.println("ВЫ ПРОИГРАЛИ");
                break;
            }
            for(int x = 0; x < wordOfGame.length(); x++){
                if(mask[x] != '-') winCondition++;
            }
            if(winCondition == wordOfGame.length()){
                System.out.println("ВЫ ПОБЕДИЛИ");
                break;
            }
        }
    }
}