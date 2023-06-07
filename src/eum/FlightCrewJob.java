package eum;

public enum FlightCrewJob {

    FLIGHT_ATTENDANT("attendant"),

    COPILOT("copilot"),

    PILOT("pilot");

    private String jobTitle;

    FlightCrewJob() {
        
    }

    FlightCrewJob(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }
    
}
