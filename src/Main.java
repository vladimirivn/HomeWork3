public class Main {
    public static void main(String[] args) {

        System.out.println("Домашнее задание");

        System.out.println("--------------Задача 1-------------------------");

        byte bVar = 111;
        short shVar = 3333;
        int iVar = 1234567890;
        long lVar = 450000000000L;
        float fVar = 0.234F;
        double dVar = 13.12;
        char chVar = 42;
        boolean isVar = shVar < 5000;
        System.out.println("Значение переменной bVar с типом byte равно: " + bVar);
        System.out.println("Значение переменной shVar с типом short равно: " + shVar);
        System.out.println("Значение переменной iVar с типом int равно: " + iVar);
        System.out.println("Значение переменной lVar с типом long равно: " + lVar);
        System.out.println("Значение переменной fVar с типом float равно: " + fVar);
        System.out.println("Значение переменной dVar с типом double равно: " + dVar);
        System.out.println("Значение переменной chVar с типом char равно: " + chVar);
        System.out.println("Значение переменной isVar с типом boolean равно: " + isVar);

        System.out.println("--------------Задача 2-------------------------");

        float var1 = 27.12F;
        long var2 = 987_678_965_549L;
        double var3 = 2.786;
        boolean var4 = false;
        char var5 = 569;
        short var6 = -159; //
        int var7 = 27897; //
        byte var8 = 67;

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
        byte weightOneBanana = 80; // вес одгого банана в граммах
        int volumeMilk = 200; // объем молока в мл
        byte weightVolumeMilk_100 = 105; // граммов в 100 мл молока
        byte numIceCream = 2; // количество брикетов мороженного
        byte weightOneIceCream = 100; // вес одного брикета мороженного в граммах
        byte numEgg = 4; // количество яиц
        byte weightOneEgg = 70; // вес одного яйца в граммах

        int recipeInGram = numBananas * weightOneBanana + volumeMilk/100 * weightVolumeMilk_100 + numIceCream * weightOneIceCream + numEgg * weightOneEgg;
        System.out.println("Вес спорт-завтрака в граммах - " + recipeInGram);
        System.out.println("Вес спорт-завтрака в килограммах - " + (float) recipeInGram/1000);

        System.out.println("--------------Задача 7-------------------------");

        int loseWeight = 7; // Сбросить всего в кг
        int loseWeightInDay_250 = 250; // план 250 грамм в день
        int loseWeightInDay_500 = 500; // план 500 грамм в день

        int totalDay_250 = loseWeight * 1000 / loseWeightInDay_250; // Всего дней если, норма 250 в день
        int totalDay_500 = loseWeight * 1000 / loseWeightInDay_500; // Всего дней если, норма 500 в день

        int averageDay = (totalDay_500 + totalDay_250) / 2; //

        System.out.println("Всего " + totalDay_250 + " дней если норма " + loseWeightInDay_250 + " грамм в день ");
        System.out.println("Всего " + totalDay_500 + " дней если норма " + loseWeightInDay_500 + " грамм в день ");
        System.out.println("Всего в среднем " + averageDay + " день");

        System.out.println("--------------Задача 8-------------------------");

        int currentSalaryMasha =  67760;  // текущаа ЗП
        int currentSalaryDenis =  83690; // текущаа ЗП
        int currentSalaryKristina =  76230; // текущаа ЗП
        int increaseSalary = 110; // увеличение ЗП на 10%

        int afterIncreaseMasha = (currentSalaryMasha * increaseSalary / 100); // ЗП после повышения
        int afterIncreaseDenis = (currentSalaryDenis * increaseSalary / 100); // ЗП после повышения
        int afterIncreaseKristina = (currentSalaryKristina * increaseSalary /100); // ЗП после повышения

        System.out.println("Маша теперь получает " + afterIncreaseMasha + " рублей. Годовой доход вырос на " + (afterIncreaseMasha-currentSalaryMasha) +" рублей");
        System.out.println("Денис теперь получает " + afterIncreaseDenis + " рублей. Годовой доход вырос на " + (afterIncreaseDenis-currentSalaryDenis) +" рублей");
        System.out.println("Кристина теперь получает " + afterIncreaseKristina + " рублей. Годовой доход вырос на " + (afterIncreaseKristina-currentSalaryKristina) +" рублей");

    }
}