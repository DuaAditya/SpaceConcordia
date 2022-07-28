package com.example.spaceconcordia.ui.contactFragment;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class contactModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public contactModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is 'contact us' fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}