#include <stdio.h>
#include <stdlib.h>
struct Object{
    int x;
};

int main() {
    struct Object obj = {.x = 5};
    struct Object other = obj;
    //C compile this code
    //"obj" and "other" are share the same data
    printf("%d", obj.x);
    return 0;
}