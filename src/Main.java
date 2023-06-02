public class Main {


    //Получилось как-то так, пытался играться с кол-ом итераций,
    //но что-то не особо меняется, или уже не пузырёк получается
    public static void sortBubble(int[] mas) {
        int a;
        for(int i = mas.length-1; i >= 1; i--) {
            for(int j = 0; j < i; j++) {
                if(mas[j] > mas[j+1]) {
                    a = mas[j];
                    mas[j] = mas[j+1];
                    mas[j+1] = a;
                }
            }
        }
    }


    //Не знал надо ли делать функцию регистронезависимой, но сделал
    public static int countChar(String str, char search ) {
        int count = 0;
        str = str.toLowerCase();
        search = Character.toLowerCase(search);
        char [] mas = str.toCharArray();
        for (char c : mas) {
            if (c == search) {
                count++;
            }
        }
        return  count;
    }

    public static double searchMedian(int [] mas) {
        double med;
        int l = mas.length;
        if(l % 2 == 0) {
            int midI = l/2;
            med = (mas[midI-1]+mas[midI])/2.0;
        }else {
            med = mas[(l/2)];
        }
        return med;
    }



    public static void main(String[] args) {
        int [] mas = new int[]{16, 31, 4, 5, 86, 24, 13, 8};
        char c = 'Е';
        String s = "Локаторы (locators) в автоматизации тестирования веб-приложений - это специальные селекторы или идентификаторы, которые используются для точного нахождения и взаимодействия с элементами на веб-странице. Локаторы позволяют автоматически находить элементы, взаимодействовать с ними и проверять их состояние.";
        sortBubble(mas);
        for (int i : mas) {
            System.out.println(i);
        }
        System.out.println("Медиана массива: " + searchMedian(mas));

        System.out.println("Символ " + c + " встречается: " + countChar(s, c) + " раз");

    }
}