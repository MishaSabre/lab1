import static java.lang.System.currentTimeMillis;

public class MyRaychik extends MyRay{
    public void check(int a){

        boolean nashel = false;

        for(int i = 0; i<ar.length;i++) {
            if (ar[i] == a) nashel = true;
        }
        if(nashel) System.out.println("Данное число есть в массиве");
        else System.out.println("Данного числа нет в массиве");
    }

    public int[] sortA(int[] a){
        boolean sorted = false;
        int buf = 0;
        while (!sorted){
            for(int i = 0; i < a.length-1; i++){
                sorted = true;
                for(int j = 0; j < a.length-1; j++) {
                    if (a[j] > a[j + 1]) {
                        buf = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = buf;
                        sorted = false;
                    }
                }
            }
        }

        return a;
    }

    public int[] sortB(int[] a){
        boolean sorted = false;
        int buf;
        final double factor = 1.247;
        double gapFactor = ( a.length/factor);
        while (!sorted){
            sorted = true;
            int gap = (int) Math.round(gapFactor);
            for(int i = 0; i < a.length-1; i++){
                for(int j = 0; j < a.length-1; j++) {
                    if (a[j] > a[j + 1]) {
                        buf = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = buf;
                        sorted = false;
                    }
                }
            }
            gapFactor = ( gapFactor / factor);

        }


        return a;
    }

    public static int[] del(int[] a){
        if(a.length == 0) return new int[]{};
        int count = 1;
        int[] arr;

        for(int i = 1; i< a.length;i++){
            if (!(a[i] == a[i-1])) count++;
        }
        arr = new int[count];
        arr[0] = a[0];
        for (int i = 1, j = 1; i < a.length; i++){
            if (!(a[i] == a[i-1])){
                arr[j] = a[i];
                j++;
            }
        }

        return arr;
    }

    public void sravn(){
        int before = (int) currentTimeMillis();
        int[]a = copy(ar);
        sortA(a);
        int after = (int) currentTimeMillis();
        int razn = after - before;
        System.out.println("Сортировка пузырьком заняла столько времени" + razn + "\n");
        before = (int) currentTimeMillis();
        a = copy(ar);
        sortB(a);
        after = (int) currentTimeMillis();
        razn = after - before;
        System.out.println("Сортировка расческой заняла столько времени" + razn + "\n");
    }
}
