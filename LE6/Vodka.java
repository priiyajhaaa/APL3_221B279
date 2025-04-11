class Vodka extends Decorator{
    Vodka(Offering offering){
        this.offering = offering;
    }
    String getName(){
        return offering.getName()+" with Vodka";
    }
    int getPrice(){
        return offering.getPrice()+65;
    }
}