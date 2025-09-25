package randomPasswordGenerator;
import java.util.Random;
import java.util.Scanner;

public class AppPass {
    static Random rand = new Random();
    static Scanner input = new Scanner(System.in);
    static boolean isCorrect(char[] password, String symbolsArray){
        int count = 0;
        char[] symbols = symbolsArray.toCharArray();
        for(char i : symbols){
            for(char j : password){
                if(i==j) count++;
            }
        }
        if(count > 0) return true;
        else return false;
    }
    static void passwordGenerator(int length){
        String symbols = "abcdefghijklmnopqrstuvwxyz";
        String upperSymbols = symbols.toUpperCase();
        String numbers = "0123456789";
        String special = "!@#$%^&*()_+";
        String allSymbols = symbols + upperSymbols + numbers + special;
        char[] passwordSymbols = allSymbols.toCharArray();
        if(length < 8 || length > 12){
            System.out.print("Неверная длина пароля, попробуйте снова: ");
            length = input.nextInt();
            passwordGenerator(length);
        }
        char[] password = new char[length];
        for(int i = 0; i < length; i++){
            password[i] = passwordSymbols[rand.nextInt(passwordSymbols.length)];
        }
        if(isCorrect(password, symbols) &&  isCorrect(password, upperSymbols) && isCorrect(password, numbers) && isCorrect(password, special)){
            System.out.println(password);
        }else passwordGenerator(length);
    }
    public static void main(String[] args){
        System.out.print("Введите длину пароля (от 8 до 12): ");
        int lengthOfPassword = input.nextInt();
        passwordGenerator(lengthOfPassword);
    }
}
