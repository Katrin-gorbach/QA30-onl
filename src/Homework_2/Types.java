// Package - директория в Java
package Homework_2;

public class Types {
    public static void main (String[] args){

        getBasicVariables();
        getArithmeticOperation();
    }

    public  static void getBasicVariables(){
        // Primitive types
        // минимальная единица работы - 1 байт или 8 бит
        // переполнение - когда значение больше своих пределов. значения пойдут по кругу или неопределенное поведение

        // целочисленные
        // byte -> short -> int (default) -> long (l, L) -> float (f, F) -> double (default)
        byte myByte = 124; // при арифметических операций переводится в int
        short myShort = 21345; // при арифметических операций переводится в int
        int myInteger = 2_000_294_000;
        long myLong = -4_985_738_759_985L; //L или l

        // целочисленное, но знак
        //ASCII Table, char показывает символ, но под капотом таблица с числовыми значениями
        char letter = 'G';
        System.out.println("Character: " + letter + " . Integer value: "  + (int) (letter));
        letter = 'g';
        System.out.println("Character: " + letter + " . Integer value: "  + (int) (letter));
        letter = (char) (letter + 10); // приведение типа
        System.out.println("Character: " + letter + " . Integer value: "  + (int) (letter));

        // значения с плавающей точкой
        float myFloat = 45.3457F;
        double myDouble = 45.4571658498;

        //логическое
        // Java true -  истина ; false = ложь . не принимает другие значения (e.g. 1 / 0)
        boolean myBoolean = true;

        //Refernce types - ссылочный
        String string = "My first Homework";
        String myAge = 36 + " is my age"; // String myAge = 36  - так нельзя
        System.out.println(myAge);
    }

    public static void getArithmeticOperation(){
        int myHeight = 171;
        int yourHeight = 90;
        System.out.println("Differences: " + ( myHeight - yourHeight ));

        int days = 366;
        double month = 12;
        double weeks = (double) days / month; // значения типа int и деление будет в int, результат сохранить в double
        System.out.println("Приведения int в double " + weeks);

        // +, num = num + 2; num += 2
        // num = num / val ; num /= val
        // var = var - pixels ; var -= pixels
        // /= , *= , += , -= , %=

    }

    public  static void casting () {
        // Приведение типов
        // 1. Автоматическое. Когда компилятор сам может расширить значения, для этого две или более переменных
        // должны иметь достаточно пространства
        short value = 31_456;
        int intValue = value; //автоматическое приведение, тк значения типа short может свободно уложиться с int
        long myLong = intValue; // автоматическое приведение

        // 2. Принудительное. Сужение от большого к маленькому требует принудительного приведения типов
        double doubleBigValue = 34_568;
        int storeDouble = (int) doubleBigValue;

        // Типы, которые нельзя привести
        // boolean
        // к int. int boleanValue = (int) isAlive;
        // int к String.
        int age = 36;
        //String stringAge = (String)age;

        //Можно
        // from Integer to String
        String stringAge = String.valueOf(age);
        //from String to Integer
        int stringAgeConverted = Integer.parseInt(stringAge);

    }
}