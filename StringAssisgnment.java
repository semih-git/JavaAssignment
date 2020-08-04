package homework;

public class StringAssisgnment {

    public static void twoString(String s1,String s2) {

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s2.length(); i++) {
            char c2 = s2.charAt(i);
            for (int j = 0; j < s1.length(); j++) {
                char c1 = s1.charAt(j);
                if (c2 == c1) {
                    result.append(c2);
                    break;
                }
            }
        }if(result.toString().equals(s2) ){ System.out.println(s1+"--"+s2+"-"+true);}
        else{ System.out.println(s1+"--"+s2+"-"+false);}
    }
    public static void main(String[] args) {
        twoString("abchxyzellmo","hello");                              //beklenen true
        twoString("abchxyzellml","hello");                              //beklenen false
        twoString("Coding is good. Books are good too.","CodingBook");  //beklenen true
        twoString("Coding is good.","CodingBook");                      //beklenen false
        twoString("Coding","CodingBook");                               //beklenen false
    }
}
