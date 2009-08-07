class BalancoTrimestral {

    public static void main (String[] args) {
        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;
        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        System.out.println("Gastos Trimestre: "+gastosTrimestre);
    }
}
class ExercicioSimples {
    
    public static void main (String[] args) {

        int i = 10;
        double d = 5;
        char c = 't';
        boolean b = true;

        i += d;
        d = i + .1;
        c = 'y';
        b = false;

        System.out.println("Resultado: " + i + ", " + d + ", " + c + ", " + b);
    }
}
class TesteEscopo {
    
    public static int i = 5;

    public static void main (String[] args) {
        
        if (true) {
            int i = 10;
            System.out.println("i = " + i);
        }
        
        System.out.println("i = " + i);
    }
} 
