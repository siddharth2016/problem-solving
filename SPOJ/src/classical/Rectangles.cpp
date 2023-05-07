#include <bits/stdc++.h>
using namespace std;
int fun(int no)
{
	int srt=1, x, j;
	x = sqrt(no);
	for(j=2; j<=x; j++)
	{
		if(no%j==0)
		srt++;
	}
	return srt;
}
int main()
{
	int num, i, res = 0;
	scanf("%d", &num);
	for(i=1; i<=num; i++)
	{
		res+=fun(i);
	}
	printf("%d", res);
	return 0;
}
