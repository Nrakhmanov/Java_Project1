package day51_inheritance.super_keyword;

public class LyftRides {
    public static void main(String[] args) {
        Lyft ride = new Lyft();
        LyftXL rideXL = new LyftXL();
        LyftLUX rideLUX = new LyftLUX();

        System.out.println("ride for 5 miles = $" + ride.calculateRate(5));
        System.out.println("rideXL for 5 miles = $" + Math.round(rideXL.calculateRate(5)));
        System.out.println("rideLUX for 5 miles = $" + rideLUX.calculateRate(5));
    }
}
