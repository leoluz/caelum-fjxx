class Fibonacci {

    int calcularFibonacci(int n) {
        return (n == 0 || n == 1) ? n : calcularFibonacci(n-1) + calcularFibonacci(n-2);
    }
}
class FibonacciTest {

    //0 1 1 2 3 5 8 13 21
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        int i = f.calcularFibonacci(8);
        System.out.println(i);
    }
}

class FibonacciArray {

    private int[] fibonacci;
    
    public FibonacciArray(int i) {
        this.fibonacci = new int[i];
    }

    int calcularFibonacci() {
        this.fibonacci[n] = (n == 0 || n == 1) ? n : calcularFibonacci(n-1) + calcularFibonacci(n-2); 
        return this.fibonacci[n];
    }
}
class FibonacciArrayTest {

    public static void main(String[] args) {
        FibonacciArray f = new FibonacciArray(8);
        int i = f.calcularFibonacci(8); 
        System.out.println(i);

        //for (int x : f.fibonacci) {
            //System.out.println(x);
        //}
    }
}
