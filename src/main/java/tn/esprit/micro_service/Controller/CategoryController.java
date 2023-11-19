package tn.esprit.micro_service.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.micro_service.Services.ICategory;

@RestController
@AllArgsConstructor
public class CategoryController {
    private ICategory iCategory;
}
