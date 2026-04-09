public class Value<T> extends Expression{
    protected T elem;
    public Value(T elem){
        this.elem = elem;
    }
    public Value(){
        this(null);
    }
    public T getElem() {
        return elem;
    }

    public String toString(){
        return ""+elem;
    }

    @Override
    public int getRuntime() {
        return 0;
    }
}
