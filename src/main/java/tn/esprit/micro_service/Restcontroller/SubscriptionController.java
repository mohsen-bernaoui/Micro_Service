package tn.esprit.micro_service.Restcontroller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.micro_service.Entities.ServiceE;
import tn.esprit.micro_service.Entities.Subscription;
import tn.esprit.micro_service.Services.ServiceServiceImp;
import tn.esprit.micro_service.Services.SubscriptionSeviceIMP;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/subscription")
public class SubscriptionController {
    @Autowired
    public SubscriptionSeviceIMP subscriptionSeviceIMP;
    @PostMapping(consumes = MediaType.APPLICATION_XML_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Subscription> addSubscription(@RequestBody Subscription sub){
        return new ResponseEntity<>(subscriptionSeviceIMP.addSubscription(sub),HttpStatus.OK);
    }
    @PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Subscription> updateSubscription(@PathVariable(value = "id") long id_sub, @RequestBody Subscription sub){
        return new ResponseEntity<>(subscriptionSeviceIMP.updateSubscription(id_sub,sub),HttpStatus.OK);
    }
    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> deleteBubscription(@PathVariable(value = "id") long id_sub){
        return new ResponseEntity<>(subscriptionSeviceIMP.deleteBubscription(id_sub), HttpStatus.OK);
    }
    @GetMapping("/getAllSubscription")
    public List<Subscription> getAllSubscription(){
        return subscriptionSeviceIMP.getAllSubscription();
    }
    @GetMapping("/getSubscriptionById/{id_sub}")
    public Subscription getSubscriptionById(Long id_sub){
        return subscriptionSeviceIMP.getSubscriptionById(id_sub);
    }


}
