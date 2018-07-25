package com.gu.team.workingtimecontrol.ui;

import androidx.lifecycle.ViewModelProviders;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.os.Bundle;

import com.gu.team.workingtimecontrol.viewmodels.MainViewModel;
import com.gu.team.workingtimecontrol.R;

public class MainActivity extends AppCompatActivity {

    NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navController = Navigation.findNavController(this, R.id.nav_host_fragment);

        MainViewModel model = ViewModelProviders.of(this).get(MainViewModel.class);
    }
}
