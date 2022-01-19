public class Student<T> implements IDatabase<T> {


    @Override
    public boolean insert(T data) {
     
        System.out.println("veri eklendi ");
        System.out.println(data);
        return true;
    }

    @Override
    public boolean delete(T data) {
        System.out.println("veri silindi ");
        System.out.println(data);
        return true;
    }

    @Override
    public boolean update(T data) {
        
        System.out.println("veri güncellendi  ");
        System.out.println(data);
        return true; 
    }

    @Override
    
    public T select() {
        System.out.println("veri çekildi  ");
        return null;
    }
    
   
}
