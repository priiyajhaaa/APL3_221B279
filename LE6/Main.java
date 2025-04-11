class Main{
    public static void main(String[]args){
        Offering offering = new Coffee();
        offering = new Rum(offering);
        offering = new Rum(offering);
        System.out.println(offering.getName() +" and price is: "+offering.getPrice());
        Offering of2 = new Tea();
        of2 = new Gin(of2);
        System.out.println(of2.getName()+" and price is: "+of2.getPrice());
        Offering of3 = new IceCream();
        of3 = new Vodka(of3);
        of3 = new Vodka(of3);
        System.out.println(of3.getName()+" and price is: "+of3.getPrice());
    }
}