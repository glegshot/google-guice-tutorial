package io.googleguice.practice;

import javax.inject.Inject;
import javax.inject.Named;

public class TextEditor {

    private SpellChecker spellChecker;

    private HelloDao helloDao;

    @Inject
    public TextEditor(@Named("OSXWord") SpellChecker spellChecker, HelloDao helloDao){
        this.spellChecker = spellChecker;
        this.helloDao = helloDao;
    }

    public void makeCheck(){
        this.spellChecker.checkSpelling("hello");
    }

    public HelloDao getHelloDao(){
        return this.helloDao;
    }

}
