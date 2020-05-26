package missonToMars;

public class Shuttle {

    private String s_name;
    private int s_manufact_year;
    private float s_fuel_capacity;
    private int s_passenger_capacity;
    private int s_cargo_capacity;
    private float s_travel_speed;


    public Shuttle(){
        s_name = "Unknown";
        s_manufact_year = 0;
        s_fuel_capacity = 0.0;
        s_passenger_capacity = 0;
        s_cargo_capacity = 0;
        s_travel_speed = 0.0;
    }

    // GET
    public String getS_name()
    {
        return s_name;
    }

    public int getS_manufact_year() {return  s_manufact_year};

    public float getS_fuel_capacity() {return s_fuel_capacity};

    public int getS_passenger_capacity() {return s_passenger_capacity};

    public int getS_cargo_capacity() {return s_cargo_capacity};

    public float getS_travel_speed() {return s_travel_speed};

    //SET
    public void setS_name(int newS_name) {s_name = newS_name};

    public void setS_manufact_year(int newS_manufact_year) {s_manufact_year = newS_manufact_year};

    public void setS_fuel_capacity(int newS_fuel_capacity) {s_fuel_capacity = newS_fuel_capacity};

    public void setS_passenger_capacity(int newS_passenger_capacity) {s_passenger_capacity=newS_passenger_capacity};

    public void setS_cargo_capacity(int newS_cargo_capacity) {s_cargo_capacity = newS_cargo_capacity};

    public void setS_travel_speed(int newS_travel_speed) {s_travel_speed = newS_travel_speed};


}
