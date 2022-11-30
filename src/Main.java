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
    }
}