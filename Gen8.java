class A {}
class B extends A {}
class C extends B {}
class Algo<T extends A> {}
class Gen8 {
    public static void processOne(Algo<?> obj) {}   //Algo<A>, Algo<B>, Algo<C>
    public static void processTwo(Algo<? extends B> obj) {} //Algo<B>, Algo<C>
    public static void processThree(Algo<? super B> obj) {} //Algo<A>, Algo<B>
    
    public static void main(String args) {
        Algo<A> objA = new Algo<>();
        Algo<B> objB = new Algo<>();
        Algo<C> objC = new Algo<>();
        processOne(objA);
        processOne(objB);
        processOne(objC);

        //ERROR processTwo(objA);
        processTwo(objB);
        processTwo(objC);

        processThree(objA);
        processThree(objB);
        // ERROR processThree(objC);
    
    }
}
