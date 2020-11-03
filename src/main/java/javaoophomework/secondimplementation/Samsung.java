package javaoophomework.secondimplementation;

public class Samsung extends Phone {

    public static String nameStatic = "xyz";

    public Samsung(String name, String color, String material) {
        super(name, color, material);
    }

    public String getNameStatic () {return nameStatic;}
    public void setNameStatic (String nameStatic) {this.nameStatic = nameStatic;}
}
