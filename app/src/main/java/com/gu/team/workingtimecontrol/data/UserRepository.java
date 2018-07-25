package com.gu.team.workingtimecontrol.data;

import com.gu.team.workingtimecontrol.common.User;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class UserRepository {
    private static final UserRepository ourInstance = new UserRepository();
    private MutableLiveData<User> currentUser = new MutableLiveData<>();


    public static UserRepository getInstance() {
        return ourInstance;
    }

    public UserRepository() {
        setCurrentUser(testUser());
    }



    public LiveData<User> getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User user) {
        currentUser.postValue(user);
    }


    private User testUser(){
        return new User("Ivan", "Ivanov", "Ivanovich", "Ivan_Ivanov", "password", 12345, "CEO", "Administration", true);
    }
 }
