import java.text.SimpleDateFormat;
import java.util.Date;

public class mission {

        private String mission_name;
        private String mission_description;
        private String mission_destination;
        private String origin_country;
        private String allowed_country;
        private String coordinator_name;
        private String contact_info;
        private String job_name;
        private String job_description;
        private String employment_requirements;
        private String cargo_requirements;
        private Date launchDate;
        private String destination_location;
        private int mission_duration;
        private String mission_status;

        public mission(){
            mission_name = "";
            mission_description = "";
            mission_destination = "";
            origin_country = "";
            allowed_country = "";
            coordinator_name = "";
            contact_info = "";
            job_name = "";
            job_description = "";
            employment_requirements = "";
            cargo_requirements = "";
            launchDate = new Date();
            destination_location = "";
            mission_duration = 0;
            mission_status = "";
        }

    public mission(String mission_name, String mission_description,
                   String mission_destination, String origin_country,
                   String allowed_country, String coordinator_name,
                   String contact_info, String job_name, String job_description,
                   String employment_requirements, String cargo_requirements,
                   Date lunch_date, String destination_location,
                   int mission_duration, String mission_status) {
        this.mission_name = mission_name;
        this.mission_description = mission_description;
        this.mission_destination = mission_destination;
        this.origin_country = origin_country;
        this.allowed_country = allowed_country;
        this.coordinator_name = coordinator_name;
        this.contact_info = contact_info;
        this.job_name = job_name;
        this.job_description = job_description;
        this.employment_requirements = employment_requirements;
        this.cargo_requirements = cargo_requirements;
        this.launchDate = lunch_date;
        this.destination_location = destination_location;
        this.mission_duration = mission_duration;
        this.mission_status = mission_status;
    }

    public String getMission_name() {
        return mission_name;
    }

    public void setMission_name(String mission_name) {
        this.mission_name = mission_name;
    }

    public String getMission_description() {
        return mission_description;
    }

    public void setMission_description(String mission_description) {
        this.mission_description = mission_description;
    }

    public String getMission_destination() {
        return mission_destination;
    }

    public void setMission_destination(String mission_destination) {
        this.mission_destination = mission_destination;
    }

    public String getOrigin_country() {
        return origin_country;
    }

    public void setOrigin_country(String origin_country) {
        this.origin_country = origin_country;
    }

    public String getAllowed_country() {
        return allowed_country;
    }

    public void setAllowed_country(String allowed_country) {
        this.allowed_country = allowed_country;
    }

    public String getCoordinator_name() {
        return coordinator_name;
    }

    public void setCoordinator_name(String coordinator_name) {
        this.coordinator_name = coordinator_name;
    }

    public String getContact_info() {
        return contact_info;
    }

    public void setContact_info(String contact_info) {
        this.contact_info = contact_info;
    }

    public String getJob_name() {
        return job_name;
    }

    public void setJob_name(String job_name) {
        this.job_name = job_name;
    }

    public String getJob_description() {
        return job_description;
    }

    public void setJob_description(String job_description) {
        this.job_description = job_description;
    }

    public String getEmployment_requirements() {
        return employment_requirements;
    }

    public void setEmployment_requirements(String employment_requirements) {
        this.employment_requirements = employment_requirements;
    }

    public String getCargo_requirements() {
        return cargo_requirements;
    }

    public void setCargo_requirements(String cargo_requirements) {
        this.cargo_requirements = cargo_requirements;
    }

    public Date getLaunchDate() {
        return launchDate;
    }

    public String getFormatLaunchDate() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String convert;
        try {
            convert = format.format(launchDate);
        } catch (Exception e) {
            return "";
        }
        return convert;
    }
    public void setLaunchDate(Date launchDate) {
        this.launchDate = launchDate;
    }

    public String getDestination_location() {
        return destination_location;
    }

    public void setDestination_location(String destination_location) {
        this.destination_location = destination_location;
    }

    public int getMission_duration() {
        return mission_duration;
    }

    public void setMission_duration(int mission_duration) {
        this.mission_duration = mission_duration;
    }

    public String getMission_status() {
        return mission_status;
    }

    public void setMission_status(String mission_status) {
        this.mission_status = mission_status;
    }


    @Override
    public String toString() {
        return mission_name + ';' +
                mission_description + ';' +
                mission_destination + ';' +
                origin_country + ';' +
                allowed_country + ';' +
                coordinator_name + ';' +
                contact_info + ';' +
                job_name + ';' +
                job_description + ';' +
                employment_requirements + ';' +
                cargo_requirements + ';' +
                getFormatLaunchDate() + ';' +
                launchDate + ';' +
                destination_location + ';' +
                mission_duration + ';' +
                mission_status + ';';
    }


}
