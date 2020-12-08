package ocp11.ch12.enums.constructor;

public enum Season3 {
   WINTER {
      public String getHours() { return "10am-3pm"; }
   },
   SUMMER {
      public String getHours() { return "9am-7pm"; }
   },
   SPRING, FALL;
   public String getHours() { return "9am-5pm"; }
   
    public static void main(String[] args) {
        System.out.println(WINTER.getHours());
        System.out.println(FALL.getHours());
    }
} 