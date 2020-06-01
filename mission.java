

public class mission {

    String m_name=null;
    String m_description=null;
    String m_destination=null;
    String OriCon=null;
    String AllowCon=null;
    String CoordiName=null;
    String ContactInfo=null;
    String LaunchDate=null;
    String m_status=null;
    String[] cargoRequire=null;
    String m_durarion=null;
    public mission() {
        m_name=null;
        m_description=null;
        m_destination=null;
        OriCon=null;
        AllowCon=null;
        CoordiName=null;
        ContactInfo=null;
        LaunchDate=null;
        m_status=null;
        cargoRequire=null;
        m_durarion=null;
    }
    public void SetMissionName(String newM_name) {
        m_name=newM_name;
    }

    public void SetMissionDesc(String newM_description) {
        m_description=newM_description;

    }

    public void SetOriCountry(String newOriCon) {
     OriCon=newOriCon;

    }
    public void SetAllowCountry(String newAllowCon) {
    AllowCon=newAllowCon;
    }
    public void SetCoordName(String newCoordiName) {
        CoordiName=newCoordiName;
    }
    public void SetContactInfo(String newContanctInfo) {
        ContactInfo=newContanctInfo;
    }
    public void SetLaunchDate(String newLaunchDate) {
        LaunchDate=newLaunchDate;
    }
    public void SetMissionStatus(String newM_status) {
        m_status=newM_status;
    }

    public void SetCargoRequir() {
        String requir1="For the journey";
        String requir2="For the mission";
        String requir3="For other missions";
        cargoRequire[0]=requir1;
        cargoRequire[1]=requir2;
        cargoRequire[2]=requir3;
    }
    public void SetMissionDurar(String newM_durarion) {
            m_durarion=newM_durarion;
    }

    public String GetMissionName() {
        return m_name;

    }

    public String GetMissionDescr() {
        return m_description;
    }

    public String GetMissionDestination() {
        return m_destination;
    }

    public String GetOrigCountry() {
        return OriCon;
    }

    public String GetAllowCountry() {
        return AllowCon;

    }

    public String GetCoordiname() {
        return CoordiName;

    }

    public String GetCoordiContact() {
        return ContactInfo;

    }

    public String GetLaunchDate() {

        return LaunchDate;
    }

    public String GetMissionStatus() {
        return m_status;
    }
    public String GetMissionDurartion() {

        return m_durarion;
    }
    public String[] GetCargoRequire() {

        return cargoRequire;
    }
}