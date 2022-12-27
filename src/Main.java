public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        byte turkmen = 127;
        System.out.println("Значение переменной turkmen с типом byte равно " + turkmen);
        short tajik = 32767;
        System.out.println("Значение переменной tajik с типом short равно " + tajik);
        int iranian = 2147483647;
        System.out.println("Значение переменной iranaian с типом int равно " + iranian);
        long uzbek = 9223372036854775807L;
        System.out.println("Значение переменной uzbek с типом long равно " + uzbek);
        float cossack = 3.400001f;
        System.out.println("Значение переменной cossack с типом float равно " + cossack);
        double jew = 1.7000000000000001;
        System.out.println("Значение переменной jew с типом double равно " + jew);

        System.out.println("Задача 2");
        float a = 27.12f;
        System.out.println("Значение переменной a равно " + a + " - тип переменной float");
        long b = 987678965549L;
        System.out.println("Значение переменной b равно " + b + " - тип переменной long");
        float c = 2.786f;
        System.out.println("Значение переменной c равно " + c + " - тип переменной float");
        short d = 569;
        System.out.println("Значение переменной d равно " + d + " - тип переменной short");
        short e = -159;
        System.out.println("Значение переменной e равно " + e + " - тип переменной short");
        short f = 27897;
        System.out.println("Значение переменной f равно " + f + " - тип переменной short");
        byte k = 67;
        System.out.println("Значение переменной k равно " + k + " - тип переменной byte");


        System.out.println("Задача 3");
        byte stLP = 23;
        byte stAS = 27;
        byte stEA = 30;
        short Paper = 480;
        System.out.println("На каждого ученика рассчитано " + Paper / (stEA + stAS + stLP) + " листов бумаги");



    }
}