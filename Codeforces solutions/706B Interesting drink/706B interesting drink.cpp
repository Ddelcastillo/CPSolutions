#include <ext/pb_ds/assoc_container.hpp>
#include <bits/stdc++.h>
using namespace __gnu_pbds;
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
typedef tree<int, null_type, less<int>, rb_tree_tag, tree_order_statistics_node_update> pbds;
// insert(x) inserts x; erase(x) removes x; order_of_key(num) returns index of num; (*find_by_order(x)) returns num in index x.
// If the element does not exist, it returns the index it would have if it was present.

#define inf             1e18                       // Infinity.
#define SZ(x)           ((ll) (x).size())          // Size of the vector.
#define RA(x)           begin(x), end(x)           // Start and end of a vector.
#define setbits(x)      __builtin_popcountll(x)    // Counts the number of set bits.
#define mod             1e9                        // Varies depending on the problem.
#define pres(x,y)       fixed<<setprecision(y)<<x  // Sets the precision of x to y decimal places.
#define mk(arr,n,type)  type *arr=new type[n];     // Makes an array arr of the given type of size n.
#define zrobits(x)      __builtin_ctzll(x)         // Counts the number of zero bits before the first set bit from the right.

int n;
//int[] x;
int q;

// P 706B: Interesting drink
int main()
{
    int n;
    q;
    cin >> n;
    vi x(n);
    for(int i = 0; i < n; ++i)
        cin >> x[i];
    cin >> q;
    sort(RA(x));
    for(int cas = 0; cas < q; ++cas)
    {
        int act;
        cin >> act;
        if(act >= x[n-1])
            cout << n << '\n';
        else if(act < x[0])
            cout << 0 << '\n';
        else
        {
            int low, mid, high;
            low = 0;
            high = n;
            while(low <= high)
            {
                mid = (low+high)/2;
                if(x[mid] <= act)
                    low = mid+1;
                else
                    high = mid-1;
            }
            cout << low << '\n';
        }
    }
    return 0;
}
