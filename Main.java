public class Main {
    public static  class Car{
        String make;
        String model;
        int year;

        Car(String make, String Model, int year){
            this.make = make;
            this.model = model;
            this.year = year;
        }

        void displayInfo(){
            System.out.println("Make: "+ make);
            System.out.println("Model: "+ model);
            System.out.println("Year: "+ year);
        }
    }

    public static void main(String[] args){
        Car myCar = new Car("Toyota", "Corolla", 2020);

        myCar.displayInfo();
    }
}

/*public class Main{
    int x = 5;

    public static void main(String[] args){
        Main myObj = new Main();
        System.out.println(myObj.x);
    }
}


/*
canvas - custom painter, an interface class
paint method

flutter???

public class Main{
    public static void main(String[] args){
        int countdown = 5;

        System.out.println("Countdown: ");
        do{
            System.out.println(countdown);
            countdown--;
        }while (countdown > 0);

        System.out.println("Count up: ");
        countdown = 1;
        do{
            System.out.println(countdown);
            countdown++;
        }while (countdown < 6); 
        System.out.println("Done!");
       
    }
}

public class Main{
    public static void main(String[] args){
        int day = 46;

        switch(day)
        {
            case 1:
                System.out.println("Sunday");
                break;

            case 2:
                System.out.println("Monday");
                break;

            case 3:
                System.out.println("Tuesday");
                break;

            case 4:
                System.out.println("Wednesday");
                break;

            case 5:
                System.out.println("Thursday");

            case 6:
                System.out.println("Friday");
                break;

            case 7:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Invalid Entry!");
        }
    }
}


public class Main{
    public static void main(String[] args){
        int passcode = 6574;
        if (passcode == 6574){
            System.out.println("Correct password! Door open");

        }
        else{
            System.out.println("Incorrect password! Door Closed.");
            System.out.println("Hint: Your mama's bodycount");
        }
    }
}*/