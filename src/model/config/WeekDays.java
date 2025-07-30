package model.config;
public enum WeekDays {
    MONDAY(1, "Lunes"),
    TUESDAY(2, "Martes"),
    WEDNESDAY(3, "Miercoles"),
    THURSDAY(4, "Jueves"),
    FRIDAY(5, "Viernes"),
    SATURDAY(6, "Sabado"),
    SUNDAY(7, "Domingo");
    
    private Integer numb;
    private String name;

    WeekDays (Integer numb, String name){
        this.name = name;
        this.numb = numb;
    }

    public String getName(){
        return name;
    }

    public Integer getNumb(){
        return numb;
    }

    @Override
    public String toString() {
        return getName();
        
    }

    
}
