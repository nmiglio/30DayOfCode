#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    double mealCost = 0.0;
    int tipPercent = 0;
    int taxPercent = 0;
    int totalCost = 0;
    
    scanf("%lf", &mealCost);
    scanf("%d", &tipPercent);
    scanf("%d", &taxPercent);
    
    
    totalCost = round((mealCost) + (mealCost * tipPercent/100) + (mealCost * taxPercent/100));
    //printf("The tip is %lf dollars.\n", (mealCost * tipPercent/100));
    //printf("The tax is %lf dollars.\n", (mealCost * taxPercent/100));
    
    printf("The total meal cost is %d dollars.", totalCost);
                            
    return 0;
}
