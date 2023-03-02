public class hexToDecimal {
    public static void main(String[] args){
        System.out.println(hexToDec("31"));
        System.out.println(hexToDec("3F"));
    }

    public static int hexToDec(String n){
        int dec;
        int sum = 0;
        String hexStr = "0123456789ABCDEF";
        StringBuilder hex = new StringBuilder(n);
        hex = hex.reverse();
        
        for(int i = 0; i < hex.length(); i++){
            dec = (int) (hexStr.indexOf(hex.charAt(i)) * Math.pow(16, i));
            sum += dec;
        }

        return sum;
    }
}
