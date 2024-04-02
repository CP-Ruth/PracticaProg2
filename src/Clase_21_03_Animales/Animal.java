package Clase_21_03_Animales;

public abstract class Animal {
    private String photo;
    private String food;
    private String localization;
    private String zise;

    //Constructor
    public Animal(String photo, String food, String localization, String zise) {
        this.photo = photo;
        this.food = food;
        this.localization = localization;
        this.zise = zise;
    }

    //GETTERS ans SETTERS

    public String getPhoto() {
        return photo;
    }
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getFood() {
        return food;
    }
    public void setFood(String food) {
        this.food = food;
    }

    public String getLocalization() {
        return localization;
    }
    public void setLocalization(String localization) {
        this.localization = localization;
    }

    public String getZise() {
        return zise;
    }
    public void setZise(String zise) {
        this.zise = zise;
    }

    //Metodos
    public abstract void  hacerRuido();
    public abstract void comer();
    public void sleep(){
        System.out.println("Zzz...");
    }
    public abstract void rigir();
}
