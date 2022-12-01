public class Main {
    public static void main(String[] args) {

        System.out.println("Домашнее задание");

        System.out.println("--------------Задача 1-------------------------");

        byte bVar = 111;
        short shVar = 3333;
        int iVar = 1234567890;
        long lVar = 45L;
        float fVar = 0.234f;
        double dVar = 13.12;
        char chVar = 42;
        boolean isVar = shVar < 5000;
        System.out.println("Значение переменной bVar с типом byte равно: " + bVar);
        System.out.println("Значение переменной shVar с типом byte равно: " + shVar);
        System.out.println("Значение переменной iVar с типом byte равно: " + iVar);
        System.out.println("Значение переменной lVar с типом byte равно: " + lVar);
        System.out.println("Значение переменной fVar с типом byte равно: " + fVar);
        System.out.println("Значение переменной dVar с типом byte равно: " + dVar);
        System.out.println("Значение переменной chVar с типом byte равно: " + chVar);
        System.out.println("Значение переменной isVar с типом byte равно: " + isVar);

        System.out.println("--------------Задача 2-------------------------");

        double d;
        float d1;
        long l;
        byte b;
        short s, s1;
        boolean bool;
        int i, i1;

        d = 27.12;
        l = 987678965549L;
        b = 2;
        s = 786; // Можно объявить и как int
        bool = false;
        s1 = 569; // Можно объявить и как int
        i = -159; // Можно объявить и как short
        i1 = 27897; // Можно объявить и как short
        d1 = 67.f;

        System.out.println("--------------Задача 3-------------------------");

        byte firstClassroom = 23;
        byte secondClassroom = 27;
        byte thirdClassroom = 30;
        short totalPapers = 480;
        int papersPerStudent = totalPapers / (firstClassroom + secondClassroom + thirdClassroom);
        System.out.println("На каждого ученика рассчитано " + papersPerStudent + " листов бумаги");

        System.out.println("--------------Задача 4-------------------------");

        int twoMinutes = 16; // продуктивность за 2 минуты
        int perMinute = twoMinutes / 2 ; // продуктивность в минуту
        int perTwentyMinutes = perMinute * 20; // продуктивность за 20 минут
        int perHour = perMinute * 60; // продуктивность в час
        int perDay = perHour * 24;  // продуктивность в сутки
        int perThreeDays = perDay * 3; // продуктивность за 3 дня
        int perMonth = perDay * 30; // будем считать, что 30 дней в месяце

        System.out.println("За 2 минуты машина произвела бутылок " + twoMinutes + " штук");
        System.out.println("За 20 минут машина произвела бутылок " + perTwentyMinutes + " штук");
        System.out.println("За сутки машина произвела бутылок " + perDay + " штук");
        System.out.println("За 3 дня машина произвела бутылок " + perThreeDays + " штук");
        System.out.println("За месяц машина произвела бутылок " + perMonth + " штук");

        System.out.println("--------------Задача 5-------------------------");

        int totalCansPaint = 120;
        int perClassWhite = 2;
        int perClassBrown = 4;
        int totalClass = totalCansPaint/(perClassBrown+perClassWhite); // всего классов
        int totalWhite = totalClass * perClassWhite; // всего белой
        int totalBrown = totalClass * perClassBrown; // всего коричневой

        System.out.println("В школе, где "+ totalClass + " классов, нужно "+totalWhite
                + " банок белой краски и "+totalBrown + " банок коричневой краски");

        System.out.println("--------------Задача 6-------------------------");

        byte numBananas = 5;  // количество бананов
        byte weightOneBananа = 80; // вес одгого банана в граммах
        int volumeMilk = 200; // объем молока в мл
        byte weightVolumeMilk_100 = 105; // граммов в 100 мл молока
        byte numIceCream = 2; // количество брикетов мороженного
        byte weightOneIceCream = 100; // вес одного брикета мороженного в граммах
        byte numEgg = 4; // количество яиц
        byte weightOneEgg = 70; // вес одного яйца в граммах

        int recipeInGram = numBananas * weightOneBananа + volumeMilk/100 * weightVolumeMilk_100 + numIceCream * weightOneIceCream + numEgg * weightOneEgg;
        System.out.println("Вес спорт-завтрака в граммах - " + recipeInGram);
        System.out.println("Вес спорт-завтрака в килограммах - " + (double) recipeInGram/1000);
    }
}