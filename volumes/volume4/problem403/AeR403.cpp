#include <iostream>
using namespace std;

void solve() {
    int square_meters, football_fields, min_football_fields, max_football_fields;

    cin >> square_meters >> football_fields;

    min_football_fields = 90 * 45 * football_fields;
    max_football_fields = 120 * 90 * football_fields;

    cout << (square_meters >= min_football_fields && square_meters <= max_football_fields
            ? "SI" : "NO")
        << endl;
}


int main(int argc, char const *argv[]) {
    unsigned int T;

    cin >> T;
    for (size_t i = 0; i < T; i++) {
        solve();
    }
    
    return 0;
}
