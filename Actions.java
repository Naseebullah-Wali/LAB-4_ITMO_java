

abstract class Actions implements IObject, ICompasion {
    Guys type;
    String name;

    Actions(Guys p,String n){
        type=p;
        name=n;
    }
    public Guys getType(){

        return type;
    }
    public String getName(){
        return name;
    }
    public String haveName() throws Nameexception{
        if (name==""){
            throw new Nameexception("Without name");
        } else{
            return name;
        }
    }
    public String toString(){
        return getName()+type;
    }



    public boolean equals(Object obj){
        return (this.hashCode()==obj.hashCode());
    }

    public int hashCode() {
        return getName().hashCode()+type.hashCode();

    }
}
