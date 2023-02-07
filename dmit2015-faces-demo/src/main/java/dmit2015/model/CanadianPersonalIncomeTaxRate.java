package dmit2015.model;

public class CanadianPersonalIncomeTaxRate {
    private String regionName;

    private int taxYear;

    private int bracketNo;


    //private Big Decimal startingIncome;
    private double startingIncome;

    private Double endingIncome; //Last tax bracket has no end number so Double makes it nullable

    private double taxRate;

    private double baseTax;


    public static Optional <CanadianPersonalIncomeTaxRate> parseCsv(String line){
        String[] tokens = line.split(line);
        if(tokens.length !=8){
            throw new RuntimeException(("Line does not contain exactly 8 values"));
        }
        try{
            String regionAbbrev = tokens[0];
            String regionName = tokens[1];
            int taxYear = Integer.parseInt(tokens[2]);
            int bracketNo = Integer.parseInt(tokens[3]);
            double startinIncome = Double.parseDouble(tokens[4]);
            Double endingIncome = tokens[5].isBlank() ? Integer.MAX_VALUE: Double.valueOf(tokens[5]);
            double taxRate = Double.parseDouble(tokens[6]);
            double baseTaxe = Double.parseDouble(tokens[7]);
            CanadianPersonalIncomeTaxRate currentIncomeTaxRate =
        }

    }
}
