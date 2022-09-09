// driver code start
import java.io.*;
class GFG{
    // driver code ends
public static int findPattern(String s, String p){
    // code here
    int s_index =0;
    int p_index=0;
    int flag=0;
    int start = 0;
    while(s_index<s.length())
    {
        if(p_index==p.length())
        {
            break;
        }
        if(p.charAt(p_index)==s.charAt(s_index))
        {
            if(p_index==0)
            {
                start=s_index;
            }
            flag++;
            p_index++;
            
        }
        s_index++;
    }
    if(flag==p.length())
    {
        return start;
    }
    return -1;
}
}