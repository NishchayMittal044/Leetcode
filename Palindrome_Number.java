bool isPalindrome(long long x) {
    long long r,sum=0;
    long long org = x;
    if(x<0)
    return false;
    while(x!=0)
    {
        r = x%10;
        sum = r + 10*sum;
        x = x/10;
        
    }
    if(sum==org)
    {
        return true;
    }
    else
    return false;
    
}
