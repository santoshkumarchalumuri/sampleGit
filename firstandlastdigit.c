//swaping of first and last digits
#include <stdio.h>

int main() {
    // Write C code here
    int n,temp=0,rev=0,revs=0,rem1=0,rem=0;
    printf("Enter a number");
    scanf("%d",&n);
    if(n<1000)
    {
        while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        printf("%d",rev);
    }
    else {
        temp=n;
        while(temp>10)
        {
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        while(rev>10)
        {
            rem1=rev%10;
            revs=revs*10+rem1;
            rev=rev/10;
        }
        printf("%d%d%d",rev,revs,temp);
    }
}
