package ocp11.ch12;

public @interface Sleep {
    int value();
    String hours();
}

@interface Wake {
    String hours();
}

class Bear {
    @Sleep(18)    
    public void sleep() {
    }
    
    @Wake(6)
    public void wake(){
        
    }
}