package io.googleguice.practice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.jupiter.api.Test;

public class GuiceTest {

    @Test
    public void spellCheckerLinkedBindingsCheck(){
        Injector injector = Guice.createInjector(new InjectorModule());
        TextEditor editor = injector.getInstance(TextEditor.class);
        editor.makeCheck();
    }

}
