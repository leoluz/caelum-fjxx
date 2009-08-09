package domain;

class FabricaDeCarro {
    
    private static FabricaDeCarro instance;

    private FabricaDeCarro() {
    }

    public static FabricaDeCarro getInstance() {
        if (instance == null) {
            instance = new FabricaDeCarro();
        }
        return instance;
    }
}
