public interface Round {
    double Pi = 3.1415926;
    double cir(double r);
    double area(double r);
}
class MyRound implements Round{

    @Override
    public double cir(double r) {
        return 2*Pi*r;
    }

    @Override
    public double area(double r) {
        return Pi*r*r;
    }
}
