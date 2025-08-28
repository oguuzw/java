public class book {
    public String bookName , author , publisher;  // author = yazar , publisher = yayinci
    private int numberOfPage;

    book(String bookName,String author , String publisher, int numberOfPage){
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;

        if(numberOfPage<0){
            this.numberOfPage = - numberOfPage;
        }else{
            this.numberOfPage = numberOfPage;
        }
    }

    public void getnumberOfPage(){
        System.out.println("sayfa sayisi : " + numberOfPage);
    }

    //numberOfSize private olarak ayarlanmasina ragmen bu metot sayesinde main icinde degistirebiliriz.
    public void setNumberOfPage(int size){
        if(size < 1 ){
            System.out.println("page size cant be negative!");
        }else{
            this.numberOfPage = size;  //burdaki size numberOfSize yerine gelecek yeni deger
        }
    }
}
