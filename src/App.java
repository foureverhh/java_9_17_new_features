import eum.FlightCrewJob;
import record.Passenger;

public class App {
    public static void main(String[] args) throws Exception {
        FlightCrewJob job1 = FlightCrewJob.PILOT;
        FlightCrewJob job2 = FlightCrewJob.FLIGHT_ATTENDANT;
        FlightCrewJob job3 = FlightCrewJob.COPILOT;
        Passenger p1 = new Passenger("Bob", 1);
        Passenger p2 = new Passenger("Jack", 1);

        System.out.println(p1.name() + " has checkedBags " + p1.checkedBags());
    }
}
