public class CustomerManager {
    private BaseLogger logger;//isteğe göre, farklı yerlerde kullanılabilmesi için referans gösterdim.

    public CustomerManager(BaseLogger logger){
    this.logger=logger;     // 'constructor' sayesinde, main kısmında isteğe göre
                            // email,console,database vb. yerleri kullanabiliriz.
    }


    public void add(){
        this.logger.log("customer added");
    }

}
