

abstract class HumanAction extends Actions{
    HumanAction(Guys p, String n){
        super(p, n);
    }
    public void getTypeAndName(){
        System.out.print(getType()+"");
        System.out.print(getName());
    }

    public void admired(String Admired){
        this.getTypeAndName();
        System.out.println(Admired);
    }
    public void idea(String ide){
        this.getTypeAndName();
        System.out.println(ide);
    }
    public void believed(String belive){
        this.getTypeAndName();
        System.out.println(belive);
    }
    public void Sattle(String sitt){
        this.getTypeAndName();
        System.out.println(sitt);

    }
    public void point(String po){
        this.getTypeAndName();
        System.out.println(po);
    }
    public void asked(String ask){
        this.getTypeAndName();
        System.out.println(ask);
    }
    public void laughed(String lau){
        this.getTypeAndName();
        System.out.println(lau);
    }
    public void Swallowed(String Swal){
        this.getTypeAndName();
        System.out.println(Swal);
    }
    public void ate(String eat){
        this.getTypeAndName();
        System.out.println(eat);
    }
    public void stretched(String stre){
        this.getTypeAndName();
        System.out.println(stre);
    }
    public void want(String wan){
        this.getTypeAndName();
        System.out.println(wan);
    }
    public void like(String lak){
        this.getTypeAndName();
        System.out.println(lak);
    }
    public void put(String pu){
        this.getTypeAndName();
        System.out.println(pu);
    }
    public void took(String take){
        this.getTypeAndName();
        System.out.println(take);
    }
    public void went(String go){
        this.getTypeAndName();
        System.out.println(go);
    }
}
