#include <stdio.h>

void solve() {
    int square_meters, football_fields, min_football_fields, max_football_fields;

    scanf("%d%d", &square_meters, &football_fields);

    min_football_fields = 90 * 45 * football_fields;
    max_football_fields = 120 * 90 * football_fields;

    printf(square_meters >= min_football_fields && square_meters <= max_football_fields
            ? "SI\n" : "NO\n");
}

int main() {
    unsigned int T, i;
    scanf("%u", &T);

    for (i = 0; i < T; ++i) solve();

    return 0;
}
