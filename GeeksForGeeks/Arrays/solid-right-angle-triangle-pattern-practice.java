#include <stdio.h>

int main() {

    int n;
    scanf("%d", &n);
triangleWall(n);
    // code here
    

    return 0;
}
void triangleWall(int s) {

    // Write your code here
    for(int i=1; i<=s; i++){
        for(int j=1; j<=i; j++){
            printf("* ");
            
        }
        printf("\n");
    }
    
}