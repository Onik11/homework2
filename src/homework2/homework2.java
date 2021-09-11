package homework2;

public class homework2 {
    public static void main(String[] args) {
        int a=13;
        int b=10;
        int c=b;
        if(a>b) {
            System.out.println("First is bigger");
        }else if(a<b){
            System.out.println("First is smaller");
        }else if(a==b){
            System.out.println("They are equal");
        }else{
            System.out.println("Do not worry");
        }    char sim1='p';
        char sim2='q';
        char sim3='z';
        if(sim1>sim3){
            if(sim1>sim2){
                System.out.println(sim1);
            }else{
                System.out.println(sim3);
            }
        }else if(sim3>sim2){
            System.out.println(sim3);
        }else{
            System.out.println(sim2);
        }

        boolean redIsHitFromBehind=true;
        boolean blackIsHitFromBehind=false;
        if(redIsHitFromBehind && !blackIsHitFromBehind){
            System.out.println("black");
        }
        else if(!redIsHitFromBehind && blackIsHitFromBehind){
            System.out.println("red");
        }
        else{
            System.out.println("warning");
        }
    }
}
