package com.gu.team.workingtimecontrol.ui.fragments;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gu.team.workingtimecontrol.R;
import com.gu.team.workingtimecontrol.databinding.LoginFragmentBinding;
import com.gu.team.workingtimecontrol.viewmodels.LoginViewModel;

public class LoginFragment extends Fragment {

    private LoginViewModel mViewModel;
    private LoginFragmentBinding binding;


    public static LoginFragment newInstance() {
        return new LoginFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.login_fragment, container, false);
        return binding.getRoot();

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(LoginViewModel.class);
        buttonsBinding();

    }

    private void buttonsBinding(){
        binding.enterButton.setOnClickListener(view ->
                Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_timeControlFragment));

        binding.regButton.setOnClickListener(view ->
                Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_registrationFragment));
    }

}
