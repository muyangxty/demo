package cn.itcast.elasticsearch.pojo;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Data
/**
 * Document注解参数
 * indexName 索引库名称
 * type 对应表
 * shards 分片
 * replicas 副本
 */
@Document(indexName = "item", type = "docs", shards = 1, replicas = 0)
public class Item {
    @Id
    Long id;
    //Filed标记该属性是Elasticsearch的一个字段 type-对应类型
    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    String title; //标题
    @Field(type = FieldType.Keyword)
    String category; // 分类
    @Field(type = FieldType.Keyword)
    String brand; // 品牌
    @Field(type = FieldType.Double)
    Double price; // 价格
    @Field(type = FieldType.Keyword, index = false)
    String images; // 图片地址

    public Item() {
    }

    public Item(Long id, String title, String category, String brand, Double price, String images) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.brand = brand;
        this.price = price;
        this.images = images;
    }
}