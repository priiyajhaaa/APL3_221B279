class Voice {
    Animal[] animal =new Animal[5];
    public void prepareVoice(){
        animal[0] = new Cow();
        animal[1] = new Dog();
        animal[2] = new Pig();
        animal[3] = new Goat();
        animal[4] = new Lion();
    }
    public void hear(Animal[] animal){
        for(int i = 0 ; i<5 ; i++){
            animal[i].makeVoice();
        }
    }
}