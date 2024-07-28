public class HelloWorld {
    public static void main(String[] args) {

        System.out.println("Hello World!");
        System.out.println("Hello");
    }
    public String encode(String name){
        name = name
                .replace("e","1")
                .replace("u","2")
                .replace("i","3")
                .replace("o","4")
                .replace("a","5");
        return "NOTFORYOU"+name+"YESNOTFORYOU";
    }
    public String decode(String name){
        name = name
                .replace("1","e")
                .replace("2","u")
                .replace("3","i")
                .replace("4","o")
                .replace("5","a")
                .replace("YESNOTFORYOU","")
                .replace("NOTFORYOU","");

        return name;

    }


}
