package com.selab.categoryprogram.MongoDBSchema;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("db.metadata.product.db")
@Getter
@Setter
public class COMISDoc_db {
    @Id
    private String _id;
    private String _class;
    @Field("header")
    private HeaderVO headerVO;
}

