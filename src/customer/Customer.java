package customer;


//        String name
//        Character gender
//        String mobileNumber
//        String location / city
//        Boolean isInfected
//        Boolean isAwareOfInfection
//        Boolean isAwareOfSocialDistancing

public class Customer {
    private String name;
    private char gender;
    private String mobileNumber;
    private String city;
    private boolean isInfected;
    private boolean isAwareOfInfection;
    private boolean isAwareOfSocialDistancing;

    //Constructor

    public Customer(String name, char gender, String mobileNumber, String city,
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
        return "Customer{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", city='" + city + '\'' +
                ", isInfected=" + isInfected +
                ", isAwareOfInfection=" + isAwareOfInfection +
                ", isAwareOfSocialDistancing=" + isAwareOfSocialDistancing +
                '}';
    }
}
