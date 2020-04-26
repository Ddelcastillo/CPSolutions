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
#define MP 				make_pair 				   // Make pair function for a pair.
#define setbits(x)      __builtin_popcountll(x)    // Counts the number of set bits.
#define mod             1e9                        // Varies depending on the problem.
#define PB 				push_back				   // Push back function for a vector.
#define pres(x,y)       fixed<<setprecision(y)<<x  // Sets the precision of x to y decimal places.
#define mk(arr,n,type)  type *arr=new type[n];     // Makes an array arr of the given type of size n.
#define zrobits(x)      __builtin_ctzll(x)         // Counts the number of zero bits before the first set bit from the right.

// P X
int main()
{
#ifndef ONLINE_JUDGE
	freopen("input.txt", "r", stdin);
	freopen("output.txt", "w", stdout);
#endif
	ll sumL, sumR;
	int t, n, act;
	cin >> t;
	REP(cases, 0, t)
	{
		sumL = sumR = 0;
		cin >> n;
		mk(x, n, int);
		REP(i, 0, n / 2)
		{
			act = 2 * i + 2;
			sumL += act;
			x[i] = act;
		}
		REP(i, 0, n / 2 - 1)
		{
			act = 2 * i + 1;
			sumR += act;
			x[i + n / 2] = act;
		}
		sumL -= sumR;
		if (sumL % 2 == 0)
			cout << "NO\n";
		else
		{
			x[n - 1] = sumL;
			cout << "YES\n";
			REP(i, 0, n)
			cout << x[i] << ' ';
			cout << '\n';
		}
	}
	return 0;
}