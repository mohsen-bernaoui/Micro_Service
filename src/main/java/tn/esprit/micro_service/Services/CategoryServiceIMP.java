package tn.esprit.micro_service.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.micro_service.Entities.Category;
import tn.esprit.micro_service.Repository.CategoryRepo;

import java.util.List;
@Service
@AllArgsConstructor
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

        return categoryRepo.findAll();
    }

    @Override
    public Category updateCategory(Long id, Category updatedCategory) {
        Category existingCategory=getCategoryById(id);
        if (updatedCategory.getCategoryName() != null) {
            existingCategory.setCategoryName(updatedCategory.getCategoryName());
        }
        if (updatedCategory.getDescription() != null) {
            existingCategory.setDescription(updatedCategory.getDescription());
        }
        return categoryRepo.save(existingCategory);
    }

    @Override
    public void deleteCategory(Long id) {
        Category existingCategory = getCategoryById(id);
        categoryRepo.delete(existingCategory);
    }
}
