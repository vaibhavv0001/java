class car {
    int wheel;
    int stearing;
    int gear;
    boolean exhaust;
    
    void move(){
      System.out.println("wheel");
    }
    void functionality(){
      
      System.out.println("gear");
      System.out.println("stearing");
    }
    
    void speed(){
      System.out.println("exhaust");
    }
  }
  public class main{
  public static void main(String[]args){
    car tata = new car();
    tata.wheel=4;
    tata.gear=5;
    tata.stearing=1;
    tata.exhaust=true;
    tata.move();
    tata.functionality();
    tata.speed();
  }
  }