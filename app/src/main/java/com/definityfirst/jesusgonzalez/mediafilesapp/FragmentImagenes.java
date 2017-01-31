package com.definityfirst.jesusgonzalez.mediafilesapp;

/**
 * Created by jesus.gonzalez on 31/01/2017.
 */

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A placeholder fragment containing a simple view.
 */
public class FragmentImagenes extends Fragment {

    public FragmentImagenes() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_imagenes, container, false);
    }
}