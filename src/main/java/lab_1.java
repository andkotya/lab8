 class Lab1 {
         public static void main(String[] args) {

                   Stock s1 = new Stock();
                   Stock s2 = new Stock();
                   Stock s3 = new Stock();


                   s1.setName("AirPods");
                   s1.setProduct(true);
                   s1.setPrice(100);
                   String s = s1.getName();
                   System.out.println("Информация о складе " + s);
                   s1.Print();

                   s2.setName("iPhone");
                   s2.setProduct(false);
                   s2.setPrice(1500);
                   s = s2.getName();
                   System.out.println("Информация о складе " + s);
                   s2.Print();

                   s3.setName("MacBook");
                   s3.setProduct(true);
                   s3.setPrice(3000);
                   s = s3.getName();
                   System.out.println("Информация о складе " + s);
                   s3.Print();
         }
}
 class Stock {
    private String name;
                     private boolean product;
                     private int price;
              public void setName(String name){
                  this.name = name;
       }
       public void setProduct(boolean product) {
                  this.product = product;
              }
              public void setPrice(int price){
                  this.price = price;
              }

              public Stock() {
       }
             public String getName() {
                  return name;
}
            public boolean isProduct() {
                  return product;
              }

              public int getPrice() {
                  return price;
              }

              public void Print() {
                  System.out.println("Наименование: " + name);
                  if(product){
                      System.out.println("Есть товар.");
                  }else{
                      System.out.println("Нет товара.");
                  }
                  System.out.println("Цена: " + price);
       }
}