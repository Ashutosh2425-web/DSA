interface Payment {

    void pay();

}

class PhonePe implements Payment {

    public void pay() {

        System.out.println("Payment through PhonePe");

    }

}

class GooglePay implements Payment {

    public void pay() {

        System.out.println("Payment through Google Pay");

    }

}

public class Main {

    public static void main(String[] args) {

        Payment p1 = new PhonePe();

        Payment p2 = new GooglePay();

        p1.pay();

        p2.pay();

    }

}