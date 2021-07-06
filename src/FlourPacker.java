public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(2,3,5));
        System.out.println(canPack(0,2,4));
    }
    public static boolean canPack(int bigCount,int smallCount,int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }
        if((goal % 5)>smallCount){
            return false;
        }
        return true;
    }
}
