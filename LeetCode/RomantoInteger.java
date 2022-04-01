class Solution {
    public int romanToInt(String s) {
        int sum=0;
        char arr[]={'I','V','X','L','C','D','M'};
        for(int i=0;i<s.length();i++)
        {
            if(i<s.length()-1)
            {
                if(new String(arr).indexOf(s.charAt(i)) >= new String(arr).indexOf(s.charAt(i+1)))
                {
                    switch(new String(arr).indexOf(s.charAt(i)))
                    {
                        case 0:
                            sum+=1;
                            break;
                        case 1:
                            sum+=5;
                            break;
                        case 2:
                            sum+=10;
                            break;
                        case 3:
                            sum+=50;
                            break;
                        case 4:
                            sum+=100;
                            break;
                        case 5:
                            sum+=500;
                            break;
                        case 6:
                            sum+=1000;
                            break;
                    }
                }
                else{
                    switch(new String(arr).indexOf(s.charAt(i)))
                    {
                        case 0:
                            sum+=-1;
                            break;
                        case 1:
                            sum+=-5;
                            break;
                        case 2:
                            sum+=-10;
                            break;
                        case 3:
                            sum+=-50;
                            break;
                        case 4:
                            sum+=-100;
                            break;
                        case 5:
                            sum+=-500;
                            break;
                        case 6:
                            sum+=-1000;
                            break;
                    }
                }
            }
            else
            {
                switch(new String(arr).indexOf(s.charAt(i)))
                {
                    case 0:
                        sum+=1;
                        break;
                    case 1:
                        sum+=5;
                        break;
                    case 2:
                        sum+=10;
                        break;
                    case 3:
                        sum+=50;
                        break;
                    case 4:
                        sum+=100;
                        break;
                    case 5:
                        sum+=500;
                        break;
                    case 6:
                        sum+=1000;
                        break;
                }
            }
        }
        return sum;
    }
}
