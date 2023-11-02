class bobsAcc {
    private double principal;
    private double rate;
    private int time;

    public bobsAcc(double principal, double rate, int time) {
     this.principal = principal;
    this.rate = rate;
     this.time = time;
    }

    public double calculateSimpleInterest() {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
    double principal = 100000.0; 
    double rate = 5.0;
    int time = 5; 

        bobsAcc bobAccount = new bobsAcc(principal, rate, time);
        double simpleInterest = bobAccount.calculateSimpleInterest();

        System.out.println("Mr. Bob's Simple Interest after " + time +
         " years: " + simpleInterest + " RWK");
    }
    }

