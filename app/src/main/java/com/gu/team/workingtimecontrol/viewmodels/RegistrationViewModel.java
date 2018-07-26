package com.gu.team.workingtimecontrol.viewmodels;

import android.view.View;

import com.gu.team.workingtimecontrol.R;
import com.gu.team.workingtimecontrol.common.User;
import com.gu.team.workingtimecontrol.data.UserRepository;

import androidx.lifecycle.ViewModel;
import androidx.navigation.Navigation;

public class RegistrationViewModel extends ViewModel {

    public String first_name = ""; //Можно не плодить строчные переменные, а напрямую сетить поля объекту user
    public User user = new User();

    private UserRepository userRepository = UserRepository.getInstance();

    public void save(View view) {
        User user = userRepository.getCurrentUser().getValue();
        user.setFirstName(first_name);
        userRepository.setCurrentUser(user);

        Navigation.findNavController(view).navigate(R.id.action_registrationFragment_to_timeControlFragment);
    }
}
