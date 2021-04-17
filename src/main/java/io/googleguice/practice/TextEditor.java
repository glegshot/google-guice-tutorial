package io.googleguice.practice;

import javax.inject.Inject;
import javax.inject.Named;

public class TextEditor {

    private SpellChecker spellChecker;

    @Inject
    public TextEditor(@Named("OSXWord") SpellChecker spellChecker){
        this.spellChecker = spellChecker;
    }

    public void makeCheck(){
        this.spellChecker.checkSpelling("hello");
    }



}
