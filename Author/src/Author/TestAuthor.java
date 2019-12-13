package Author;

public class TestAuthor {
    public TestAuthor() {
    }

    public static void main(String[] args) {
        Author a1 = new Author("Anna", "anialozina428@gmail.com", 'R');
        System.out.println(a1);
        a1.setEmail("anialozina428@gmail.com");
        System.out.println(a1);
    }
}