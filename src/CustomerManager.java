public class CustomerManager {
    private BaseLogger logger;//isteğe göre, farklı yerlerde kullanılabilmesi için referans gösterdim.

    public CustomerManager(BaseLogger logger){
    this.logger=logger;     //main kısmında isteğe göre ve constructor sayesinde
                            // email,console,database vb. yerleri kullanabiliriz.
    }


    public void Add(){
        this.logger.Log("customer added");
    }

}
