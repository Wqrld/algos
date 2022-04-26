#include <stdio.h>

/*
Simple graph algorithm using an adjacency list
with a linked-list. 
*/

struct node {
	int id;
	struct ajdlistItem *children;
};

struct ajdlistItem {
	struct node* node;
	struct ajdlistItem* next;
};

typedef struct node node;

int main() {

	node a = {1};
	node b = {2};
	node c = {3};

	struct ajdlistItem childTwo = {
	&c, NULL
	};

	struct ajdlistItem childOne = {
		&b, &childTwo
	};
	childTwo.next = &childOne;

	a.children = &childOne;

	
	// (.) when the item before is a struct, or (->) when it's a struct pointer
	printf("Second child of node A: %d\n", a.children->next->node->id);

	printf("First child of node A but following through node C: %d\n", a.children->next->next->node->id);

}
