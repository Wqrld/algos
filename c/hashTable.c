#include <stdio.h>

#define HASHTABLE_LEN 0xFF


// Bad hash function, but easy to explain
int hash(int input) {
	return input % HASHTABLE_LEN;
};

int main() {

	int array[HASHTABLE_LEN] = {0};


	// Just some temporary variables to show the point
	int a = 5;
	int b = 9000;
	int c = 9999999;

	// Add our items to the hash table
	array[hash(a)] = a;
	array[hash(b)] = b;
	array[hash(c)] = c;


	// Print all the items in our hashtable. Will be missing elements if HASHTABLE_LEN cannot fit all items
	for (int i = 0; i < (sizeof(array) / sizeof(int)); i++) {
		if (array[i] != NULL) {
			printf("%d\n", array[i]);
		}
	}
	

};
