import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyRaychik mr = new MyRaychik();
        boolean check = true;
        boolean durak = false;
        Scanner scan = new Scanner(System.in);
        while(check){
            System.out.println("Что вы хотите сделать?"
                    +"\n1.Создать массив"
                    +"\n2.Вывести количество эллементов"
                    +"\n3.Добавить эллемент"
                    +"\n4.Удалить эллемент по определенному индексу"
                    +"\n5.Вывести эллемент по индексу"
                    +"\n6.Добавить эллемент по определенному индексу"
                    +"\n7.Найти минимальное значение"
                    +"\n8.Найти максимальное значение"
                    +"\n9.Вывести весь массив"
                    +"\n10.Проверить наличие эллемента в массиве"
                    +"\n11.Отсортировать массив методом пузырька"
                    +"\n12.Сортировка расческой"
                    +"\n13.Сравнить скорость сортировки"
                    +"\n14.Выход");
            int est = scan.nextInt();
            int est1;
            switch (est) {
                case 1:
                    System.out.println("Введите размер массива");
                    est = scan.nextInt();
                    System.out.println("Введите верхнюю границу рандомных чисел");
                    est1 = scan.nextInt();
                    mr.create(est, est1);
                    durak = true;

                    break;
                case 2:
                    if (!durak){
                        System.out.println("Вы не создали массив");
                    }
                    else mr.colv(mr.ar);

                    break;
                case 3:if (!durak){
                    System.out.println("Вы не создали массив");
                }
                else {
                    System.out.println("Введите эллемент");

                    est = scan.nextInt();

                    mr.add(est);
                }
                    break;
                case 4:
                    if (!durak){
                        System.out.println("Вы не создали массив");
                    }
                    else {
                        System.out.println("Введите индекс эллемента, который хотите удалить");

                        est = scan.nextInt();

                        if (est > mr.ar.length || est == mr.ar.length || est < 0)
                            System.out.println("Число должно быть не больше длинны массивы и не меньше нуля!");

                        else mr.delete(est);
                    }
                    break;
                case 5:
                    if (!durak){
                        System.out.println("Вы не создали массив");
                    }
                    else {
                        System.out.println("Введите индекс эллемента, который хотите вывести");

                        est = scan.nextInt();

                        if (est > mr.ar.length || est < 0) System.out.println("Число должно быть не больше длинны массивы и не меньше нуля!");

                        else mr.thrw(est);
                    }
                    break;
                case 6:
                    if (!durak){
                        System.out.println("Вы не создали массив");
                    }
                    else {
                        System.out.println("Введите эллемент");

                        est = scan.nextInt();

                        System.out.println("Введите индекс");

                        est1 = scan.nextInt();

                        if (est1 > mr.ar.length || est1 < 0)
                            System.out.println("Число должно быть не больше длинны массивы и не меньше нуля!");

                        mr.add(est, est1);
                    }
                    break;
                case 7:
                    if (!durak){
                    System.out.println("Вы не создали массив");
                }
                else mr.min();

                    break;
                case 8:
                    if (!durak){
                        System.out.println("Вы не создали массив");
                    }
                    else mr.max();

                    break;
                case 9:
                    if (!durak){
                        System.out.println("Вы не создали массив");
                    }
                    else mr.spisok();

                    break;
                case 10:
                    if (!durak){
                        System.out.println("Вы не создали массив");
                    }
                    else {
                        System.out.println("Введите число");
                        est = scan.nextInt();
                        mr.check(est);
                    }
                        break;
                case 11:
                    if (!durak){
                        System.out.println("Вы не создали массив");
                    }
                    else {
                        mr.ar = mr.sortA(mr.ar);
                        mr.ar = MyRaychik.del(mr.ar);
                    }
                    break;

                case 12:
                    if (!durak){
                        System.out.println("Вы не создали массив");
                    }else{
                        mr.ar = mr.sortB(mr.ar);
                        mr.ar = MyRaychik.del(mr.ar);
                    }
                    break;
                case 13:
                    if (!durak){
                        System.out.println("Вы не создали массив");
                    }else mr.sravn();
                    break;
                case 14:

                    check = false;

                    break;
            }
        }
    }
}
