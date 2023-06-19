package Prototype;

public class Main {
    public static void main (String [] args){
        Circle newCircle = new Circle();
        newCircle.setRadius(5);
        ContextMenu menu = new ContextMenu();
        System.out.println( ((Circle) menu.duplicate(newCircle)).getRadius());
        
        
    }
}
