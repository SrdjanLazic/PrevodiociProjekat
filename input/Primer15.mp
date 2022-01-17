main() {

    char charList[4];

    charList[0] = 't';
    charList[1] = 'e';
    charList[2] = 's';
    charList[3] = 't';

    write(charList);

    for(int i in charList){
        int br;
        br = i;

        write(charList + br);
    }

}