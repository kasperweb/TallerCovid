package com.labcovid.labcovid.controller;

import com.labcovid.labcovid.service.CovidDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CovidDataController {

    /*
    Inyección de dependencias
     */
    @Autowired
    CovidDataService covidDataService;

    @GetMapping("/getCountriesData")
    public String getCountriesData(@RequestBody String data)
    {
        covidDataService.get_countries_data(data);
        return "Se Grafico Correctamente";
    }

    @GetMapping("/getCountriesHistoricData")
    public String getCountriesHistoricData(@RequestBody String data)
    {
        covidDataService.get_countries_data(data, null, null);
        return "Se Grafico Correctamente";
    }
}
