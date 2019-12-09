import java.util.*;

public class Version2 {

    public static void main(String[] args) {




        ArrayList<Hero> heros = new ArrayList<>();
        heros.add(new Hero ("Black Widow", 34));
        heros.add(new Hero ("Captain America", 100));
        heros.add(new Hero ("Vision", 3));
        heros.add(new Hero ("Iron Man", 48));
        heros.add(new Hero ("Scarlet Witch", 29));
        heros.add(new Hero ("Thor", 1500));
        heros.add(new Hero ("Hulk", 49));
        heros.add(new Hero ("Doctor Strange", 42));


        // 3 Set new age from THOR
         System.out.println("Thor was " + heros.get(5).getAge() + " years old.\n");
         heros.get(5).setAge(1501);
         System.out.println("But today, Thor turned " +heros.get(5).getAge() + " years old.\n");
         System.out.println("Currently we have " + heros.size() + " Heros:\n");

            for (Hero hero : heros){
                System.out.println(hero.getName());
            }

        // 4 Shuffle heros list

         System.out.println("\nLets shuffle the heros one time:\n");
         Collections.shuffle(heros);

            for (Hero hero : heros){
                System.out.println(hero.getName());
             }




        // 5 Keep only half of the list
         heros.subList(0, heros.size()/2).clear();
        


        // 6 Loop through list and display remaining heros
         System.out.println("\nThese are the remaining heros: \n");
            for (Hero hero : heros){
                System.out.println(hero.getName());
            }
    }
}