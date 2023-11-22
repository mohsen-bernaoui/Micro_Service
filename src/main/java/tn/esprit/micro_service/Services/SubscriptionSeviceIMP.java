package tn.esprit.micro_service.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.micro_service.Entities.ServiceE;
import tn.esprit.micro_service.Entities.Subscription;
import tn.esprit.micro_service.Repository.ServiceRepo;
import tn.esprit.micro_service.Repository.SubscriptionRepo;

import java.util.List;

@Service
public class SubscriptionSeviceIMP implements ISubscription{
    @Autowired
    private SubscriptionRepo subscriptionRepo;
    public Subscription addSubscription(Subscription sub){
        return subscriptionRepo.save(sub);
    }

    public Subscription updateSubscription(long id_sub, Subscription newSub) {

        if (subscriptionRepo.findById(id_sub).isPresent()) {
            Subscription existingSub = subscriptionRepo.findById(id_sub).get();
            existingSub.setType_sub(newSub.getType_sub());
            existingSub.setDateExp_sub(newSub.getDateExp_sub());
            return subscriptionRepo.save(existingSub);
        } else
            return null;
    }
    public String deleteBubscription(long id_sub) {
        if (subscriptionRepo.findById(id_sub).isPresent()) {
            subscriptionRepo.deleteById(id_sub);
            return "Subscription supprimé";
        } else
            return "Subscription non supprimé";
    }
    public List<Subscription> getAllSubscription(){
        return subscriptionRepo.findAll();
    }

    public Subscription getSubscriptionById(Long id_sub) {
        return subscriptionRepo.findById(id_sub).orElse(null);
    }
}
