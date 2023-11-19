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
    public Category getCategoryById(Long id_category) {

        return categoryRepo.findById(id_category).orElse(null);
    }
    @Override
    public List<Category> getAllCategories() {

        return categoryRepo.findAll();
    }
    @Override
    public Category updateCategory(Long id_category, Category updatedCategory) {
        Category existingCategory=getCategoryById(id_category);
        if (updatedCategory.getCategoryName() != null) {
            existingCategory.setCategoryName(updatedCategory.getCategoryName());
        }
        if (updatedCategory.getDescription() != null) {
            existingCategory.setDescription(updatedCategory.getDescription());
        }
        return categoryRepo.save(existingCategory);
    }
    @Override
    public void deleteCategory(Long id_category) {
        Category existingCategory = getCategoryById(id_category);
        categoryRepo.delete(existingCategory);
    }
}
