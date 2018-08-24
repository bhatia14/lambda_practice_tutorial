interface ConstructorRef{
    public Sample getObject();
}

class Sample {
    public Sample(){
        System.out.println("Hello I am called in Sample");
    }
}


class Main{
    public static void main(String[] args) {
        ConstructorRef constructorRef = Sample::new;
        //Sample s= constructorRef.getObject();
        //s.hashCode();
    }
}