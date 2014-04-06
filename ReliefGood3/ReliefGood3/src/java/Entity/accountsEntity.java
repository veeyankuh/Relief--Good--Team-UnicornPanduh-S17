package Entity;

/**
 *
 * @author Kendrick
 */
public class accountsEntity {
    private String username;
    private String firstName;
    private String lastName;
    private int areaId;
    private String email;
    private String password;
    private String orgName;
    private String orgContactNum;
    private String areaAddress;
    private int neededVolunteers;
    private String areaName;

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAreaId() {
        return areaId;
    }

    public void setAreaId(int areaId) {
        this.areaId = areaId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgContactNum() {
        return orgContactNum;
    }

    public void setOrgContactNum(String orgContactNum) {
        this.orgContactNum = orgContactNum;
    }


    public String getAreaAddress() {
        return areaAddress;
    }

    public void setAreaAddress(String areaAddress) {
        this.areaAddress = areaAddress;
    }

    public int getNeededVolunteers() {
        return neededVolunteers;
    }

    public void setNeededVolunteers(int neededVolunteers) {
        this.neededVolunteers = neededVolunteers;
    }
    
    
}
