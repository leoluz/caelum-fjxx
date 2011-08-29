package com.scjptest;

public enum Enum {
    A_VALUE(13),
    ANOTHER_VALUE(666) {
        //overrides toString() Enum method to something more specific
        public String toString() {
            return this.name().substring(8, this.name().length()) + "??";
        }
    },
    YET_ANOTHER_VALUE(7070);

    private int value;

    private Enum(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public String toString() {
        return this.name().toLowerCase();
    }

}

class EnumTest {

    public static void main (String[] args) {
        
        Enum myEnum = Enum.ANOTHER_VALUE;

        System.out.println("---");

        switch (myEnum) {
            case ANOTHER_VALUE: 
                System.out.printf("Case %s: %n%tmyEnum variable toString(): %s value: %d%n", myEnum.name(), myEnum, myEnum.getValue());
                break;
            case A_VALUE:
                System.out.printf("Case %s: myEnum variable toString(): %s value: %d%n", myEnum.name(), myEnum, myEnum.getValue());
                break;
            case YET_ANOTHER_VALUE:
                System.out.printf("Case %s: myEnum variable toString(): %s value: %d%n", myEnum.name(), myEnum, myEnum.getValue());
                break;
            default:
                System.out.println("default");
        }

        for (Enum e : Enum.values()) {
            System.out.printf("Enum value %d is %s%n", e.ordinal(), e);
        }

        System.out.println("valueOf(\"A_VALUE\") is: " + Enum.valueOf("A_VALUE"));
        System.out.println("---");
    }

}
