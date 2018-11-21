import java.util.*;

public class Promo
{
  public static void main(String[] args)
  {
    //Creation de l'objet arraylist de la promo
    ArrayList<String> promo = new ArrayList<String>();
   	promo.add("Maya");
    	promo.add("Anabelle");
    	promo.add("Marthe");
    	promo.add("Justine");
    	promo.add("Nicolas");
	promo.add("Mohamed");
	promo.add("Alexis");
	promo.add("Lucas");
	promo.add("Erwan");
	promo.add("Moka");
	promo.add("Gaetan");
	promo.add("Tony");
	promo.add("Leuthsouline");
    	promo.add("Gauthier");
    	promo.add("Fabien");
    	promo.add("Robin");
	promo.add("Mathieu");
	promo.add("Michel");
	promo.add("Corentin");
	promo.add("Quentin");
	promo.add("Mickael");
	promo.add("Charles");
	promo.add("Benoit");
    	promo.add("Florentin");

   
    System.out.println("Wilders Reims");
    //parcours de la liste promo pour afficher le contenu
    for (int i=0; i < promo.size(); i++)
    {
      System.out.println(promo.get(i));
    }
        
    ArrayList<String> promoJava = new ArrayList<String>();
    promoJava.add(promo.get(0));
    promoJava.add(promo.get(1));
    promoJava.add(promo.get(2));
    promoJava.add(promo.get(3));
    promoJava.add(promo.get(4));
    promoJava.add(promo.get(5));
    promoJava.add(promo.get(6));
    promoJava.add(promo.get(7));
    promoJava.add(promo.get(8));
    promoJava.add(promo.get(9));
    promoJava.add(promo.get(10));
    promoJava.add(promo.get(11));

    ArrayList<String> promoJs = new ArrayList<String>();
    promoJs.add(promo.get(12));
    promoJs.add(promo.get(13));
    promoJs.add(promo.get(14));
    promoJs.add(promo.get(15));
    promoJs.add(promo.get(16));
    promoJs.add(promo.get(17));
    promoJs.add(promo.get(18));
    promoJs.add(promo.get(19));
    promoJs.add(promo.get(20));
    promoJs.add(promo.get(21));
    promoJs.add(promo.get(22));
    promoJs.add(promo.get(23));	

    Map<String, ArrayList<String>> myMap = new HashMap<String, ArrayList<String>>();
	
    myMap.put("java", promoJava);
    myMap.put("js", promoJs);

	for (Map.Entry<String, ArrayList<String>> entry : myMap.entrySet()) {
	System.out.println(entry.getKey());
	System.out.println(entry.getValue());
  	}
    }
}



