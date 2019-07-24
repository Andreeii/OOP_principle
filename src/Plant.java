public abstract class Plant implements biotop {

    int age,height ;
    String name,shape ;

    public void name(String str){
        name = str;
    };

    public void heigth (int m){
        height = m; };

    public void shape(String str1){
        shape =str1;
    };

    public void age(int c){
        this.age = c;
        System.out.println(c);
    };

    public Plant(int age, int height, String name, String shape) {
        this.age = age;
        this.height = height;
        this.name = name;
        this.shape = shape;
    };
    public void showobj (){
        System.out.println("Plant name is: "+name);
        System.out.println("Plant height is: "+ height);
        System.out.println(name +" age is: "+age);
        System.out.println(name +" shape is: "+shape );
        System.out.println("");
    };
}
