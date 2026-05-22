package com.temple.donation.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.temple.donation.model.Donation;
import com.temple.donation.repository.DonationRepository;

@RestController
@RequestMapping("/donations")
@CrossOrigin(origins = "*")
public class DonationController {

    @Autowired
    private DonationRepository donationRepository;

    @PostMapping("/add")
    public Donation addDonation(@RequestBody Donation donation) {
        donation.setStatus("PENDING");
        return donationRepository.save(donation);
    }

    @GetMapping("/all")
    public List<Donation> getAllDonations() {
        return donationRepository.findAll();
    }

    @GetMapping("/total")
    public Double getTotalAmount() {
        List<Donation> donations = donationRepository.findAll();
        double total = 0;
        for (Donation d : donations) {
            if ("VERIFIED".equals(d.getStatus())) {
                total += d.getAmount();
            }
        }
        return total;
    }

    @PutMapping("/verify/{id}")
    public String verifyDonation(@PathVariable Long id) {
        Optional<Donation> optional = donationRepository.findById(id);
        if (optional.isPresent()) {
            Donation d = optional.get();
            d.setStatus("VERIFIED");
            donationRepository.save(d);
            return "VERIFIED";
        }
        return "NOT_FOUND";
    }

    @PutMapping("/reject/{id}")
    public String rejectDonation(@PathVariable Long id) {
        Optional<Donation> optional = donationRepository.findById(id);
        if (optional.isPresent()) {
            Donation d = optional.get();
            d.setStatus("REJECTED");
            donationRepository.save(d);
            return "REJECTED";
        }
        return "NOT_FOUND";
    }
}