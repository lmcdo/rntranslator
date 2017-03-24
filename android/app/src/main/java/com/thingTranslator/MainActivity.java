package com.thingTranslator;

import com.facebook.react.ReactActivity;
import com.wmjmc.reactspeech.VoicePackage; 

public class MainActivity extends ReactActivity {

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "thingTranslator";
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
        new MainReactPackage(),
        new VoicePackage()); 
}
