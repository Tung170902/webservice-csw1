package com.example.webservicecsw1.resource;

import com.example.webservicecsw1.entity.Product;
import com.example.webservicecsw1.model.MysqlProductModel;
import com.example.webservicecsw1.model.ProductModel;

import javax.ws.rs.*;
import java.util.List;


@Path("/product")
@Produces("application/json")
@Consumes("application/json")

public class ProductResource {
    ProductModel productModel;

    public ProductResource() {
        productModel = (ProductModel) new MysqlProductModel();
    }

    @GET
    public List<Product> fillAll(){
        return productModel.getProduct();
    }

    @POST
    public boolean addEmployees(Product product){
        return productModel.addProduct(product);
    }

    @PUT
    @Path("{id}")
    public boolean updateEmployee(@PathParam("id") int id, Product updateProduct){
        return productModel.updateProduct(updateProduct, id);
    }
}
