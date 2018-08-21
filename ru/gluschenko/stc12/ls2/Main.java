package ru.gluschenko.stc12.ls2;

public class Main {
    /***
     * Код для теста класса MathBox
     * @param args
     */

    public static void main(String[] args){
        MathBox mathBox = new MathBox();

        System.out.println("mathBox.summa:");
        System.out.println("(1,2) must be 3: "+mathBox.summa(1,2));
        System.out.println("(null,null) must be 0: "+mathBox.summa(null,null));
        System.out.println("(1,null) must be 0: "+mathBox.summa(1,null));
        System.out.println("(null,2) must be 0: "+mathBox.summa(null,2));

        System.out.println("------------------------");
        System.out.println("mathBox.diff:");
        System.out.println("(1,2) must be -1: "+mathBox.diff(1,2));
        System.out.println("(null,null) must be 0: "+mathBox.diff(null,null));
        System.out.println("(1,null) must be 0: "+mathBox.diff(1,null));
        System.out.println("(null,2) must be 0: "+mathBox.diff(null,2));

        System.out.println("------------------------");
        System.out.println("mathBox.factorial:");
        System.out.println("(null) must be 0: "+mathBox.factorial(null));
        try {
            System.out.println("(7) must be 5040: " + mathBox.factorial(7));
        } catch(OutOfMemoryError e){
            System.out.println("(7) must be 5040, but OutOfMemoryError :(");
        } catch(StackOverflowError e){
            System.out.println("(7) must be 5040, but StackOverflowError :(");
        } catch(Exception e){
            System.out.println("(7) must be 5040, but some Exception catched :(");
        }

        System.out.println("------------------------");
        System.out.println("mathBox.dividerExceptionInside:");
        System.out.println("(1, 2) must be 0.5: "+mathBox.dividerExceptionInside(1,2));
        System.out.println("(null, 2) must be 0.0: " + mathBox.dividerExceptionInside(null, 2));
        System.out.println("(1, null) must be 0.0: " + mathBox.dividerExceptionInside(1, null));
        System.out.println("(1, 0) must be 0.0: " + mathBox.dividerExceptionInside(1, 0));
        System.out.println("(0, 2) must be 0.0: " + mathBox.dividerExceptionInside(0, 2));

        System.out.println("------------------------");
        System.out.println("mathBox.divider:");
        try {
            System.out.println("(1, 2) must be 0.5: " + mathBox.divider(1, 2));
            System.out.println("(1, 0) must be Infinity: " + mathBox.divider(1, 0));
            System.out.println("(1, null) must be Exception: " + mathBox.divider(1, null));
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("------------------------");
        System.out.println("mathBox.divider2:");
        try {
            System.out.println("(1, 2) must be 0.5: " + mathBox.divider2(1, 2));
            System.out.println("(1, 0) must be Infinity: " + mathBox.divider2(1, 0));
            System.out.println("(1, null) must be Exception: " + mathBox.divider2(1, null));
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
