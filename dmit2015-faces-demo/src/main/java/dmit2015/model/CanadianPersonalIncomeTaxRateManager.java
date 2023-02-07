package dmit2015.model;

import lombok.Getter;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CanadianPersonalIncomeTaxRateManager {

    @Getter
    private List<CanadianPersonalIncomeTaxRate> incomeTaxRates;

    public CanadianPersonalIncomeTaxRateManager(){
        incomeTaxRates = new ArrayList<>();
        try{
            try (var reader = new BufferedReader(new InputStreamReader(
                    getClass().getResourceAsStream("/data/csv/CanadianPersonalIncomeTaxRates.csv")
            ))){

            }
        }
    }
}
