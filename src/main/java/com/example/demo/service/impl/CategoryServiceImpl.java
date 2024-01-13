package com.example.demo.service.impl;

import com.example.demo.dto.category.CategoryRequest;
import com.example.demo.dto.category.CategoryResponse;
import com.example.demo.entities.Category;
import com.example.demo.exception.NotFoundException;
import com.example.demo.mapper.CategoryMapper;
import com.example.demo.repositories.CategoryRepository;
import com.example.demo.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;
    @Override
    public CategoryResponse getById(Long id) {
        Optional<Category> category = categoryRepository.findById(id);
        if(category.isEmpty())
            throw new NotFoundException("user not found with id:"+id+"!", HttpStatus.BAD_REQUEST);

        return categoryMapper.toDto(category.get());
    }

    @Override
    public void add(CategoryRequest categoryRequest) {
        Category category = new Category();
        category.setNameCategory(categoryRequest.getNameCategory());
        categoryRepository.save(category);
    }

    @Override
    public void deleteById(Long id) {
        if(categoryRepository.findById(id).isEmpty())
            throw new NotFoundException("user not found with id:"+id+"!", HttpStatus.BAD_REQUEST);
        categoryRepository.deleteById(id);
    }

    @Override
    public void updateById(Long id, CategoryRequest categoryRequest) {
        Optional<Category> category = categoryRepository.findById(id);
        if(category.isEmpty())
            throw new NotFoundException("user not found with id:"+id+"!", HttpStatus.BAD_REQUEST);
        category.get().setNameCategory(categoryRequest.getNameCategory());
        categoryRepository.save(category.get());
    }

    @Override
    public List<CategoryResponse> getAll() {
        return categoryMapper.toDtoS(categoryRepository.findAll());
    }
}
