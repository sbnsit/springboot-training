# Collections in Java

Any group of individual objects which are represented as a single unit is known as the collection of the objects.

In Java, a separate framework named the "Collection Framework" has been defined - which holds all the collection classes and interfaces in it.

java.util.Collection and java.util.Map and the root interfaces of the Java Collection classes.


The Collections framework contains the following main interfaces:

* List
* Set
* Queue
* Map


## List

#### ArrayList
It provides us with dynamic arrays in Java. Though, it may be slower than standard arrays but can be helpful in programs where lots of manipulation in the array is needed. The size of an ArrayList is increased automatically if the collection grows or shrinks if the objects are removed from the collection.
Java ArrayList allows us to randomly access the list. ArrayList can not be used for primitive types, like int, char, etc. We will need a wrapper class for such cases. 
Lets understand the arraylist with the following example


```
// Java program to demonstrate the
// working of ArrayList in Java
  
import java.io.*;
import java.util.*;
  
class GFG {
    public static void main(String[] args)
    {
  
        // Declaring the ArrayList with
        // initial size n
        List<Integer> al
            = new ArrayList<Integer>();
  
        // Appending new elements at
        // the end of the list
        for (int i = 1; i <= 5; i++)
            al.add(i);
  
        // Printing elements
        System.out.println(al);
  
        // Remove element at index 3
        al.remove(3);
  
        // Displaying the ArrayList
        // after deletion
        System.out.println(al);
  
        // Printing elements one by one
        for (int i = 0; i < al.size(); i++)
            System.out.print(al.get(i) + " ");
    }
}

```

**Output**

```
[1, 2, 3, 4, 5]
[1, 2, 3, 5]
1 2 3 5

```



#### LinkedList
Is an implementation of the LinkedList data structure which is a linear data structure where the elements are not stored in contiguous
locations and every element is a separate object with a data part and address part. The elements are linked using pointers and addresses.
Each element is known as a node. Lets understand the LinekdList with the following example:


```
// Java program to demonstrate the
// working of LinkedList in Java
  
import java.io.*;
import java.util.*;
  
class GFG {
    public static void main(String[] args)
    {
  
        // Declaring the LinkedList
        List<Integer> ll
            = new LinkedList<Integer>();
  
        // Appending new elements at
        // the end of the list
        for (int i = 1; i <= 5; i++)
            ll.add(i);
  
        // Printing elements
        System.out.println(ll);
  
        // Remove element at index 3
        ll.remove(3);
  
        // Displaying the List
        // after deletion
        System.out.println(ll);
  
        // Printing elements one by one
        for (int i = 0; i < ll.size(); i++)
            System.out.print(ll.get(i) + " ");
    }
}

```

**Output**

```
[1, 2, 3, 4, 5]
[1, 2, 3, 5]
1 2 3 5

```

## Set

A set is an unordered collection of objects in which duplicate values cannot be stored. 
This collection is used when we wish to avoid the duplication of the objects and wish to store only the unique objects.
This set interface is implemented by various classes like HashSet, TreeSet, LinkedHashSet, etc.
Since all the subclasses implement the set, we can instantiate a set object with any of these classes.

#### HashSet

The HashSet class is an inherent implementation of the hash table data structure.
The objects that we insert into the HashSet do not guarantee to be inserted in the same order.
The objects are inserted based on their hashcode. This class also allows the insertion of NULL elements. Let’s understand HashSet with an example:

```
// Java program to demonstrate the
// working of a HashSet
  
import java.util.*;
public class HashSetDemo {
    public static void main(String args[])
    {
        // Creating HashSet and
        // adding elements
        Set<String> hs = new HashSet<String>();
  
        hs.add("Geeks");
        hs.add("For");
        hs.add("Geeks");
        hs.add("Is");
        hs.add("Very helpful");
  
        // Traversing elements
        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

```

**Output**

```
Very helpful
Geeks
For
Is
```

## Queue

```
// create an abstract class

abstract class Language {
  // fields and methods
}

// try to create an object Language
// throws an error
Language obj = new Language(); 

```

## Map

A map is a data structure which supports the key-value pair mapping for the data. 
This interface doesn’t support duplicate keys because the same key cannot have multiple mappings. 
A map is useful if there is a data and we wish to perform operations on the basis of the key. 
This map interface is implemented by various classes like HashMap, TreeMap etc. 
Since all the subclasses implement the map, we can instantiate a map object with any of these classes.

#### HashMap

HashMap provides the basic implementation of the Map interface of Java. It stores the data in (Key, Value) pairs. 
To access a value in a HashMap, we must know its key. HashMap uses a technique called Hashing. 
Hashing is a technique of converting a large String to small String that represents the same String so that the indexing and search operations are faster. 
HashSet also uses HashMap internally. Let’s understand the HashMap with an example:

```
// Java program to demonstrate the
// working of a HashMap
  
import java.util.*;
public class HashMapDemo {
    public static void main(String args[])
    {
        // Creating HashMap and
        // adding elements
        HashMap<Integer, String> hm
            = new HashMap<Integer, String>();
  
        hm.put(1, "Geeks");
        hm.put(2, "For");
        hm.put(3, "Geeks");
  
        // Finding the value for a key
        System.out.println("Value for 1 is " + hm.get(1));
  
        // Traversing through the HashMap
        for (Map.Entry<Integer, String> e : hm.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
    }
}

```

**Output**

```
Value for 1 is Geeks
1 Geeks
2 For
3 Geeks
```

