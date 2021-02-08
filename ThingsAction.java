abstract class ThingsAction extends Actions {
    ThingsAction(Guys p, String n){
        super(p, n);

    }
    public void getTypeAndName(){
        System.out.print(getType()+ " ");
        System.out.print(getName());
    }


    public void exhausted(String exhausted){
        this.getTypeAndName();
        System.out.println(exhausted);
    }

    public void calmed_down(String clam){
        this.getTypeAndName();
        System.out.println(clam);
    }

    public void reigned(String reign){
        this.getTypeAndName();
        System.out.println(reign);
    }

    public void eruption(String erup){
        this.getTypeAndName();
        System.out.println(erup);
    }







}
