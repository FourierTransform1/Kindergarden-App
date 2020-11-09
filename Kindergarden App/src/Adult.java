public class Adult extends Human {

    protected int phoneNumber;



    public Adult(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }



    public int getPhoneNumber() {
        return phoneNumber;
    }



    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @Override
    public String toString() {
        return " (Next of kin: "
                + name
                + ", Phone: "
                + phoneNumber
                + ")";
    }
}
