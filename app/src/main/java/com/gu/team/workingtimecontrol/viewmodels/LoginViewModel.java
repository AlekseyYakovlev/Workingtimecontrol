package com.gu.team.workingtimecontrol.viewmodels;

import android.view.View;

import com.gu.team.workingtimecontrol.R;
import com.gu.team.workingtimecontrol.common.User;
import com.gu.team.workingtimecontrol.data.UserRepository;

import androidx.lifecycle.ViewModel;
import androidx.navigation.Navigation;

public class LoginViewModel extends ViewModel {

    public String login;
    public String password;
    public int pinCode;
    private UserRepository userRepository = UserRepository.getInstance();

    public void enterButtonClicked(View view) {
        if (isPasswordCorrect()) {
            User user = userRepository.getUserByLogin(login);
            userRepository.setCurrentUser(user);
            Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_timeControlFragment);
        } else
            showErrorMessage(view);
    }

    public void registerButtonClicked(View view) {
        Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_registrationFragment);
    }

    private boolean isPasswordCorrect() {
        //TODO Написаль логику проверки пароля
        return true;
    }

    private void showErrorMessage(View view) {
        //TODO Написаль показ сообщения об ошибке
    }

}
