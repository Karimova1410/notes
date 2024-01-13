package com.example.demo.service;

import com.example.demo.dto.category.CategoryRequest;
import com.example.demo.dto.category.CategoryResponse;

import java.util.List;

public interface CategoryService {
    CategoryResponse getById(Long id);

    void add(CategoryRequest categoryRequest);

    void deleteById(Long id);

    void updateById(Long id, CategoryRequest categoryRequest);

    List<CategoryResponse> getAll();
}
