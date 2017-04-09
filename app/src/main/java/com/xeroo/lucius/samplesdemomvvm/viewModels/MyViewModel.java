package com.xeroo.lucius.samplesdemomvvm.viewModels;

import android.databinding.BaseObservable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.xeroo.lucius.samplesdemomvvm.R;
import com.xeroo.lucius.samplesdemomvvm.models.City;
import com.xeroo.lucius.samplesdemomvvm.models.MyModel;

import java.util.ArrayList;

/**
 * Created by lucius on 09/04/2017.
 */

public class MyViewModel extends BaseObservable {
    private MyModel model;

    public String hello = "Hello There";
    public MyViewModel() {
        this.model = new MyModel();
    }

}
