import java.util.Scanner;
import java.lang.reflect.Array;
import java.time.LocalDateTime;

public class Seminar1 {
    public static void main(String[] args) {
        reversePhrase();
    }

    static void helloUser() {
        Scanner sc = new Scanner(System.in);
        int hour = LocalDateTime.now().getHour();

        System.out.println("Input you name her: ");
        String name = sc.nextLine();

        if (hour >= 4 && hour < 11)
            System.out.printf("Доброе утро, %s! \n", name);
        else if (hour >= 11 && hour < 17)
            System.out.printf("Добрый день, %s! \n", name);
        else if (hour >= 17 && hour < 23)
            System.out.printf("Добрый вечер, %s! \n", name);
        else
            System.out.printf("Доброй ночи, %s! \n", name);
        
        sc.close();
    }

    static void quantityOfSame(){
        int[] array = new int[] {1,1,0,1,1,1};
        int maxCount = 0;
        int count = 0;
        for (int item : array) {
            if(item == 1) count++;
            else if(count > maxCount) {
                maxCount = count;
                count = 0; 
            }  
            else count = 0;       
            if(count > maxCount) maxCount = count;   
        }
        System.out.println(maxCount);
    }

    static void magicIndex(){
        int[] nums = new int[] {1,3,2,4,6};
        for (int i = 1; i < nums.length - 1; i++) {
            int leftSum = 0; 
            int rightSum = 0;
            for (int i1 = 0; i1 < i; i1++) {
                leftSum += nums[i1];
            }
            for (int i2 = i + 1; i2 < Array.getLength(nums); i2++) {
                rightSum += nums[i2];
            }
            if(leftSum == rightSum) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }

    static void reversePhrase() {
        Scanner sc = new Scanner(System.in);
        String phrase = "Добро пожаловать на курс по Java ура";
        String[] array = phrase.split(" ");
        String tempStr = "";
        for (int i = 0; i < array.length/2; i++) {
            tempStr = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = tempStr;
        }
        System.out.println(String.join(" ", array));
        sc.close();
    }
}
