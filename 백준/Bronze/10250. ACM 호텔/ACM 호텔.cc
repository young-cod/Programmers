#include <stdio.h>
#pragma warning(disable:4996)

int main() {
	int a;
	scanf("%d", &a);
	int x, y, z, room;
	int sum = 0;
	int cnt = 0;
	for (int i = 0; i < a; i++) {
		scanf("%d %d %d", &x, &y, &z);
		if (z <= x * y) {
			if (z%x) {
				printf("%d%02d\n", z%x, z / x + 1);
			}
			else {
				printf("%d%02d\n", x, z / x);
			}
		}
	}
}
