package com.example.android3homework3.ui.fragments;


import com.example.android3homework3.base.BaseFrafment;
import com.example.englishcard.databinding.FragmentCategoryBinding;

public class CategoryFragment extends BaseFrafment<FragmentCategoryBinding> {


    @Override
    public FragmentCategoryBinding bind() {
        return FragmentCategoryBinding.inflate(getLayoutInflater());
    }
}