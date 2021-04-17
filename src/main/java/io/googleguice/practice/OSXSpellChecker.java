package io.googleguice.practice;

public class OSXSpellChecker implements SpellChecker{
    @Override
    public void checkSpelling(String word) {
        System.out.println("Checking spelling with "+OSXSpellChecker.class.getSimpleName());
    }
}
