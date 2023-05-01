class area{
    static int square(int a){return a*a;}
    static int rectangle(int a,int b){return a*b;}
}
class testoverloading{
    public static void main(String args[]){
        System.out.println(area.square(12));
        System.out.println(area.rectangle(10,16));
    }
}