package com.facty.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.jasperreports.JasperReportsPdfView;

import com.facty.service.FactureService;

@Controller
public class EditionFactureController {

    @Autowired
    private ApplicationContext appContext;

    @Autowired
    private FactureService factureService;

    @RequestMapping(path = "/facture", method = RequestMethod.GET)
    public ModelAndView report() {

        JasperReportsPdfView view = new JasperReportsPdfView();
        view.setUrl("classpath:facture2.jrxml");
        view.setApplicationContext(appContext);
        view.setContentType("application/pdf");
        Map<String, Object> params = new HashMap<>();
        params.put("datasource", factureService.findAll());

        return new ModelAndView(view, params);
    }
}