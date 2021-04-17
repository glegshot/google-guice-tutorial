package io.googleguice.practice;

public class SpellCheckerImpl implements SpellChecker{

    @Override
    public void checkSpelling(String word) {
        System.out.println("checking spelling with "+ SpellCheckerImpl.class.getSimpleName());
    }
}
