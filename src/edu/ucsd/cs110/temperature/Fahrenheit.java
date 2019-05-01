package edu.ucsd.cs110.temperature;
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float value = ((this.getValue() - 32) / (9 / 5));
        return new Celsius(value);
    }

    @Override
    public Temperature toFahrenheit() {
        float value = this.getValue();
        return new Fahrenheit(value);
    }

    public String toString()
    {
        return this.getValue() + " F";
    }
}