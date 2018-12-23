package cams.hierarquia;

/**
 *
 * @author Carlos
 */
public class Cachorro  extends Animal{

    public Cachorro() {
        super();
        System.out.println("Um novo cachorro foi criado!");
    }

    @Override
    public void sleep() {
        System.out.println("Um cachorro esta dormindo...");
    }

    @Override
    public void eat() {
        System.out.println("Um cachorro esta comendo...");
    }
}
