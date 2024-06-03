package inheritances.single;

public class programming {
    String lang_Name;
    String Author_name;
    float version;


    public programming() {
        System.out.println("+++++++++++++++++++++++++++");
    }

    public programming(String lang_Name, String author_name, float version) {
        this.lang_Name = lang_Name;
        Author_name = author_name;
        this.version = version;
    }
    void printInfo(){
        System.out.println("program Info ->" + this.version + "author    "  + this.Author_name + "language   " + this.lang_Name);
    }
}
