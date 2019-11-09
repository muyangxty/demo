package cn.itcast.elasticsearch;

import cn.itcast.elasticsearch.pojo.Item;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

//ElasticsearchRepository 泛型第一个参数为实体类， 第二个参数主键的类型
public interface ItemRepository extends ElasticsearchRepository<Item, Long> {

    List<Item> findByTitle(String title);

    List<Item> findByPriceBetween(Double d1, Double d2);
}
