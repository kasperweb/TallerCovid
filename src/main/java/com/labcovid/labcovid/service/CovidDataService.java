package com.labcovid.labcovid.service;

import java.util.Date;

public interface CovidDataService {

    void get_countries_data(String countries);
    void get_countries_data(String countries, Date star_date, Date end_date);

}

