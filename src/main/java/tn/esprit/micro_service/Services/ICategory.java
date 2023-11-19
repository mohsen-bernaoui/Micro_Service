package tn.esprit.micro_service.Services;

import tn.esprit.micro_service.Entities.Category;

import java.util.List;

public interface ICategory {
     Category createCategory(Category category);
     Category getCategoryById(Long id);
     List<Category> getAllCategories();

}
