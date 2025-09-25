package convertor;
import java.util.Scanner;
public class AppConvertor{
    static Scanner input = new Scanner(System.in);
    static final double usd = 83.74, euro = 98.34, yuan = 11.78, yen = 0.56, tenge = 0.15;
    static void convertTo(int sum){
        System.out.println("Выберите валюту для конвертации: ");
        System.out.print("1: Доллар" + '\n' + "2: Eвро" + '\n' + "3: Юань" + '\n' + "4: Йены" + '\n' + "5: Тенге" +
                 '\n' + "6: К выбору суммы" + '\n' + "7: Выход" + '\n' + "Ввод: ");
        int choise = input.nextInt();
        if(choise < 1 || choise > 7){
            System.out.println("Неверная команда! Попробуйте снова");
            convertTo(sum);
        }
        switch(choise) {
            case 1:
                System.out.print("Сумма после конвертации: ");
                System.out.println(sum / usd);
                convertTo(sum);
                break;
            case 2:
                System.out.print("Сумма после конвертации: ");
                System.out.println(sum / euro);
                convertTo(sum);
                break;
            case 3:
                System.out.print("Сумма после конвертации: ");
                System.out.println(sum / yuan);
                convertTo(sum);
                break;
            case 4:
                System.out.print("Сумма после конвертации: ");
                System.out.println(sum / yen);
                convertTo(sum);
                break;
            case 5:
                System.out.print("Сумма после конвертации: ");
                System.out.println(sum / tenge);
                convertTo(sum);
                break;
            case 6:
                System.out.print("Введите сумму для конвертации: ");
                int sumNew = input.nextInt();
                convertTo(sumNew);
                break;
            case 7: break;
        }
    }
    public static void main(String[] args){
        System.out.print("Введите сумму для конвертации: ");
        int sum = input.nextInt();
        convertTo(sum);
    }
}