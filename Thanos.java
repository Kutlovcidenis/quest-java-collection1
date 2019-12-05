import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        Hero h1 = new Hero ("Black Widow", 34);
        Hero h2 = new Hero ("Captain America", 100);
        Hero h3 = new Hero ("Vision", 3);
        Hero h4 = new Hero ("Iron Man", 48);
        Hero h5 = new Hero ("Scarlet Witch", 29);
        Hero h6 = new Hero ("Thor", 1500);
        Hero h7 = new Hero ("Hulk", 49);
        Hero h8 = new Hero ("Doctor Strange", 42);



        ArrayList<Hero> heros = new ArrayList<>();
        heros.add(h1); //index 0
        heros.add(h2); //index 1
        heros.add(h3);
        heros.add(h4);
        heros.add(h5);
        heros.add(h6);
        heros.add(h7);
        heros.add(h8); //index 7


        
        // 3 Set new age from THOR
        h6.setAge(1501);

        //System.out.println(heros(6).getName());
        System.out.println("Thor is now: " + heros.get(5).getAge() + "\n");
        System.out.println("Currently we have " + heros.size() + " Heros: \n");

        for (Hero hero : heros){
            System.out.println(hero.getName());
        }

        // 4 Shuffle heros list
        System.out.println("");
        System.out.println("Lets shuffle the heros one time: \n");
        Collections.shuffle(heros);
            for (Hero hero : heros){
            System.out.println(hero.getName());
        }

        // 5 Keep only half of the list
         System.out.println("Using subList: \n");
         List<Hero> heroList2 = heros.subList(2, 6); 
         System.out.println("");

        

        // 6 Loop through list and display remaining heros
        System.out.println("These are the remaining heros: \n");
        for (Hero hero : heroList2){
            System.out.println(hero.getName());
        }
    

        /*ArrayList<Hero> heros = new ArrayList<>();
        heros.add(new Hero ("Black Widow", 34));
        heros.add(new Hero ("Captain America", 100));
        heros.add(new Hero (" Vision", 3));
        heros.add(new Hero ("Iron Man", 48));
        heros.add(new Hero ("Scarlet Witch", 29));
        heros.add(new Hero ("Thor", 1500));
        heros.add(new Hero ("Hulk", 49));
        heros.add(new Hero ("Doctor Strange", 42));
        */
    }
}
