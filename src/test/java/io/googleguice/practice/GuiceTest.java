package io.googleguice.practice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GuiceTest {

    @Test
    public void spellCheckerLinkedBindingsCheckTest(){
        Injector injector = Guice.createInjector(new InjectorModule());
        TextEditor editor = injector.getInstance(TextEditor.class);
        editor.makeCheck();
    }

    @Test
    public void providesCheckForHelloDaoShouldReturnNonNullAndHaveHeyThereValueTest(){
        Injector injector = Guice.createInjector(new InjectorModule());
        TextEditor editor = injector.getInstance(TextEditor.class);
        Assertions.assertNotNull(editor.getHelloDao());
        Assertions.assertEquals("hey there",editor.getHelloDao().hello);
    }


}
