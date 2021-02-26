public class ProductDB {

    public static Product getProduct(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or database
        // For now, this code just uses if/else statements
        // to return the correct product data

        // create the Product object
        Product product = null;

        // fill the Product object with data
        //product.setCode(productCode);
        if (productCode.equalsIgnoreCase("java")) {
            //product.setDescription("Murach's Java Programming");
            //product.setPrice(57.50);
            product = new Product("Java", "Murach's Java Programming",57.50);
        } else if (productCode.equalsIgnoreCase("jsp")) {
            //product.setDescription("Murach's Java Servlets and JSP");
            //product.setPrice(57.50);
        	product = new Product("jsp", "Murach's Java Servlets and JSP",57.50);
        } else if (productCode.equalsIgnoreCase("mysql")) {
            //product.setDescription("Murach's MySQL");
            //product.setPrice(54.50);
        	product = new Product("mysql", "Murach's MySQL",54.50);
        } else if (productCode.equalsIgnoreCase("bobslemon")) {
                //product.setDescription("Bob's Lemonade");
                //product.setPrice(14.82);
                product = new Product("bobslemon", "Bob's Lemonade",14.82);
        } else {
            product.setDescription("Unknown");
        }
        return product;
    }
}