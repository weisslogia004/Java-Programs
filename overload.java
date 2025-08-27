import java.util.*;
public class overload
{
    double volume(double r)
    {
    double v=4/3*22/7*r*r;
    return v;
    }
    double volume(double h,double r)
    {
    double v=22/7*r*r*h;
    return v;
    }
    double volume(double l,double b,double h)
    {
    double v=l*b*h;
    return v;
    }
}
    


