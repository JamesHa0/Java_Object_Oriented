package work19;

class Book {
    private String id;
    private String name;
    private Double price;
    private String type;
    private String author;

    public Book(String id, String name, Double price, String type, String author) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public String getname() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass()!= o.getClass()) return false;

        Book book = (Book) o;

        if (id!= null?!id.equals(book.id) : book.id!= null) return false;
        if (name!= null?!name.equals(book.name) : book.name!= null) return false;
        if (price!= null && book.price!= null &&!price.equals(book.price)) return false;
        if (type!= null?!type.equals(book.type) : book.type!= null) return false;
        return author != null? author.equals(book.author) : book.author == null;
    }

    @Override
    public int hashCode() {
        int result = id!= null? id.hashCode() : 0;
        result = 31 * result + (name!= null? name.hashCode() : 0);
        result = 31 * result + (price!= null? price.hashCode() : 0);
        result = 31 * result + (type!= null? type.hashCode() : 0);
        result = 31 * result + (author != null? author.hashCode() : 0);
        return result;
    }
}

