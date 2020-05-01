//#include <ext/pb_ds/assoc_container.hpp>
#include <bits/stdc++.h>
//using namespace __gnu_pbds;
using namespace std;

mt19937 rng(chrono::steady_clock::now().time_since_epoch().count());
#ifndef M_PI // Checks if pi has been defined. If not, defines it.
#define M_PI 3.1415926535897932384626433832795028841971693993751
#endif

typedef vector<string> vs;
typedef long long ll;
typedef complex<double> pnt;
typedef vector<int> vi;
typedef vector<ll> vll;
typedef pair<int, int> pii;
typedef pair<ll, ll> pll;
typedef priority_queue<int> pqi;
typedef priority_queue<ll> pql;
typedef map<int, int> mii;
typedef map<ll, ll> mll;
typedef set<int> si;
typedef set<ll> sl;

// Data structure that does not allow duplicates, get indexes for numbers and numbers of indexes. Keeps elements sorted.
//typedef tree<int, null_type, less<int>, rb_tree_tag, tree_order_statistics_node_update> pbds;
// insert(x) inserts x; erase(x) removes x; order_of_key(num) returns index of num; (*find_by_order(x)) returns num in index x.
// If the element does not exist, it returns the index it would have if it was present.

#define inf             1e18                       // Infinity.
#define SZ(x)           ((ll) (x).size())          // Size of the vector.
#define F 				first 				       // First element in a pair.
#define S 				second					   // Second element in a pair.
#define RA(x)           begin(x), end(x)           // Start and end of a vector.
#define REP(i,a,b) 		for(int i = a; i < b; ++i) // Cycle macro for i, a and b.
#define B 				back 					   // Back function for a vector.
#define MP 				make_pair 				   // Make pair function for a pair.
#define setbits(x)      __builtin_popcountll(x)    // Counts the number of set bits.
#define PPB 			pop_back	      		   // Pop back function for a vector.
#define PB 				push_back				   // Push back function for a vector.
#define mod             1e9                        // Varies depending on the problem.
#define pres(x,y)       fixed<<setprecision(y)<<x  // Sets the precision of x to y decimal places.
#define mk(arr,n,type)  type *arr=new type[n];     // Makes an array arr of the given type of size n.
#define zrobits(x)      __builtin_ctzll(x)         // Counts the number of zero bits before the first set bit from the right.

int n, d, j, p;
string s;
bool x;

// PB
int main()
{
#ifndef ONLINE_JUDGE
	freopen("input.txt", "r", stdin);
	freopen("output.txt", "w", stdout);
#endif
	cin >> n >> d >> s;
	if (d == n - 1)
		cout << 1;
	else
	{
		j = 0;
		p = 1;
		while (true)
		{
			if (p + d >= n)
			{
				cout << (j + 1);
				break;
			}
			x = false;
			for (int i = p + d; !x && i > p; --i)
			{
				if (s[i - 1] == '1')
				{
					x = true;
					p = i;
					++j;
				}
			}
			if (!x)
			{
				cout << -1;
				break;
			}
		}
	}
	return 0;
}