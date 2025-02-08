public class WordCountTokenizerString1 {
        static int wordcount(String s) {
            int count = 0;
            char[] ch = new char[s.length()];
    
            for (int i = 0; i < s.length(); i++) {
                ch[i] = s.charAt(i);
                if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0))) {
                    count++;
                }
            }
            return count;
        }
    
        public static void main(String[] args) {
            String s = "India Is My Country";
            System.out.println(wordcount(s) + " words.");
        }
    }
    
/*
4 words
 */