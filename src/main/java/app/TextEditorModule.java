package app;

import com.google.inject.AbstractModule;

class TextEditorModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(SpellChecker.class).to(SpellCheckerImpl.class);
    }
}

