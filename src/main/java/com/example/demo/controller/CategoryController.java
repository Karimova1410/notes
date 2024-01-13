package com.example.demo.controller;

import com.example.demo.dto.category.CategoryRequest;
import com.example.demo.dto.category.CategoryResponse;
import com.example.demo.repositories.CategoryRepository;
import com.example.demo.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/category")
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping("/{id}")
    public CategoryResponse getCategory(@PathVariable Long id){
        return categoryService.getById(id);
    }

    @PostMapping("/add")
    public void addCategory(@RequestBody CategoryRequest categoryRequest){
        categoryService.add(categoryRequest);
    }
    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Long id){
        categoryService.deleteById(id);
    }

    @PutMapping("/update/{id}")
    public void updateById(@PathVariable Long id, @RequestBody CategoryRequest categoryRequest){
        categoryService.updateById(id, categoryRequest);
    }
    @GetMapping("/getAll")
    public List<CategoryResponse> getAll(){
        return categoryService.getAll();
    }
}
