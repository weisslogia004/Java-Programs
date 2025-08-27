import java.util.*;
public class temperature
{
    double max,min,f1,f2;
    temperature(double m,double n)
    {
        max=m;
        min=n;
    }
    void compute()
    {
        f1=9*max/5+32;
        f2=9*min/5+32;
    }