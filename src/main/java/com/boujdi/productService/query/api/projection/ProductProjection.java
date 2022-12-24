package com.boujdi.productService.query.api.projection;

import com.boujdi.productService.command.api.data.Product;
import com.boujdi.productService.command.api.data.ProductRepository;
import com.boujdi.productService.command.api.model.ProductRestModel;
import com.boujdi.productService.query.api.queries.GetProductQuery;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.stereotype.Component;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductProjection {
 private ProductRepository productRepository;

    public ProductProjection(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @QueryHandler
    public List<ProductRestModel> handle(GetProductQuery getProductQuery) {
     List<Product> products = productRepository.findAll();
     List<ProductRestModel> productRestModels = products.stream().map(
             product -> ProductRestModel.builder()
                         .name(product.getName())
                         .price(product.getPrice())
                         .quantity(product.getQuantity())
                         .build()
                        ).collect(Collectors.toList());
     return productRestModels;
    }
}
