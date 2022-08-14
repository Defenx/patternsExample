package org.example.templatemethod;

public abstract class Template {

    public void doWork() {
        firstStep();
        //
        int result = secondStep();
        //
        System.out.println(thirdStep(result));
    }

    public abstract void firstStep();

    public int secondStep() {
        return 2;
    }


    public String thirdStep(int number) {
        return "valera";
    }

    ;

}
