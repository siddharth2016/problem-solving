#include <bits/stdc++.h>
using namespace std;
int main()
{
	unsigned long long int num, i,j, test,ci,cj;
	scanf("%llu", &test);
	while(test--)
	{
		scanf("%llu", &num);
		i = 2;
		j = 5;
		ci=cj=0;
		while(i<=num)
		{
			ci += num/i;
			i = i*2;
		}
		while(j<=num)
		{
			cj+=num/j;
			j = j*5;
		}
		if(cj<ci)
		{
			printf("%llu\n", cj);
		}
		else if(ci<cj)
		{
			printf("%llu\n", ci);
		}
		else
		{
			printf("%llu\n", cj);
		}
	}
	return 0;
}
