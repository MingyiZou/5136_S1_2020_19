import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Mission {

        private String m_name;
        private String m_description;
        private String m_destination;
        private String oriCon;
        private String allowCon;
        private String co_Name;
        private String contactInfo;
        private Date launchDate;
        private String m_status;
        private String cargoRequire;
        private int m_duration;

        public Mission() {
            m_name = "";
            m_description = "";
            m_destination = "";
            oriCon = "";
            allowCon = "";
            co_Name = "";
            contactInfo = "";
            launchDate = new Date;
            m_status = "";
            cargoRequire = "";
            m_duration = 0;
        }

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public String getM_description() {
        return m_description;
    }

    public void setM_description(String m_description) {
        this.m_description = m_description;
    }

    public String getM_destination() {
        return m_destination;
    }

    public void setM_destination(String m_destination) {
        this.m_destination = m_destination;
    }

    public String getOriCon() {
        return oriCon;
    }

    public void setOriCon(String oriCon) {
        this.oriCon = oriCon;
    }

    public String getAllowCon() {
        return allowCon;
    }

    public void setAllowCon(String allowCon) {
        this.allowCon = allowCon;
    }

    public String getCo_Name() {
        return co_Name;
    }

    public void setCo_Name(String co_Name) {
        this.co_Name = co_Name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public Date getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(Date launchDate) {
        this.launchDate = launchDate;
    }

    public String getM_status() {
        return m_status;
    }

    public void setM_status(String m_status) {
        this.m_status = m_status;
    }

    public String getCargoRequire() {
        return cargoRequire;
    }

    public void setCargoRequire(String cargoRequire) {
        this.cargoRequire = cargoRequire;
    }

    public int getM_duration() {
        return m_duration;
    }

    public void setM_duration(int m_duration) {
        this.m_duration = m_duration;
    }
}