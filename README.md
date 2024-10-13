# Snobby Sorting
<!--- Your assignment is available [here](https://docs.google.com/document/d/1iJGqefga_4C8mRjUBNTLTXqj-YSTO5zywtqEaQ3HaDA/edit#) --->



## Introduction

In today's mostly egalitarian society, you don't think much of royal titles, unless you are an ardent royalty watcher that perks up at every mention of Buckingham Palace. It's surprising to find out how much of the hierarchy of nobility is descended from that of ancient Rome. The list below indicates the noble rank in ancient Rome. Most of Europe today uses this same structure, with some [variation](https://www.titlemax.com/discovery-center/money-finance/royal-titles-around-the-world/).



* Imperator/Caeser (Emperor)
* Rex/Regina (King/Queen)
* Magnus Dux/Magna Ducissa (Grand Duke/Grand Duchess)
* Archidux/Archiducissa (Archduke/Archduchess)
* Dux/Ducissa (Duke/Duchess)
* Princeps/Principissa (Prince/Princess, literally meaning “leading citizen”)
* Prorex/Proregina (Viceroy/Vicereine)
* Marchio/Marchionissa (Marquees/Marchioness)
* Comes/Comitissa (Earl/Countess)supplement
* Vicecomes/Vicecomitissa (Viscount/Viscountess)
* Baro/Baronissa (Baron/Baroness)
* Eques (Knight/Dame)
* Nobilis Homo (Gentleman/Lady)


## Noble Names

In our version of ancient Rome, everyone has a first name and a last name. In addition, everyone has a title, including the non-nobles. If your name is "Jane Doe", then you automatically have a title of "Nemo", which literally means None in Latin. So just "Jane Doe", or "Nemo Jane Doe" is your everyday working everywoman in our version of ancient Rome.

Some families have a penchant for naming their kids after themselves, in which case you will have generation qualifiers after names. For example, "Jane Doe" may name her daughter "Jane Doe II", and all the way to the tenth generation. Roman numerals are used for generation names.


<table>
  <tr>
   <td>Generation
   </td>
   <td>Roman Numeral
   </td>
  </tr>
  <tr>
   <td>First
   </td>
   <td>(None)
   </td>
  </tr>
  <tr>
   <td>Second
   </td>
   <td>II
   </td>
  </tr>
  <tr>
   <td>Third
   </td>
   <td>III
   </td>
  </tr>
  <tr>
   <td>Fourth
   </td>
   <td>IV
   </td>
  </tr>
  <tr>
   <td>Fifth
   </td>
   <td>V
   </td>
  </tr>
  <tr>
   <td>Sixth
   </td>
   <td>VI
   </td>
  </tr>
  <tr>
   <td>Seventh
   </td>
   <td>VII
   </td>
  </tr>
  <tr>
   <td>Eighth
   </td>
   <td>VIII
   </td>
  </tr>
  <tr>
   <td>Ninth
   </td>
   <td>IX
   </td>
  </tr>
  <tr>
   <td>Tenth
   </td>
   <td>X
   </td>
  </tr>
</table>



## Ordering

When you throw a big Roman party, everyone in a rank conscious society like ancient Rome will want to know how to sort themselves. The sort order is as follows:



1. Noble title comes first, with Caesar (Emperor) leading, all the way down to Nemo (non-noble).  For example, Proregina Kim Kardie comes before Marchionissa Kim Kardie.
2. Then sort by last name. For example, Eques Abbie Roman will come before Eques Abbie Super (R before S).
3. Then sort by first name. Comitissa Abbie Roman comes before Comitissa Bailey Roman.
4. Then sort by generation.  For example, Baronissa Jane Doe will come before Baronissa Jane Doe II.


## Sorting Algorithm

Now that we know the order, we need an algorithm to sort Roman nobility. The sort method we use is very similar to [Radix sort](https://en.wikipedia.org/wiki/Radix_sort). In Radix sort, you **sort in several passes**, going from the least significant digit to the most significant digit. Applied to ancient Roman nobility, we sort in four passes. The first sort is by generation, then by first name, then by last name, then by title.

Each pass of the sort should be [stable](https://en.wikipedia.org/wiki/Category:Stable_sorts#:~:text=Stable%20sorting%20algorithms%20maintain%20the,S%20in%20the%20sorted%20list.), that is, when two elements are the same in rank, they should not change places in the sort order. Stability is important to preserve order in sorting algorithms that have multiple passes over the same data set, as in our case.


## Your Task

Your task is to implement the class NobleNameSorter in **NobleNameSorter.java**. You should make use of the Title and Generation [enumerations](https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html) that have been defined for you.


### Titles

Ancient Roman titles are enumerated for you in **Title.java**. To simplify things, we use only the feminine titles, for example, we only use Regina, Principissa and Marchionissa, and elide Rex, Princeps and Marchio.


### Generations

Generations are enumerated for you in **Generation.java**. 


### NobleName

The class NobleName in NobleName.java encapsulates a four part name of a noble and commoner in ancient Rome.



* **public NobleName(String fullName)** -- Create a NobleName object from the fullName string that was given
    * If the fullName was "Caesar Julius Foo III", then the title is Title.Caesar, the first name is Julius, the last name is Foo, and the generation is Generation.III.  
    * If the fullName was "Jane Fonda", then the title is Title.Nemo, the first name is Jane, the last name is Fonda, and the generation is Generation.Nemo.
* **public Title getTitle()** -- Return the title enum for the name, or Title.Nemo if there was no title.
* **public String getFirstName()** -- Return the first name of the noble
* **public String getLastName()** -- Return the last name of the noble
* **public Generation getGeneration()** -- Return the enum Generation for the name, or Generation.Nemo if there was no generation.


## NobleNameSorter

You have to implement these methods in the NobleNameSorter class.



* **public NobleNameSorter()** - Create a noble name sorter object that sorts ancient Roman noble names
* **public void add(String name)** -- Add the name to the list of names to be sorted. You can assume that all names are added before any sort function is called.
* **public ArrayList&lt;String> getNames()** -- Return the list of names in the currently sorted order
* **public void sort()** -- Sort the noble name. This method works in four passes. 
    1. The first time you call sort, it will sort by the generation
    2. The second time you call sort, it will sort by the first name
    3. The third time you call sort, it will sort by the last name
    4. The last time you call sort, it will sort by the title.

For example, if you add these names to be sorted, then call sort four times, printing out the order of names each time:


```
        NobleNameSorter sorter = new NobleNameSorter();
        sorter.add("Jayne Wayne II");
        sorter.add("Jane Wayne");
        sorter.add("Ducissa Jane Wayne");
        sorter.add("Baronissa Rose Zoo");

        sorter.sort();
        System.out.println("Pass 1: " + sorter.getNames());
        sorter.sort();
        System.out.println("Pass 2: " + sorter.getNames());
        sorter.sort();
        System.out.println("Pass 3: " + sorter.getNames());
        sorter.sort();
        System.out.println("Pass 4: " + sorter.getNames());
```


The output looks like the list below:


```
Pass 1: [Jane Wayne, Ducissa Jane Wayne, Baronissa Rose Zoo, Jayne Wayne II]
Pass 2: [Jane Wayne, Ducissa Jane Wayne, Jayne Wayne II, Baronissa Rose Zoo]
Pass 3: [Jane Wayne, Ducissa Jane Wayne, Jayne Wayne II, Baronissa Rose Zoo]
Pass 4: [Ducissa Jane Wayne, Baronissa Rose Zoo, Jane Wayne, Jayne Wayne II]
```


Each pass of the sort() function should sort on the appropriate part of the noble name. Remember, you sort in pass 1 by the generation, in pass 2 by the first name, in pass 3 by the last name, and in pass 4 by the title. **You can use any of the algorithms in the [Java Collections framework](https://docs.oracle.com/javase/tutorial/collections/intro/index.html) to sort in the individual passes.** It has to be a **stable sort**, so that elements with equal keys maintain the same relative order.


## Testing

There is a small test program in main in NobleNameSorter.java. Run it with

	make run

The automated tests are in Test/NobleNameTest.java. Run the automated tests with

	make test
