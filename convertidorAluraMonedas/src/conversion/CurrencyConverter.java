package conversion;


import api.CurrencyAPI;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;




public class CurrencyConverter {

    private static final JsonParser jsonParser = new JsonParser();

    public static void convertCurrency(String targetCurrency, double usdAmount) throws Exception {
        String jsonResponse = CurrencyAPI.getExchangeRates();
        JsonObject exchangeRates = jsonParser.parse(jsonResponse).getAsJsonObject().getAsJsonObject("conversion_rates");

        double conversionRate = exchangeRates.get(targetCurrency).getAsDouble();
        double convertedAmount = usdAmount * conversionRate;

        System.out.printf("%.2f USD equivale a %.2f %s\n", usdAmount, convertedAmount, targetCurrency);
    }




}
