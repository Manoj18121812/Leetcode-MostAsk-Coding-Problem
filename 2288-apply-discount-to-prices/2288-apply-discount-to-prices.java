class Solution {
    public String discountPrices(String sentence, int discount) {
        
        String words[] = sentence.split(" ");
        StringBuilder sb = new StringBuilder();

        for(String word:words){
            if(word.startsWith("$") && word.length()>1 && isNumber(word.substring(1))){
                double price = Double.parseDouble(word.substring(1));
                double discounted = price * (100 - discount)/100.0;
                String formatted = String.format("$%.2f",discounted);
                sb.append(formatted);
            }else{
                sb.append(word);
            }
            sb.append(" ");

        }
        return sb.toString().trim();

    }
    private boolean isNumber(String s){
        for(char c:s.toCharArray()){
            if (!Character.isDigit(c)) return false;
        }
         return true;
    }
}
