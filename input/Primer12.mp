main() {

    int fib;

    fib[0] = 0;
    fib[1] = 1;
    fib[2] = 1;
    fib[3] = 2;
    fib[4] = 3;
    fib[5] = 5;
    fib[6] = 8;
    fib[7] = 13;

    sum = 0;

    for(int i in fib){
        int br;

        br = i;
        write(i);
        sum = sum + fib[i];
    }

    write(sum);



}