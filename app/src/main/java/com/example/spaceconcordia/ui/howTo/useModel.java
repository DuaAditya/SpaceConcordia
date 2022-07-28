package com.example.spaceconcordia.ui.howTo;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class useModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public useModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is 'how to use?' fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}