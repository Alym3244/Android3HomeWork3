package com.example.android3homework3.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.android3homework3.network.model.Hit;
import com.example.android3homework3.repository.PixaBayRepository;

import java.util.List;

public class PixaBayViewModel extends ViewModel {

    public MutableLiveData<List<Hit>> hitMutableLiveData = new MutableLiveData<>();

    PixaBayRepository repository = PixaBayRepository.getInstance();

    public MutableLiveData<List<Hit>> getImages(String word){
        hitMutableLiveData = repository.getImage(word);
        return hitMutableLiveData;
    }
}
