public class Chiptole_Jr {
    public static int counter=1;
     static Double total_price=3.0;
    public static void main(String[] args) {
        System.out.println("|----------------------------|");
        System.out.println("|****************************|");
        System.out.println("|***WELCOME TO THE PROGRAM***|");
        System.out.println("|************CHIPOTLE_JR*****|");
        System.out.println("|----------------------------|");
        for(int i=0;i<25;i++){
            Controller();
        }

    }





    public static void Controller(){
        total_price=3.0;
        System.out.println("|----------|");
        System.out.println("| BURRITO "+counter+"|");
        System.out.println("|----------|");
        System.out.println("RICE: "+Race()+"");
        System.out.println("MEAT: "+Meat()+" ");
        System.out.println("BEANS: "+Beans()+" ");
        System.out.println("SALSA: "+Salsa()+"");
        System.out.println("VEGGIES: "+Veggies()+" ");
        System.out.println("CHEESE: "+Cheese()+" ");
        System.out.println("GUAC: "+Guac()+" ");
        System.out.println("QUESO: "+Queso()+" ");
        System.out.println("SOURCREAM: "+SourCream());
        System.out.println("PRICE: "+total_price);

        counter++;

    }
    public static String Race(){
        String Ingredients="";
        String[]Rice={"white", "brown", "none"};
        int Random_number=Random(Rice.length);
        for (int i=0;i<Rice.length;i++){
            if(Random_number==i){
                Ingredients= Rice[i];
                if(!(Ingredients.equalsIgnoreCase("none"))){
                    total_price=total_price+0.50;
                }
                else{
                    total_price=total_price+0;
                }
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
                if(!(Ingredients.equalsIgnoreCase("none"))){
                    total_price=total_price+0.50;
                }
                else{
                    total_price=total_price+0;
                }
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
                if(!(Ingredients.equalsIgnoreCase("none"))){
                    total_price=total_price+0.50;
                }
                else{
                    total_price=total_price+0;
                }
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
                if(Ingredients.equalsIgnoreCase("all")){
                    total_price=total_price+1.50;
                }
                else if(!(Ingredients.equalsIgnoreCase("none"))){
                    total_price=total_price+0.50;
                }

                else{
                    total_price=total_price+0;
                }
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

                 if(Ingredients.equalsIgnoreCase("all")){
                    total_price=total_price+1.50;
                }
                else if(!(Ingredients.equalsIgnoreCase("none"))){
                    total_price=total_price+0.50;
                }
                else{
                    total_price=total_price+0;
                }
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
                if(!(Ingredients.equalsIgnoreCase("no"))){
                    total_price=total_price+0.50;
                }
                else{
                    total_price=total_price+0;
                }
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
                if(!(Ingredients.equalsIgnoreCase("no"))){
                    total_price=total_price+0.50;
                }
                else{
                    total_price=total_price+0;
                }
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
                if(!(Ingredients.equalsIgnoreCase("no"))){
                    total_price=total_price+0.50;
                }
                else{
                    total_price=total_price+0;
                }
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
                if(!(Ingredients.equalsIgnoreCase("no"))){
                    total_price=total_price+0.50;
                }
                else{
                    total_price=total_price+0;
                }
            }
        }
        return Ingredients;
    }
    public static int Random(int max){
        int Random=(int)(Math.random()*(max));
        return Random;
    }
}
