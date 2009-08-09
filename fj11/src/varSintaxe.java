class printVar1 {
    public static void main (String[] args) {
        for (int i = 150; i <= 300; i++) {
            System.out.println(i);
        }
    }
}

class printVar2 {
    public static void main (String[] args) {
        int soma = 0;
        for (int i = 1; i <= 1000; i++) {
            soma += i;
        }
        System.out.println(soma);
    }
}

class printVar3 {
    public static void main (String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}

class printVar4 {
    public static void main (String[] args) {
        for (double n=1, fatorial=1; n<=40; n++) {
            double i = n;
            while (i > 0) {
                fatorial *= i;
                --i;
            }
            System.out.println("fatorial de " + n + " é " + fatorial);
            fatorial = 1;
        }
    }
}
