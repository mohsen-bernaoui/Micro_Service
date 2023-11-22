package tn.esprit.micro_service.Restcontroller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.micro_service.Entities.Review;
import tn.esprit.micro_service.Services.IReview;
import tn.esprit.micro_service.Services.ReviewServiceIMP;

@RestController
@AllArgsConstructor
public class ReviewController {

    public IReview iReview;

    @PostMapping("/addReview")
    public Review addReview(@RequestBody Review review) {
        return iReview.addReview(review);
    }

}
