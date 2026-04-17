#include <bits/stdc++.h>
using namespace std;

int main()
{
	vector<int> arr = {10, 15, 20, 25, 30};
	int count = 0;
	int sum = 0;
	for (int ele : arr)
	{
		if (ele % 2 != 0)
		{
			sum += ele;
			count++;
		}
	}
	cout << "Total no of odd prices " << "\t" << count;
	cout << "Sum of odd prices " << "\t" << sum;
	cout << "Avg of odd prices " << "\t" << (sum / count);
}
