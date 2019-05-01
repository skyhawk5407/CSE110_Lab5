package edu.ucsd.cs110.temperature;
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float VARIABLE = (float) (9.0 / 5.0);
        float value = (float) ((this.getValue() - 32) / VARIABLE);
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