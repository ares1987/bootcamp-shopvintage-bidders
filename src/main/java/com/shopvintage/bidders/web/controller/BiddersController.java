package com.shopvintage.bidders.web.controller;

import com.shopvintage.bidders.persistence.entities.Bidder;
import com.shopvintage.bidders.persistence.repositories.BiddersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("bidders")
public class BiddersController {

    @Autowired
    private BiddersRepository biddersRepository;

    @GetMapping
    public List<Bidder> findAll(){
        return this.biddersRepository.findAll();
    }

    @PostMapping
    public Bidder sava(@RequestBody Bidder bidder){
        return this.biddersRepository.save(bidder);
    }
}
