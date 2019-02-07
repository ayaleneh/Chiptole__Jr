public class Chiptole_Jr {
    public static int counter=1;
    public static void main(String[] args) {

        for(int i=0;i<25;i++){
            Controller();
        }
    }
    public static void Controller(){
        System.out.println("Burrito "+counter);
        System.out.print(Race()+", ");
        System.out.print(Meat()+", ");
        System.out.print(Beans()+", ");
        System.out.print(Salsa()+", ");
        System.out.print(Veggies()+", ");
        System.out.print(Cheese()+", ");
        System.out.print(Guac()+", ");
        System.out.print(Queso()+", ");
        System.out.print(SourCream());
        System.out.println();
        counter++;

    }
    public static String Race(){
        String Ingredients="";
        String[]Rice={"white", "brown", "none"};
        int Random_number=Random(Rice.length);
        for (int i=0;i<Rice.length;i++){
            if(Random_number==i){
                Ingredients= Rice[i];
            }
        }
       return Ingredients;
    }
    public static String Meat(){
        String[]Meat= {"chicken", "steak", "carnidas", "chorizo", "sofritas", "veggies"};
        String Ingredients="";
        int Random_number=Random(Meat.length);
        for (int i=0;i<Meat.length;i++){
            if(Random_number==i){
                Ingredients= Meat[i];
            }
        }
        return Ingredients;
    }
    public static String Beans(){
        String[]Beans={"pinto", "black", "none"};
        String Ingredients="";
        int Random_number=Random(Beans.length);
        for (int i=0;i<Beans.length;i++){
            if(Random_number==i){
                Ingredients= Beans[i];
            }
        }
        return Ingredients;
    }
    public static String Salsa() {
        String[]Salsa= {"mild", "medium", "hot", "none", "all"};
        String Ingredients="";
        int Random_number=Random(Salsa.length);
        for (int i=0;i<Salsa.length;i++){
            if(Random_number==i){
                Ingredients= Salsa[i];
            }
        }
        return Ingredients;
    }
    public static String Veggies(){
        String[]Veggies= {"lettuce", "fajita","veggies", "none", "all"};
        String Ingredients="";
        int Random_number=Random(Veggies.length);
        for (int i=0;i<Veggies.length;i++){
            if(Random_number==i){
                Ingredients= Veggies[i];
            }
        }
        return Ingredients;
    }
    public static String Cheese(){
        String[]Cheese= {"yes","no"};
        String Ingredients="";
        int Random_number=Random(Cheese.length);
        for (int i=0;i<Cheese.length;i++){
            if(Random_number==i){
                Ingredients= Cheese[i];
            }
        }
        return Ingredients;
    }
    public static String Guac(){
        String[]Guac= {"yes","no"};
        String Ingredients="";
        int Random_number=Random(Guac.length);
        for (int i=0;i<Guac.length;i++){
            if(Random_number==i){
                Ingredients= Guac[i];
            }
        }
        return Ingredients;
    }
    public static String Queso(){
        String[]Queso= {"yes","no"};
        String Ingredients="";
        int Random_number=Random(Queso.length);
        for (int i=0;i<Queso.length;i++){
            if(Random_number==i){
                Ingredients= Queso[i];
            }
        }
        return Ingredients;
    }
    public static String SourCream(){
        String[]Sourcream= {"yes","no"};
        String Ingredients="";
        int Random_number=Random(Sourcream.length);
        for (int i=0;i<Sourcream.length;i++){
            if(Random_number==i){
                Ingredients= Sourcream[i];
            }
        }
        return Ingredients;
    }
    public static int Random(int max){
        int Random=(int)(Math.random()*(max));
        return Random;
    }
}
