package shapes;

public class FullTimeEmployee extends Employee {
    private int luong;
    private int dayOff;
    public FullTimeEmployee(String Name, int Age, int Id, int luong, int dayOff){
        super(Name, Age, Id);
        this.luong = luong;
        this.dayOff = dayOff;
    }
    public void setLuong(int luong){
        this.luong = luong;
    }
    public int getLuong(){
        return luong;
    }
    public void setDayOff(int dayOff){
        this.dayOff = dayOff;
    }
    public int getDayOff(){
        return dayOff;
    }
    public double tinhTien(){
        return luong - ((luong/30 * dayOff));
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Luong hang thang: " + luong );
        System.out.println("So ngay nghi: " + dayOff);
        System.out.println("Luong thuc te: " + tinhTien());
    }
}