package customer;

public class Customer {
    private String name="cannot be null";
    private char gender='N';
    private String mobileNumber="cannot be null";
    private String city="cannot be null";
    private boolean isInfected=false;
    private boolean isAwareOfInfection=false;
    private boolean isAwareOfSocialDistancing=false;

    //Constructor
//


    public Customer(String name,char gender, String mobileNumber, String city,
                    boolean isInfected, boolean isAwareOfInfection,
                    boolean isAwareOfSocialDistancing) {
        this.name = name;
        this.gender = gender;
        this.mobileNumber = mobileNumber;
        this.city = city;
        this.isInfected = isInfected;
        this.isAwareOfInfection = isAwareOfInfection;
        this.isAwareOfSocialDistancing = isAwareOfSocialDistancing;
    }

    @Override
    public String toString() {
        return '\n'+
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", city='" + city + '\'' +
                ", isInfected=" + isInfected +
                ", isAwareOfInfection=" + isAwareOfInfection +
                ", isAwareOfSocialDistancing=" + isAwareOfSocialDistancing +
                '\n';
    }
}
