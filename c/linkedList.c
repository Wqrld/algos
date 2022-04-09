#include <stdio.h>

int main() {

	// Simple doubly linked list implementation
	struct listItem {
		struct listItem* last;
		int value;
		struct listItem* next;
	};


	// We do not know much about the other items yet
	struct listItem one = {
		NULL,
		5,
		NULL
	};

	struct listItem two = {
	&one,
	6,
	NULL
	};
	one.next = &two; // Link them together so we can go two ways


	// Lookup first element from the last, and vice-versa
	printf("one: %d\n", two.last->value);
	printf("two: %d\n", one.next->value);



}
