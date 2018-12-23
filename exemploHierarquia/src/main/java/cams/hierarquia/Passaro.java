package cams.hierarquia;

/**
 *
 * @author Carlos
 */
public class Passaro extends Animal{

    public Passaro() {
        super();
        System.out.println("Um novo passaro foi criado!");
    }

    @Override
    public void sleep() {
        System.out.println("Um passaro esta dormindo...");
    }

    @Override
    public void eat() {
        System.out.println("Um passario esta comendo...");
    }
}
