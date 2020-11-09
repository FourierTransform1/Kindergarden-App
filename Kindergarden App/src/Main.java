public class Main {




    private static Child[] children = new Child[3];




    private void createObjects() {

        Adult peter = new Adult(12345);
        peter.setName("Peter");
        Adult bosse = new Adult( 54321);
        bosse.setName("Bosse");
        Adult torsten = new Adult(67890);
        torsten.setName("Torsten");


        Child anna = new Child(peter, Child.Type.ALL_DAY);
        anna.setName("Anna");
        Child christer = new Child(bosse, Child.Type.HALF_DAY);
        christer.setName("Christer");
        Child max = new Child(torsten, Child.Type.ALL_DAY);
        max.setName("Max");


        children[0] = anna;
        children[1] = christer;
        children[2] = max;

    }

    private void printChildren(Child[] a){

        for (Object b: a){
            System.out.println(b);
        }
    }


    public static void main(String[] args) {

        Main obj = new Main();

        obj.createObjects();
        obj.printChildren(children);





    }


}
