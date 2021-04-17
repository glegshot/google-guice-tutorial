package io.googleguice.practice;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Names;

public class InjectorModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(SpellChecker.class).to(SpellCheckerImpl.class);
        bind(SpellChecker.class).annotatedWith(Names.named("OSXWord")).to(OSXSpellChecker.class);
        bind(SpellChecker.class).annotatedWith(Names.named("WinWord")).to(WinWordSpellChecker.class);
    }

    @Provides
    public HelloDao getHelloDao(){
        return new HelloDao("hey there");
    }

}
