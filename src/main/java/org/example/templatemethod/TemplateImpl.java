package org.example.templatemethod;

public class TemplateImpl extends Template{

    @Override
    public void firstStep() {
        //...
    }

    @Override
    public int secondStep() {
        return 2 + 2;
    }

    @Override
    public String thirdStep(int number) {
        return String.valueOf(number);
    }
}
