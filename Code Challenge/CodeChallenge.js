window.onload = function() {

    document.getElementById
}

function Book(title, author, genre) {
    this.title = title;
    this.author = author;
    this.genre = genre;
}
let bookshelf = [];

function addBook(Book) {
    bookshelf.push(Book);
}

function deleteBook() {
    temp = bookshelf.indexOf(Book.title);
    delete bookshelf[temp];
}

function viewBooks() {
    console.log(bookshelf);
}