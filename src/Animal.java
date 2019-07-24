public abstract class Animal implements biotop{

    int age,weight ;
    String name,sound ;


    public void name(String str){

        name = str;
    };

    public void weight(int n){

        weight = n;
    };

    public void sound(String str1) {
        sound =str1;
    };

    public void age(int c){
       this.age = c;
    };

    public void eat(){

    };
    public void grow (){

    };

    //constructor
    public Animal(String sound,int age, String name, int weight) {
        this.sound = sound;
        this.age = age;
        this.name = name;
        this.weight = weight;

    };
    //method showobj
    public void showobj (){
        System.out.println("Animal sound is: "+sound);
        System.out.println("Animal name is: "+name);
        System.out.println(name +" age is: "+age);
        System.out.println(name +" weight is: "+weight);
        System.out.println("");
    };

}
