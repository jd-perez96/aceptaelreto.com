#include <stdio.h>

void solve() {
    unsigned int problem;
    scanf("%u\n", &problem);

    printf("%u\n", problem / 100);
}

int main() {
    unsigned int T, i;
    scanf("%u\n", &T);

    for (i = 0; i < T; ++i) solve();

    return 0;
}
