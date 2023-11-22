package tn.esprit.micro_service.Restcontroller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.micro_service.Entities.Category;
import tn.esprit.micro_service.Services.CategoryServiceIMP;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("category")
public class CategoryController {
    private CategoryServiceIMP categoryServiceIMP;
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Category> createCategory(@RequestBody Category category) {
        return new ResponseEntity<>(categoryServiceIMP.createCategory(category), HttpStatus.CREATED);
    }

    @GetMapping("/getCategoryById/{id_category}")
    public Category getCategoryById(@PathVariable Long id_category) {
        return categoryServiceIMP.getCategoryById(id_category);
    }

    @PutMapping(value = "/{id_category}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Category> updateCategory(@PathVariable Long id_category, @RequestBody Category updatedCategory) {
        return new ResponseEntity<>(categoryServiceIMP.updateCategory(id_category,updatedCategory), HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id_category}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> deleteCategory(@PathVariable Long id_category) {
        categoryServiceIMP.deleteCategory(id_category);
        return new ResponseEntity<>("Category with ID " + id_category + " deleted successfully",HttpStatus.OK);
    }

    @GetMapping
    public List<Category> getAllCategories() {
        return categoryServiceIMP.getAllCategories();
    }
    }

