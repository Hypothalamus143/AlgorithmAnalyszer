public class Variable<T> extends Value{
    private String name;
    public Variable(String name, T elem){
        super(elem);
        this.name = name;
    }
    public Variable(String name){
        super();
        this.name = name;
    }
    public void setElem(T elem){
        this.elem = elem;
    }

    public String toString() {
        if(elem == null)
            return name;
        else return super.toString();
    }
}
