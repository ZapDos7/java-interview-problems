#include <stdio.h>
#define loop( i, from, to ) \
     for( i = from; i <= to; i++ )

int main ()
{
    int i;
    loop ( i, 0, 3 )
        printf ("%d\n", i);
}

// what will be the output ? [Do not execute / run]
// Author : Gultu

/*
Response:
We define the for loop in L2-3 and call it in L8 which translates to

for (i = 0; i <=3; i++)
which will iterate 4 times

So it will print:
0
1
2
3
*/