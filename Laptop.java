package java_sem_6;

public class Laptop {
    
    private String brend;
    private int memory; 
    private int storage;
    private String operating_system;
    private String color;
    private String processor;

    public Laptop(String brend, int memory, int storage, String operating_system, String color, String processor){
        this.brend=brend;
        this.memory=memory;
        this.storage=storage;
        this.operating_system=operating_system;
        this.color=color;
        this.processor=processor;

    }
    public int getMenory() {
        return memory;
    }
    public int getStorage() {
        return storage;
    }
    public String getOperating_system() {
        return operating_system;
    }
    public String getColor() {
        return color;
    }

    public void shou(){
        System.out.printf("Brend: "+brend+", Память: "+memory+", HDD: "+storage+", Оперативная система: "+operating_system
                      +", Цвет: "+color+", Процессор: "+processor );
    }
}
