import java.util.Random;

public class MyRay {
    int[] ar = new int[1];

    public void create(int a, int b){
        Random rnd = new Random(10);
        int[] arr = new int[a];

        for(int i = 0; i<arr.length; i++ ) arr[i] = rnd.nextInt(b);

        ar = arr;
    }
    public int[] copy(int [] a){
        int[] b = new int[a.length];
        for(int i = 0; i < a.length; i++) b[i] = a[i];
        return b;
    }

    public void colv(int[] b){
        System.out.println("Size of array - " + b.length);
    }

    public void add(int a){

        int[] arr = new int[ar.length+1];
        for(int i = 0; i < ar.length; i++){
            arr[i] = ar[i];
        }

        arr[ar.length] = a;
        ar = arr;

    }

    public void add(int a, int n){
        int[] arr = new int[ar.length+1];
        for(int i = 0; i < arr.length; i++) {
            if(i > n) arr[i] = ar[i-1];
            else if(i == n) arr[i] = a;
                else arr[i] = ar[i];

        }
        ar= arr;
    }

    public void delete(int a){
        int[] arr = new int[ar.length-1];
        for(int i = 0; i < arr.length; i++ ){
            if(i == a-1 || i > a-1){
                arr[i] = ar[i+1];
            }else{
                arr[i] = ar[i];
            }
        }
        ar = arr;
    }

    public void thrw(int n){
        System.out.println("In that position " + n + " that number " + ar[n] );
    }

    public void min(){
        int min = ar[0];
        for(int i = 0; i < ar.length; i++){
            if(ar[i] < min){
                min = ar[i];
            }
        }
        System.out.println("Minimum is " + min);
    }

    public void max(){
        int max = ar[0];
        for(int i = 0; i < ar.length; i++){
            if(ar[i] > max){
                max = ar[i];
            }
        }
        System.out.println("Maximum is " + max);
    }

    public void spisok(){
        for (int j : ar) System.out.println(j);

    }



}
