package gatopackage;

/**
 * Created by dalton on 3/14/16.
 */
public class Main {
    public static void main(String[] args) {
        Gato mel = new Gato();

        mel.setName("Melanie");
        mel.setAge(5);

        System.out.println(mel.getName() + " has " + mel.getAge() + " years!");
        System.out.println(mel.Meow() );

        Gato unknowCat = new Gato();

        // printing the default values
        System.out.println(unknowCat.getName() + " has " + unknowCat.getAge() + " years!");
        System.out.println(unknowCat.Meow() );

        // manually setting the new values
        unknowCat.setName("Nina");
        unknowCat.setAge(3);

        //after renaming Nina
        System.out.println(unknowCat.getName() + " has " + unknowCat.getAge() + " years!");
        System.out.println(unknowCat.Meow() );
    }
}
