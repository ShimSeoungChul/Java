package NestedClass;

public class NestedClassClient {
    public static void main(String[] args){
        NestedClassClient client = new NestedClassClient();
        client.makeInnerObject();
    }

    public void makeInnerObject(){
        OuterOfInner outer = new OuterOfInner();
        OuterOfInner.Inner inner = outer.new Inner();
        inner.setValue(3);
        System.out.println(3);
    }

    public void makeStaticNestedObj(){
        OuterOfStatic.StaticNested staticNested = new OuterOfStatic.StaticNested();
        staticNested.setValue(3);
        System.out.println(staticNested.getValue());
    }
}
