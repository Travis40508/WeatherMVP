package com.example.travistressler.weathermvp.mainview;

import android.os.Bundle;

/**
 * Created by travistressler on 9/8/17.
 */

public interface MainView {
    void toastError(String s);

    void setArgumentsOnFragment(Bundle bundle);

    void transitionToWeatherFragment();

    void removeWeatherFragment();

    void closeApp();
}
