#include <iostream>
using namespace std;

void solve() {
    unsigned int problem;
    cin >> problem;
    cout << problem / 100 << endl;
}


int main(int argc, char const *argv[]) {
    unsigned int T;

    cin >> T;
    for (size_t i = 0; i < T; i++) {
        solve();
    }
    
    return 0;
}
