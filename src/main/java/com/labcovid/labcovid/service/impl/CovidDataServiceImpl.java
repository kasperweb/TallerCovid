package com.labcovid.labcovid.service.impl;

import com.labcovid.labcovid.service.CovidDataService;
import com.labcovid.labcovid.service.Plot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class CovidDataServiceImpl  implements CovidDataService {

    @Autowired
    Plot plot;

    @Override
    public void get_countries_data(String countries) {
        // funcion que me trae los datos y almacena en una lista de string
        List<String> resultados = new ArrayList<>();
        plot.plot(resultados);
    }

    @Override
    public void get_countries_data(String countries, Date star_date, Date end_date) {
        // funcion que me trae los datos y almacena en una lista de string
        List<String> resultados = new ArrayList<>();
        plot.plot(resultados);
    }
}
