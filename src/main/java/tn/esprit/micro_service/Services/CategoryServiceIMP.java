package tn.esprit.micro_service.Services;

import org.springframework.stereotype.Service;
import tn.esprit.micro_service.Entities.Category;
import tn.esprit.micro_service.Repository.CategoryRepo;

import java.util.List;
@Service
public class CategoryServiceIMP implements ICategory{
    private CategoryRepo categoryRepo;
    @Override
    public Category createCategory(Category category) {
        return categoryRepo.save(category);
    }

    @Override
    public Category getCategoryById(Long id) {
        return categoryRepo.findById(id).orElse(null);
    }

    @Override
    public List<Category> getAllCategories() {
        return null;
    }

    @Override
    public Category updateCategory(Long id, Category updatedCategory) {
        return null;
    }

    @Override
    public void deleteCategory(Long id) {

    }
}
