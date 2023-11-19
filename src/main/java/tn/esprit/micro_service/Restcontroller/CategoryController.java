package tn.esprit.micro_service.Restcontroller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.micro_service.Entities.Category;
import tn.esprit.micro_service.Services.ICategory;

import java.util.List;

@RestController
@AllArgsConstructor
public class CategoryController {
    private ICategory iCategory;
    @PostMapping("/createCategory")
    public ResponseEntity<Category> createCategory(@RequestBody Category category) {
        Category createdCategory = iCategory.createCategory(category);
        return new ResponseEntity<>(createdCategory, HttpStatus.CREATED);
    }

    @GetMapping("/getCategoryById/{id_category}")
    public ResponseEntity<Category> getCategoryById(@PathVariable Long id_category) {
        Category category = iCategory.getCategoryById(id_category);
        return new ResponseEntity<>(category, HttpStatus.OK);
    }

    @PutMapping("/deleteCategory/{id_category}")
    public ResponseEntity<Category> deleteCategory(@PathVariable Long id_category, @RequestBody Category updatedCategory) {
        Category updatedEntity = iCategory.updateCategory(id_category, updatedCategory);
        return new ResponseEntity<>(updatedEntity, HttpStatus.OK);
    }

    @DeleteMapping("/deleteCategory/{id_category}")
    public ResponseEntity<Void> deleteCategory(@PathVariable Long id_category) {
        iCategory.deleteCategory(id_category);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping
    public ResponseEntity<List<Category>> getAllCategories() {
        List<Category> categories = iCategory.getAllCategories();
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }
}
