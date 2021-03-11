package tudelft.mirrorends;

public class mirrorEnds {
    public String mirrorEnds(String string){
        String mirror = "";
        int begin = 0;
        int end =  string.length() -1;
        for (; begin  < end; begin++, end--){
            if(string.charAt(begin) == string.charAt(end)){
                mirror += String.valueOf(string.charAt(end));
            }
            else {
                break;
            }
        }
        if(begin == end || mirror.length()>=end+1){
            return string;
        }
        return begin == end ? string : mirror;
    }
}
