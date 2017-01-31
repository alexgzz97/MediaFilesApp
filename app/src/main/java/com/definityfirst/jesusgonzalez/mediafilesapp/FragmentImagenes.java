package com.definityfirst.jesusgonzalez.mediafilesapp;

/**
 * Created by jesus.gonzalez on 31/01/2017.
 */

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;

/**
 * A placeholder fragment containing a simple view.
 */
public class FragmentImagenes extends Fragment {
    GridView grid;
    String narrowTopic;

    public FragmentImagenes() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_imagenes, container, false);
        grid = (GridView) rootView.findViewById(R.id.grid_imagenes);


        String[] letters = new String[]{"A", "B", "C", "D", "E",
                "F", "G", "H", "I", "J",
                "K", "L", "M", "N", "O",
                "P", "Q", "R", "S", "T",
                "U", "V", "W", "X", "Y", "Z"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, letters);
        grid.setAdapter(adapter);

        return rootView;

    }
}