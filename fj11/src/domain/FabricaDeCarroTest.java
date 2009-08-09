class FabricaDeCarroTest {

    public static void main (String[] args) {
        FabricaDeCarro f1 = FabricaDeCarro.getInstance();
        FabricaDeCarro f2 = FabricaDeCarro.getInstance();

        if (f1 == f2) {
            System.out.println("f1 e f2 apontam para a mesma referencia do objeto FabricaDeCarro. Singleton detected!!");
        }
    }
}
