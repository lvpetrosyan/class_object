class Books {
    private String name;
    private String author;
    private String publication;

    public Books(String author, String name, String publication) {
        this.author = author;
        this.name = name;
        this.publication = publication;

    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public String getPublication() {
        return publication;
    }
}