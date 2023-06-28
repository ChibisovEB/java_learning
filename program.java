import javax.sound.midi.SysexMessage;

/**
 * program
 */
public class program {

    public static void main(String[] args) {
        var a = 123;
        var b = 34_555_123.7867;
        System.out.printf("%s %s\n",a, getType(a));
        System.out.printf("%s %s\n",b, getType(b));
        // или так 
        String n = String.format("%s %s\n",b, getType(b));

        //для поиска максимально возможного числа для определнного типа
        // нужно использовать типы-обертки
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.SIZE);

        //обращение к конктерному символу в строке
        String s = "123456789900987654321";
        System.out.println(s.charAt(2));

        //забавная задачка. чему будет равнять переменная a?
        a = 123;
        // a = a-- - --a;
        // System.out.println(a);
        a = --a - a--;
        System.out.println(a);
   
        System.out.println("=========================================");
/// а теперь массивы
        int[] arr = new int[10];
        // или так 
        //int[] arr = new int[] {1,2,3,4,5,6,7,8,9,0};
        arr[3] = 123;
        System.out.println(arr[3]);

        //двумерный массив
        int[][] brr = new int[3][5];
    
// преобразования
        // неявное
        int i =123; double d = i;
        // явное 
        b = Byte.parseByte("123");

// тернатрый оператор
        int xa = 1;
        int xb = 2;
        int min = xa < xb ? xa : xb;

// оператор выбора switch
        String text;
        Integer mounth = 1;
        switch (mounth){
            case 1:
                text = "Январь";
                break;
            case 2:
                text = "Февраль";
                break;
            default:
                text = "месяц";
                break;
        }

// цикл перебор for in 
        int[] qrr = new int[] {1,2,3,4,5,6,7,8,9};
        for (int item : qrr){
            System.out.println(item);
        }
        // или так
        for (int j = 0; j < qrr.length; j++) {
            System.out.print(qrr[j]+ " ");
        }
    }
static String getType(Object o) {
    return o.getClass().getSimpleName();
}
}