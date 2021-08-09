public class Course {
    String name;
    String code; 
    String prefix;
    Teacher teach;
    int sozluNotu;
    int note;
    

     Course(String name, String code, String prefix ) {
    

        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note=0;
        
        
    }
    void addTeacher(Teacher teach){
        
        if(teach.branch.equals(this.prefix)){
            this.teach=teach;
        }
        else{
            System.out.println("Öğretmen ve Bölüm Uyuşmuyor. ");
        }
      

    }
    void printTeacherInfo(){
        this.teach.print();
    }
    
}

