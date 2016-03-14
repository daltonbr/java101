package gatopackage;

/**
 * Created by dalton on 3/14/16.
 * Exercicio 01 - aula 02 - Dalton Lima
 */
public class Gato {
    private String name;
    private int age;

    // constructor 1 - with parameters
    public Gato (String _name, int _age) {
        this.setName(_name);
        this.setAge(_age);
    }

    // constructor 2 - without parameters
    public Gato () {
        this.setName("unnamed");
        this.setAge(1);
    }

    public void setName(String _name){
        this.name = _name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int _age) {
        this.age = _age;
    }

    public int getAge() {
        return this.age;
    }

    public String Meow(){
        return (getName() + " says meow!");
    }
}
