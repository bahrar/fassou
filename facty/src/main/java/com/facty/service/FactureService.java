package com.facty.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.facty.bean.Facture;

@Service
public class FactureService {


    public List<Facture> findAll() {

        Facture facture = new Facture(1L, "YC2018-0519", 4080);
//       Facture facture2 = new Facture(1L, "facture2", 150000);
//        Facture facture3 = new Facture(1L, "facture3", 150000);
//        Facture facture4 = new Facture(1L, "facture4", 150000);
//        Facture facture5 = new Facture(1L, "facture5", 150000);
        List<Facture> factures = new ArrayList<Facture>();
        factures.add(facture);
//       factures.add(facture2);
//        factures.add(facture3);
//        factures.add(facture4);
//        factures.add(facture5);
        
        return factures;
    }
}