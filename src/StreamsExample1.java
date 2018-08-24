import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class StreamsExample1{
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(0);l.add(10);l.add(20);
        l.add(5);l.add(15);l.add(25);


        //For filtering value from collection
        List l2 = l.stream().filter(i->i%2==0).collect(Collectors.toList()); 
        System.out.println(l2);

        //applying operation on collection objects
        List l3 = l.stream().filter(i->i%2==0).map(i->i*2).collect(Collectors.toList());
        System.out.println(l3);

        //Sorted Method
        List l4 = l.stream().sorted().collect(Collectors.toList()); 
        System.out.println(l4);

        //custom Sorting (- sign) for reverse sort
        List l5 = l.stream().sorted((i1,i2)->-i1.compareTo(i2)) .collect(Collectors.toList()); 
        System.out.println(l5);

        //min or max value from list note: list should always be a sorted list
        Integer l6 = l.stream().min((i1,i2)->-i1.compareTo(i2)).get();
        System.out.println(l6);

        //forEach method in Streams
        l.stream().forEach(System.out::println);

        l.stream().forEach((k)->{
            System.out.println("Item : " + k);
            if(k.equals(10)){
                System.out.println("Hello 10");
            }
        });


    }
}