import javax.print.PrintException;

public class MyList<T> {
    private int size;
    private int defaultSize ;
    private T [] array ;

    public MyList() {
        array = (T[]) new Object[10];
        this.defaultSize = array.length;
    }

    public MyList(int capacity) {
        if (capacity > 0){
            array = (T[]) new Object[capacity];
            this.defaultSize= array.length;
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if (size > 0 ){
            this.size = size;
        }
        System.out.println("yanlış değer girdiniz.");
    }

    public int getCapacity() {
        return defaultSize;
    }

    public void setCapacity(int defaultSize) {
        if (defaultSize > 0){
            this.defaultSize = defaultSize;
        } else
        System.out.println("yanlış değer girdiniz.");
    }

    public void add(T item){
        if (this.size == array.length){
          T [] newList = (T[]) new Object[array.length*2];
            for (int i = 0; i < array.length; i++) {
                newList[i]= array[i];
            }
            array=newList;
            this.defaultSize = newList.length;
        }


        array[size] = item;
        size++;
    }

    public T get(int index) {
        if (index - 1 < this.array.length){
            System.out.println(index + " değerinde " +array[index-1] +" ögesi bulunmaktadır.");
            return array[index-1];
        }
        
        return null;
    }

    public void remove(int index){

        if (index-1 <= this.array.length && index-1 >0){
            T [] newArray = (T[]) new Object[this.defaultSize];
            for (int i = 0,j = 0; i < this.array.length; i++,j++) {
                if (i == index-1){
                    i++;
                    this.size = this.size - 1;
                }
                newArray[j]=array[i];
            }

            array= newArray;

        }


    }

    public void printString(){  
        for (int i = 0; i < this.array.length; i++) {
            if(array[i]==null){
                System.out.print(""); } else
                System.out.println(array[i] + " "+ " ");
              
        } 
    }

    public void set(int index,T data){
        if (index <= this.array.length-1 && index >0 ){
            this.array[index]=data;
        }

    }

    public int indexOf(T data){
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i]==data){
                return i+1;
            }
        }
        return -1;
    }

    public boolean isEmpty(){
        if (this.getSize()==0){
            
            System.out.println("Dizi şu anda boştur");
            return true;
            
        }
        System.out.println("Dizi boş değildir ! ");
        return false;
    }

    public void clear(){
        for (int i = 0; i < this.array.length; i++) {
            remove(i);
        }
        this.size = 0;
        System.out.println("Tüm dizi temizlenmiştir. ");
        System.out.println("Listenin Şu anki Boyutu : "+ getSize());
        setCapacity(1);
        System.out.println("Listenin Şu anki Kapasitesi : " + getCapacity());
        isEmpty();
    }

    public boolean contains(T data){
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] == data){
                System.out.println("Bu dizi " +data + " ögesini içerir");
                return true;
            }
        }
        return false;
    }
}