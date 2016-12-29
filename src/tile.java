import java.util.*;
/* This class is a data structure that can hold valid solutions on a tile */
public class tile{
  int size;
  List<Integer> numbers;

  // Constructor
  public tile(){
    size = 9;
    numbers = new ArrayList<Integer>();
    for (int i=1;i<=9;i++){numbers.add(i);}
  }

  public int size(){
    return size;
  }

  public List<Integer> getArrayList(){
    return numbers;
  }

  /* If the number is not in the list, do nothing*/
  public void remove(int num){
    if (numbers.contains(num)){
      size--;
      int numIndex = numbers.indexOf(num);
      numbers.remove(numIndex);
    }
  }

  /* Removes all elements from a list*/
  public void clear(){
    size = 0;
    numbers.clear();
  }

  public boolean contains(int num){
    if (numbers.contains(num)){
      return true;
    }else{
      return false;
    }
  }

  /*Call this only when getSize() == 1*/
  // HACK: This should really throw an exception
  public int lastNumber(){
    if(this.size() == 1){
      return numbers.get(0);
    }else{
      return 99; 
    }
  }

}
