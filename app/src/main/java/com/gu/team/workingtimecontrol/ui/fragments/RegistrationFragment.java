package com.gu.team.workingtimecontrol.ui.fragments;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gu.team.workingtimecontrol.R;
import com.gu.team.workingtimecontrol.databinding.RegistrationFragmentBinding;
import com.gu.team.workingtimecontrol.viewmodels.RegistrationViewModel;

public class RegistrationFragment extends Fragment {

    private RegistrationViewModel mViewModel;
    private RegistrationFragmentBinding binding;


    public static RegistrationFragment newInstance() {
        return new RegistrationFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        binding = DataBindingUtil.inflate(inflater, R.layout.registration_fragment, container, false);
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(RegistrationViewModel.class);
        binding.setModel(mViewModel);
    }

}
