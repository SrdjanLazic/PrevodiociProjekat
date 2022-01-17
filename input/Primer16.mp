main() {

    int numOfPeople;

    numOfPeople = 5;

    for(int i in numOfPeople){
        char name[10];
        char lastName[10];
        char greeting[10];

        greeting[0] = 'H';
        greeting[1] = 'i';
        greeting[2] = ',';

        read(name);
        read(lastName);

        write(greeting + name + lastName);
    }
}