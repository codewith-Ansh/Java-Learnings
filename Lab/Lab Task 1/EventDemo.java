interface Registrable {
    void registerParticipant(String participantName);

    void showParticipants();
}

class Event {
    int eventId;
    String eventName, date, venue;

    Event(int eventId, String eventName, String date, String venue) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.date = date;
        this.venue = venue;
    }

    void displayEventDetails() {
        System.out.println("Event ID: " + eventId);
        System.out.println("Event Name: " + eventName);
        System.out.println("Date: " + date);
        System.out.println("Venue: " + venue);
    }
}

class CodingEvent extends Event implements Registrable {
    String name;
    int maxTeamSize, duration;
    static int participants = 0;

    CodingEvent(int eventId, String eventName, String date, String venue, int maxTeamSize, int duration) {
        super(eventId, eventName, date, venue);
        this.maxTeamSize = maxTeamSize;
        this.duration = duration;
        participants++;
    }

    void displayEventDetails() {
        System.out.println("Coding Event Details:");
        System.out.println("Max Team Size: " + maxTeamSize);
        System.out.println("Duration: " + duration + " hours");
        super.displayEventDetails();
    }

    public void registerParticipant(String participantName) {
        this.name = participantName;
        System.out.println(name + " has registered for the Coding Event.");
    }

    public void showParticipants() {
        System.out.println("Total participants in Coding Event: " + participants);
    }
}

class RoboticsEvent extends Event implements Registrable {
    String name;
    int maxTeamSize, duration;
    static int participants = 0;

    RoboticsEvent(int eventId, String eventName, String date, String venue, int maxTeamSize, int duration) {
        super(eventId, eventName, date, venue);
        this.maxTeamSize = maxTeamSize;
        this.duration = duration;
        participants++;
    }

    void displayEventDetails() {
        System.out.println("Robotics Event Details:");
        System.out.println("Max Team Size: " + maxTeamSize);
        System.out.println("Duration: " + duration + " hours");
        super.displayEventDetails();
    }

    public void registerParticipant(String participantName) {
        this.name = participantName;
        System.out.println(name + " has registered for the Robotics Event.");
    }

    public void showParticipants() {
        System.out.println("Total participants in Robotics Event: " + participants);
    }
}

class HackathonEvent extends Event implements Registrable {
    String name;
    int maxTeamSize, duration;
    static int participants = 0;

    HackathonEvent(int eventId, String eventName, String date, String venue, int maxTeamSize, int duration) {
        super(eventId, eventName, date, venue);
        this.maxTeamSize = maxTeamSize;
        this.duration = duration;
        participants++;
    }

    void displayEventDetails() {
        System.out.println("Hackacthon Event Details:");
        System.out.println("Max Team Size: " + maxTeamSize);
        System.out.println("Duration: " + duration + " hours");
        super.displayEventDetails();
    }

    public void registerParticipant(String participantName) {
        this.name = participantName;
        System.out.println(name + " has registered for the Hackathon Event.");
    }

    public void showParticipants() {
        System.out.println("Total participants in Hackathon Event: " + participants);
    }
}

public class EventDemo {
    public static void main(String[] args) {
        Event e1 = new CodingEvent(1, "CodeFest", "2023-10-01", "Tech Park", 5, 3);
        e1.displayEventDetails();

        Registrable r1 = (CodingEvent) e1;
        r1.registerParticipant("Alice");
        r1.showParticipants();
        System.out.println();

        Event e2 = new RoboticsEvent(2, "RoboChallenge", "2023-10-02", "Innovation Hub", 4, 2);
        e2.displayEventDetails();

        Registrable r2 = (RoboticsEvent) e2;
        r2.registerParticipant("Bob");
        r2.showParticipants();
        System.out.println();

        Event e3 = new HackathonEvent(3, "Hack the Future", "2023-10-03", "Startup Incubator", 6, 24);
        e3.displayEventDetails();
        
        Registrable r3 = (HackathonEvent) e3;
        r3.registerParticipant("Charlie");
        r3.showParticipants();
    }
}