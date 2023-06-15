#include <iostream>
#include <algorithm>
using namespace std;
#define int long long
#define x first
#define y second
const int MAXN = 2e6 + 16;
int a[MAXN], b[MAXN];
pair<int, int> v[MAXN];
int section(pair<int, int> a) {
    if (a.x > 0 && a.y >= 0)
        return 0;
    else if (a.x <= 0 && a.y > 0)
        return 1;
    else if (a.x < 0 && a.y <= 0)
        return 2;
    else
        return 3;
}
bool cmp(pair<int, int> a, pair<int, int> b) {
    if (section(a) != section(b))
        return section(a) < section(b);
    else
        return (__int128)a.x * (__int128)b.y - (__int128)a.y * (__int128)b.x > 0;
}
void print(__int128 x) {
    if (x < 0) {
        putchar('-');
        x = -x;
    }
    if (x > 9) print(x / 10);
    putchar(x % 10 + '0');
}
signed main() {
    ios_base::sync_with_stdio(false);
    
    int n;
    cin >> n;
    for (int i = 0; i < n; ++i) {
		vector<int> t(4);
		for(int j = 0; j < 4; j++)
			cin >> t[j];
		a[i] = t[0] - t[1];
		b[i] = t[2] - t[3];
	}
    int it = 0;
    __int128 sx = 0, sy = 0;
    for (int i = 0; i < n; ++i) {
        v[i << 1].x = a[it];
        v[i << 1].y = b[it];
        ++it;
        v[i << 1 ^ 1].x = -v[i << 1].x;
        v[i << 1 ^ 1].y = -v[i << 1].y;
        if (!v[i << 1].x && !v[i << 1].y) {
            --i, --n;
            continue;
        }
        if (v[i << 1].y < 0 || (!v[i << 1].y && v[i << 1].x < 0))
            sx += v[i << 1].x, sy += v[i << 1].y;
    }
    sort(v, v + 2 * n, cmp);
    __int128 ans = sx * sx + sy * sy;
    for (int i = 0; i < 2 * n; ++i) {
        sx += v[i].x;
        sy += v[i].y;
        ans = std::max(ans, sx * sx + sy * sy);
    }
    print(ans);

    return 0;
}
