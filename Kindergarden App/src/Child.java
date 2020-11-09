public class Child extends Human {


    public enum Type{
        ALL_DAY,
        HALF_DAY,
    }





    private Type type;
    private Adult nextOfKin;





    public Child(Adult nextOfKin , Type type){
        this.type = type;
        this.nextOfKin = nextOfKin;

    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Adult getNextOfKin() {
        return nextOfKin;
    }

    @Override
    public String toString() {
        return "Name: "
                + name
                + nextOfKin
                + " Type: "
                + type;
    }
}
