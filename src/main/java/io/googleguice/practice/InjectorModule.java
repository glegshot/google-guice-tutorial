package io.googleguice.practice;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import com.google.inject.name.Named;

public class InjectorModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(SpellChecker.class).to(SpellCheckerImpl.class);
        bind(SpellChecker.class).annotatedWith(Names.named("OSXWord")).to(OSXSpellChecker.class);
        bind(SpellChecker.class).annotatedWith(Names.named("WinWord")).to(WinWordSpellChecker.class);
    }
}
