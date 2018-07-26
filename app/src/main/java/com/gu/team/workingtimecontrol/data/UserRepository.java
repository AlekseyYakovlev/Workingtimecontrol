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

    private UserRepository() {
        setCurrentUser(testUser());
    }



    public LiveData<User> getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User user) {
        currentUser.postValue(user);
    }

    public String getPasswordByLogin(String login) {
        return testUser().getPassword();
    }

    public User getUserByLogin(String login) {
        return testUser();
    }

    private User testUser() {
        return new User("Ivan", "Ivanov", "Ivanovich", "Ivan_Ivanov", "password", 12345, "CEO", "Administration", true);
    }

    public void saveUser(User user) {

    }


}
