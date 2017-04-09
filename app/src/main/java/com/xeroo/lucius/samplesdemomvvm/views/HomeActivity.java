package com.xeroo.lucius.samplesdemomvvm.views;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.xeroo.lucius.samplesdemomvvm.R;
import com.xeroo.lucius.samplesdemomvvm.databinding.ActivityHomeBinding;
import com.xeroo.lucius.samplesdemomvvm.viewModels.MyViewModel;

public class HomeActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private MyViewModel presenter;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityHomeBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_home);
//        setContentView(R.layout.activity_home);

//        listView = (ListView) findViewById(R.id.list_city);
//        listView.setOnItemClickListener(this);
//        presenter = new MyViewModel();
        binding.setViewModel(new MyViewModel());
//        binding.listCity.setAdapter();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
