package plane;

public class PlaneService {

    public void printPlaneInfo(Plane plane){
        System.out.print("Model: " + plane.getModel() + " ");
        System.out.print("Country: " + plane.getCountry() + " ");
        System.out.print("Year: " + plane.getYear() + " ");
        System.out.print("Hours: " + plane.getHours() + " ");
        System.out.print("IsMilitary: " + plane.isMilitary() + " ");
        System.out.print("Weight: " + plane.getWeight() + " ");
        System.out.print("Wingspan: " + plane.getWingspan() + " ");
        System.out.print("TopSpeed: " + plane.getTopSpeed() + " ");
        System.out.print("Seats: " + plane.getSeats() + " ");
        System.out.print("Cost: " + plane.getCost() + " ");
    }

    public void printCostAndTopSpeedIfMilitary(Plane plane){
        if(plane.isMilitary()){
            System.out.println("Cost: " + plane.getCost() + " TopSpeed: " + plane.getTopSpeed());
        }else{
            System.out.println("Model: " + plane.getModel() + " Country: " + plane.getCountry());
        }
    }

    public Plane newerPlane(Plane plane1 , Plane plane2){
        if(plane1.getYear() > plane2.getYear()){
            return plane1;
        }else if(plane1.getYear() < plane2.getYear()){
            return plane2;
        }else
            return plane1;
    }

    public String biggerWingspan(Plane p1, Plane p2){
        if(p1.getWingspan() > p2.getWingspan()){
            return p1.getModel();
        }else if(p1.getWingspan() < p2.getWingspan()){
            return p2.getModel();
        }else
            return p2.getModel();
    }

    public void printCountryWithSmallestSeatsCount(Plane p1, Plane p2, Plane p3){
        if(p1.getSeats() < p2.getSeats() && p1.getSeats() < p3.getSeats()){
            System.out.println(p1.getCountry());
        }else if(p2.getSeats() < p1.getSeats() && p2.getSeats() < p3.getSeats()){
            System.out.println(p2.getCountry());
        }else if(p3.getSeats() < p1.getSeats() && p3.getSeats() < p2.getSeats()){
            System.out.println(p3.getCountry());
        }else if(p1.getSeats() < p2.getSeats() && p1.getSeats() == p3.getSeats()){
            System.out.println(p1.getCountry());
        }else if(p2.getSeats() < p3.getSeats() && p1.getSeats() == p2.getSeats()){
            System.out.println(p1.getCountry());
        }else if(p1.getSeats() > p2.getSeats() && p2.getSeats() == p3.getSeats()){
            System.out.println(p2.getCountry());
        }else
            System.out.println(p1.getCountry());
    }

    public void printNotMilitaryPlanes(Plane[] planes){
        boolean isMilitary = false;
        for (Plane plane: planes) {
            if(!plane.isMilitary()){
                printPlaneInfo(plane);
                isMilitary = true;
            }
        }if(!isMilitary){
        System.out.println("All planes are military");
        }
    }

    public void printAllMilPlanesHoursMoreThan100(Plane[] planes){
        boolean isMilWithHoursMoreThan10 = false;
        for (Plane plane: planes) {
            if(!plane.isMilitary() && plane.getHours() > 100){
                printPlaneInfo(plane);
                isMilWithHoursMoreThan10 = true;
            }
        }
        if(!isMilWithHoursMoreThan10){
            System.out.println("There are no non-military planes with more than 100 hours of air mode");
        }
    }

    public Plane minimalWeightPlane(Plane[] planes){
        Plane min = planes[0];
        int index = 0;
        for (int i = 1; i < planes.length ; i++) {
            if(min.getWeight() >= planes[i].getWeight())
                min = planes[i];
                index = i;
        }return min;
    }

    public void MilPlaneWithMinCost(Plane[] planes){
        Plane min = planes[0];
        for (int i = 1; i < planes.length; i++) {
            if(min.getCost() > planes[i].getCost() && planes[i].isMilitary()){

                min = planes[i];
            }
        }if(!min.isMilitary()){
            System.out.println("There are no military planes");
        }else{
        printPlaneInfo(min);
    }
}

    public void printSortedByYearPlanes(Plane[] planes){
        int temp = 0;
        for (int i = 0; i < planes.length ; i++) {
            for (int j = 1; j < planes.length - i ; j++) {
                if(planes[j].getYear() > planes[j-1].getYear()){
                    temp = planes[j].getYear();
                    planes[j].setYear(planes[j-1].getYear());
                    planes[j-1].setYear(temp);

                }
            }
        }
        for (int i = 0; i < planes.length ; i++) {
            System.out.println(planes[i].getYear());
        }
    }
}
