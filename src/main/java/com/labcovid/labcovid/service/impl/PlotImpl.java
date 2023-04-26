package com.labcovid.labcovid.service.impl;

import com.labcovid.labcovid.service.CSVPlotter;
import com.labcovid.labcovid.service.Plot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlotImpl implements Plot {

    @Autowired
    CSVPlotter csvPlotter;

    @Override
    public void plot(List<String> result) {
        String csv = "";
        if (!result.isEmpty()){
            for (String res :result){
                csv += res + ",";
            }
        }
        csvPlotter.graficarCSV(csv);
    }
}


