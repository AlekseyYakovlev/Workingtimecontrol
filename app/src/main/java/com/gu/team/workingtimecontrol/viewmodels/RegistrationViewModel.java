package com.gu.team.workingtimecontrol.viewmodels;

import android.view.View;

import com.gu.team.workingtimecontrol.R;
import com.gu.team.workingtimecontrol.common.User;
import com.gu.team.workingtimecontrol.data.UserRepository;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.navigation.Navigation;

public class RegistrationViewModel extends ViewModel {

    public MutableLiveData<String> first_name = new MutableLiveData<>();
    private UserRepository userRepository = UserRepository.getInstance();

    public void save(View view) {
        User user = userRepository.getCurrentUser().getValue();
        user.setFirstName(first_name.getValue());
        userRepository.setCurrentUser(user);

        Navigation.findNavController(view).navigate(R.id.action_registrationFragment_to_timeControlFragment);
    }
}
