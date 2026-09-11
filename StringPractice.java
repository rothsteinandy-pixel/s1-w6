public class StringPractice {
    public String mys1(String m){
        return m.substring(0,1) + m.substring(m.length()-1); 
    }    

    public int mys2(String letter, String social){
        return social.indexOf(letter);
    }

    public String mys3(String one, String two){
        String s1 = one.substring(0, one.length()/2);
        String s2 = two.substring(two.length()/2);
        return s1 + s2;
    }

    //This method should return the following if s equals 
    //Instagram return I9m 
    //BUT it doesn't fix it and then test it in
    //StringPracticeMain
    public String brokenEnd(String s){
        return s.substring(0, 1) + (s.length()) + s.substring(s.length() -1);
    }

    //This method should return first letter of
    //the parameter, b and the last two letters of the parameter, b
    //concatenated --> Ex. b = BeReal --> returns --> Bal
    public String firstLetterLastTwo(String b){
        //write this
        return b.substring(0,1)+ b.substring(b.length()-2);
    }
}
