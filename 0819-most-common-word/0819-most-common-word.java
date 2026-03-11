class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        

        paragraph =paragraph.toLowerCase().replaceAll("[^a-z]"," ");
        String words[]= paragraph.split(" ");

        HashSet<String>ban= new HashSet<>();
            for(String b:banned){
                ban.add(b);
            }

            HashMap<String,Integer>map= new HashMap<>();
            String result="";
            int max=0;

            for(String word:words){
                if(word.length()==0 || ban.contains(word)) continue;

                map.put(word,map.getOrDefault(word,0)+1);

                    if(map.get(word)>max){
                        max= map.get(word);
                        result =word;
                    }

            }
            return result;
    }
}