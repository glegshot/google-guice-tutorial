package io.googleguice.practice;

public class WinWordSpellChecker implements SpellChecker {
    @Override
    public void checkSpelling(String word) {
        System.out.println("checking spelling with "+WinWordSpellChecker.class.getSimpleName());
    }
}
