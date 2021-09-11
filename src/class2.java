public class class2 {
    public static void main(String[] args) {
//        int month=9;
//        switch (month){
//            case 1:
//            case 2:
//            case 12:
//                System.out.println("It is winter");
//                break;
//            default:
//                System.out.println("It is not winter");
//        }
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
