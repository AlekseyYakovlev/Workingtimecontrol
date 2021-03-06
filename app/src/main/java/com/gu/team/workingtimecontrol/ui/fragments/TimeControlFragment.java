package com.gu.team.workingtimecontrol.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gu.team.workingtimecontrol.R;
import com.gu.team.workingtimecontrol.databinding.TimeControlFragmentBinding;
import com.gu.team.workingtimecontrol.viewmodels.TimeControlViewModel;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

public class TimeControlFragment extends Fragment {

    private TimeControlViewModel mViewModel;
    private TimeControlFragmentBinding binding;


    public static TimeControlFragment newInstance() {
        return new TimeControlFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.time_control_fragment, container, false);
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(TimeControlViewModel.class);
        binding.setModel(mViewModel);
    }
}
