package com.gu.team.workingtimecontrol.viewmodels;

import com.gu.team.workingtimecontrol.common.User;
import com.gu.team.workingtimecontrol.data.UserRepository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

public class TimeControlViewModel extends ViewModel {

    private UserRepository userRepository = UserRepository.getInstance();
    public LiveData<User> currentUser = userRepository.getCurrentUser();


}
