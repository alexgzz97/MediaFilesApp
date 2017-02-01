package com.definityfirst.jesusgonzalez.mediafilesapp;

/**
 * Created by jesus.gonzalez on 31/01/2017.
 */

import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.os.Handler;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;


import java.io.File;
import java.util.ArrayList;


public class FragmentImagenes extends Fragment {
    AsyncTaskLoadFiles myAsyncTaskLoadFiles;
    GridView gridview;
    ImageAdapter myImageAdapter;

    public FragmentImagenes() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_imagenes, container, false);


    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        myImageAdapter = new ImageAdapter(getActivity());
        gridview = (GridView) getActivity().findViewById(R.id.gridView);
        gridview.setAdapter(myImageAdapter);
        setGridView();
        super.onActivityCreated(savedInstanceState);
    }

    public void setGridView() {
        myAsyncTaskLoadFiles = new AsyncTaskLoadFiles(myImageAdapter);
        myAsyncTaskLoadFiles.execute();
    }

}
