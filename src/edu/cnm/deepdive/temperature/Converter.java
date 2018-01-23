package edu.cnm.deepdive.temperature;

public class Converter {

  public static double celsiusToFahrenheit(double celsius) {
     return 9 * celsius/ 5 + 32;
  
  }
 
  public static double farenheitToCelcius(double fahrenheit) {
    double celsius = 5 * (fahrenheit -32) / 9;
    return celsius;
  }
  
}